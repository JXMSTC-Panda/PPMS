package ppms.action;

import java.io.InputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import ppms.excel.CommonExcelParser;
import ppms.excel.template.IExcelTemp;
import ppms.exception.ExcelParserException;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class FileAction extends ActionSupport {

	private String fileName;

	
	
	public String getFileName() {
		return fileName;
	}


	public void setFileName(String fileName) {
		this.fileName = fileName;
	}



	@org.apache.struts2.convention.annotation.Action("/upload")
	public String upload() {

		HttpServletRequest request = ServletActionContext.getRequest();
		// 基于myFile创建一个文件输入流
		try {

			fileName=new String(fileName.getBytes("iso8859-1"), "utf-8");
			if (!fileName.endsWith(".xls")) {

				throw new ExcelParserException("文件导入失败，文件名" + fileName
						+ "不符合，请导入.xls格式文件");
			} else {
				
				InputStream myFile=request.getInputStream();
				List<IExcelTemp> objs = new CommonExcelParser().toObjs2(myFile,fileName);
				for (IExcelTemp iExcelTemp : objs) {
					System.out.println(iExcelTemp.toString());
				}
				
				System.out.println(myFile);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return Action.SUCCESS;
	}
}
