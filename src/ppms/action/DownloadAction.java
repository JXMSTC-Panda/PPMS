package ppms.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DownloadAction extends ActionSupport {

	/**
	 * 下载文件文件名
	 */
	private String fileName;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@org.apache.struts2.convention.annotation.Action(value = "downloadAction")
	public String downloadExcel() {

		try {
			ServletOutputStream outputStream = ServletActionContext
					.getResponse().getOutputStream();
			HttpServletResponse response = ServletActionContext.getResponse();
			response.setContentType("application/x-msdownload");

			ServletContext servletContext = (ServletContext) ActionContext
					.getContext().get(ServletActionContext.SERVLET_CONTEXT);

			String rootPath = servletContext.getRealPath("/");
			System.out.println(rootPath);
			File file = new File(rootPath + "/template/" + fileName);

			FileInputStream fis = new FileInputStream(file);

			// 写明要下载的文件的大小
			response.setContentLength((int) file.length());

			// 设置附加文件名
			response.setHeader("Content-Disposition", "attachment;filename="
					+ fileName);

			// 解决中文乱码
			response.setHeader("Content-Disposition", "attachment;filename="
					+ new String

					(fileName.getBytes("utf-8"), "iso-8859-1"));
			byte[] buffer = new byte[1024];
			int k = 0;
			while (k < file.length()) {

				int j = fis.read(buffer, 0, 1024);
				k += j;
				// 将b中的数据写到客户端的内存
				outputStream.write(buffer, 0, j);

			}
			outputStream.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private void copyInToOut(OutputStream os) throws Exception {

	}

}
