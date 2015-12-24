package ppms.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Result;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import ppms.daoimpl.BaseDaoImp;
import ppms.domain.TbInnovation;
import ppms.excel.CommonExcelParser;
import ppms.excel.template.IExcelTemp;
import ppms.exception.ErrorInfo;
import ppms.exception.ExcelParserException;
import ppms.serviceimpl.InvocationServiceImp;

import com.google.gson.Gson;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Excel文件批量上传Action
 * 
 * @author shark
 * @update 2015下午4:31:58
 * @function
 * 
 */
public class FileAction extends ActionSupport {

	/**
	 * 上传的Excel文件
	 */
	private File file;
	private String fileFileName;
	private String expect;

	private ExcelParserException exception;
	@Autowired
	private InvocationServiceImp service;
	@Autowired
	@Qualifier("baseDaoImp")
	private BaseDaoImp dao;

	public FileAction() {
		this.exception = new ExcelParserException();
	}

	public String getExpect() {
		return expect;
	}

	public void setExpect(String expect) {
		this.expect = expect;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}


	@org.apache.struts2.convention.annotation.Action(value = "/upload", results = {
			@Result(name = "error", location = "/WEB-INF/content/page/error.jsp") })
	public String upload() throws Exception {
		
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpServletResponse response=ServletActionContext.getResponse();
		Map<String, Object> result = null;
		ExcelParserException exception=null;
		ExcelParserException exception1 = new ExcelParserException();
		String fileName = null;
		FileInputStream inFile = new FileInputStream(file);;
		HSSFWorkbook workbook = null;
		
		try {

			fileName = fileFileName;
			if (!fileName.endsWith(".xls")) {

				exception1.addErrorInfo(new ErrorInfo("文件导入失败，文件名" + fileName
						+ "不符合，请导入.xls格式文件"));
			} else {
				expect = new String(expect.getBytes("iso8859-1"), "utf-8");
				if (expect.equals("ignore")) {
				
				} else {
					if (expect.equals(fileName)) {
						result = new CommonExcelParser(
									request, dao).toObjs2(inFile, fileName, null);
						
					} else {
						exception.addErrorInfo(new ErrorInfo("该页面要求上传" + expect
								+ "，你上传的是" + fileName + ",请检查"));
						System.out.println(expect + "不是" + fileName + "请检查");
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(result!=null){
				exception=(ExcelParserException) result.get("exceptions");
				if(exception!=null){
					if (exception.getErrors().size() > 0) {
						workbook=(HSSFWorkbook) result.get("wb");
						
						HSSFSheet sh=workbook.getSheetAt(0);
						HSSFRow tempRo;
						HSSFRow ro;
						HSSFCell cell;
						int index=1;
						for(int i=1;i<=sh.getLastRowNum();i++){
							if(sh.getRow(i)!=null){
								
								if(index!=i){
									ro=sh.getRow(i);
									tempRo=sh.createRow(index);
									for(int j=0;(cell=ro.getCell(j))!=null;j++){
										
										if(cell.getCellType()==HSSFCell.CELL_TYPE_STRING){
											tempRo.createCell(j).setCellValue(changeCellToString(cell));
										}
										if(cell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC){
											tempRo.createCell(j).setCellValue(Double.parseDouble(changeCellToString(cell)));
										}else{
											tempRo.createCell(j).setCellValue(changeCellToString(cell));
										}
										tempRo.getCell(j).setCellStyle(cell.getCellStyle());
									}
									index=index+1;
									sh.removeRow(ro);
								}
							}
						}
						ServletContext servletContext =ServletActionContext.getServletContext();
						String path = servletContext.getRealPath("/")
								+ "/template/error/";

						File temp = new File(path);
						 
						 if(!temp.exists()){
							 temp.mkdirs();
						 }
						 path = servletContext.getRealPath("/")
									+ "/template/error/"+ fileName;
						 temp= new File(path);
						if (!temp.exists()) {
							temp.createNewFile();
						}
						FileOutputStream outputStream = new FileOutputStream(
								temp);
						workbook.write(outputStream);
						outputStream.flush();
						outputStream.close();
						System.out.println(fileName);
						response.getWriter().write("{\"fileName\":\""+fileName+"\"}");
						throw new RuntimeException("上传错误，请下载错误提示文件");
							
						}
				}
			}
			
			if(exception1.getErrors().size()>0){
				String msg="";
				for (ErrorInfo info : exception1.getErrors()) {
					msg+=info+"\n\r";
				}
				response.getWriter().write(msg);
				throw new RuntimeException("上传错误，请下载错误提示文件");
				
			}
			
		}
		return null;
	}
	
	/**
	 * 根据单元格中的数据类型获取数据
	 * 
	 * @param cell
	 *            单元格对象
	 * @return
	 */
	private String changeCellToString(HSSFCell cell) {

		String returnValue = "";
		if (null != cell) {
			switch (cell.getCellType()) {
			case HSSFCell.CELL_TYPE_NUMERIC: // 数字
				Double doubleValue = cell.getNumericCellValue();
				String str = doubleValue.toString();
				if (str.contains(".0")) {
					str = str.replace(".0", "");
					Integer intValue = Integer.parseInt(str);
					returnValue = intValue.toString();
				} else {
					return doubleValue.toString();
				}

				break;
			case HSSFCell.CELL_TYPE_STRING: // 字符串

				returnValue = cell.getStringCellValue();
				break;
			case HSSFCell.CELL_TYPE_BOOLEAN: // 布尔
				Boolean booleanValue = cell.getBooleanCellValue();
				returnValue = booleanValue.toString();
				break;
			case HSSFCell.CELL_TYPE_BLANK: // 空值
				returnValue = "";
				break;
			case HSSFCell.CELL_TYPE_FORMULA: // 公式

				returnValue = cell.getCellFormula();
				break;
			case HSSFCell.CELL_TYPE_ERROR: // 故障
				returnValue = "";
				break;
			default:
				System.out.println("未知类型");
				break;
			}
		}
		return returnValue;
	}

}
