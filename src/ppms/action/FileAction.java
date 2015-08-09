package ppms.action;

import java.io.File;
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

	private File file;
	private String fileFileName;
	private String expect;
 	
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


	@org.apache.struts2.convention.annotation.Action("/upload")
	public String upload() {

		// 基于myFile创建一个文件输入流
		try {

			if (!fileFileName.endsWith(".xls")) {
				throw new ExcelParserException("文件导入失败，文件名" + fileFileName
						+ "不符合，请导入.xls格式文件");
			} else {

				
				List<IExcelTemp> objs = new CommonExcelParser().toObjs2(file,
						fileFileName);
				for (IExcelTemp iExcelTemp : objs) {
					System.out.println(iExcelTemp.toString());
				}

				System.out.println(fileFileName);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return Action.SUCCESS;
	}
}
