package ppms.action;

import java.io.File;

import ppms.excel.template.IExcelTemp;
import ppms.exception.ExcelParserException;

import com.excel.toObj.ExcelConfig;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class FileAction extends ActionSupport {

	// myFileContentType属性用来封装上传文件的类型
	private String myFileContentType;

	// myFileFileName属性用来封装上传文件的文件名
	private String myFileFileName;

	private File myFile;

	public String getMyFileContentType() {
		return myFileContentType;
	}

	public void setMyFileContentType(String myFileContentType) {
		this.myFileContentType = myFileContentType;
	}

	public String getMyFileFileName() {
		return myFileFileName;
	}

	public void setMyFileFileName(String myFileFileName) {
		this.myFileFileName = myFileFileName;
	}

	public File getMyFile() {
		return myFile;
	}

	public void setMyFile(File myFile) {
		this.myFile = myFile;
	}

	public String upload() {

		// 基于myFile创建一个文件输入流
		try {

			if (!myFileFileName.endsWith(".xls")) {

				throw new ExcelParserException("文件导入失败，文件名" + myFileFileName
						+ "不符合，请导入.xls格式文件");
			} else {
				String clazzName = ExcelConfig
						.getObjectFromConfig(myFileFileName);
				IExcelTemp forName = (IExcelTemp) Class.forName(clazzName)
						.newInstance();
				forName.toObjs(myFile);
				System.out.println(myFile);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return Action.SUCCESS;
	}
}
