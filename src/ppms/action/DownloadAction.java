package ppms.action;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import ppms.action.interfaces.ListForCache;
import ppms.daoimpl.BaseDaoImp;
import ppms.excel.CommonExcelParser;
import ppms.excel.ExcelConfig;
import ppms.exception.ExcelParserException;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 接收文件下载请求
 * 
 * @author shark
 * @update 2015下午7:02:24
 * @function
 * 
 */
public class DownloadAction extends ActionSupport {

	/**
	 * 下载文件文件名
	 */
	private String fileName;

	private ExcelParserException exception;
	private HttpSession session;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public DownloadAction() {
		response = ServletActionContext.getResponse();
		this.session = ServletActionContext.getRequest().getSession();
		exception = new ExcelParserException();
	}

	@Autowired
	@Qualifier("baseDaoImp")
	private BaseDaoImp dao;

	private HttpServletResponse response;

	private String cachename;

	@Action(value = "other.null.batchImportTempletList", results = {
			@Result(name = "success", location = "/WEB-INF/content/page/other/batchImportTempletList.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/error.jsp") })
	public String firstIn() {

		System.out.println("nihao");
		return "success";
	}
	/**
	 * 接收Excel上传模板下载
	 * 
	 * @return
	 */
	@org.apache.struts2.convention.annotation.Action(value = "other.null.batchImportTempletList.downloadAction")
	public String downloadExcel() {

		try {
			ServletOutputStream outputStream = ServletActionContext
					.getResponse().getOutputStream();
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
				// 将buffer中的数据写到客户端的内存
				outputStream.write(buffer, 0, j);

			}
			outputStream.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 接收数据以Excel文件导出
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@Action("/downData")
	public String downDataToExcel() {

		try {

			// List<TbInnovation> findAll = dao.getEntitiestNotLazy(new
			// TbInnovation(), new String[]{"organizationNj","tbEmployee"});
			// List<TbVisitcheck> findAll =dao.getEntitiestNotLazy(new
			// TbVisitcheck(), new String[]{"organizationNj"});
			// ListForCache<TbVisitcheck> list=new ListForCache<TbVisitcheck>();
			// List<TbStandardcheck> findAll =dao.getEntitiestNotLazy(new
			// TbStandardcheck(), new String[]{"organizationNj"});
			// ListForCache<TbStandardcheck> list=new
			// ListForCache<TbStandardcheck>();

			// List<TbMountguardexam> findAll =dao.getEntitiestNotLazy(new
			// TbMountguardexam(), new String[]{"organizationNj","tbEmployee"});
			// ListForCache<TbMountguardexam> list=new
			// ListForCache<TbMountguardexam>();

			// List<ppms.domain.TbEmployee> findAll =dao.getEntitiestNotLazy(new
			// ppms.domain.TbEmployee(), new
			// String[]{"organizationNj","tbJob","tbRole","tbPost"});
			// ListForCache<ppms.domain.TbEmployee> list=new
			// ListForCache<ppms.domain.TbEmployee>();

			// List<TbMonitorcheck> findAll =dao.getEntitiestNotLazy(new
			// TbMonitorcheck(), new String[]{"organizationNj"});
			// ListForCache<TbMonitorcheck> list=new
			// ListForCache<TbMonitorcheck>();
			//
			// List<TbPromotiontraining> findAll = dao.getEntitiestNotLazy(
			// new TbPromotiontraining(), new String[] { "organizationNj",
			// "tbEmployee" });
			// ListForCache<TbPromotiontraining> list = new
			// ListForCache<TbPromotiontraining>();

			// List<TbPerformance> findAll = dao.getEntitiestNotLazy(
			// new TbPerformance(), new String[] { "organizationNj",
			// "tbEmployee" });
			// ListForCache<TbPerformance> list = new
			// ListForCache<TbPerformance>();
			//
			// List<TbEmployeepraisecriticism> findAll =
			// dao.getEntitiestNotLazy(
			// new TbEmployeepraisecriticism(), new String[] { "organizationNj",
			// "tbEmployee" });
			// ListForCache<TbEmployeepraisecriticism> list = new
			// ListForCache<TbEmployeepraisecriticism>();
			//
			// List<TbOperationcheck> findAll = dao.getEntitiestNotLazy(
			// new TbOperationcheck(), new String[] { "organizationNj",
			// "tbEmployee" });
			// ListForCache<TbOperationcheck> list = new
			// ListForCache<TbOperationcheck>()

			// List<TbOrgpraisecriticism> findAll = dao.getEntitiestNotLazy(
			// new TbOrgpraisecriticism(), new String[] { "organizationNj"});
			// ListForCache<TbOrgpraisecriticism> list = new
			// ListForCache<TbOrgpraisecriticism>();
			// list.setList(findAll);
			// response = ServletActionContext.getResponse();
			// session.setAttribute(findAll.get(0).getClass().getName(), list);
			// 请求文件名硬解码
			fileName = new String(fileName.getBytes("iso8859-1"), "utf-8");

			cachename = ExcelConfig.getObjectFromConfig(fileName).get(0);
			// 获取存放在Session域中的缓冲数据
			ListForCache<Object> list = (ListForCache<Object>) session
					.getAttribute(cachename);

			String[] parameterValues = ServletActionContext.getRequest()
					.getParameterValues("cols");
			ListForCache<Object> newlist;
			if (parameterValues != null) {
				Class clazz=list.getList().get(0).getClass();
				String fieldname = clazz.getDeclaredFields()[0].getName();
				fieldname=fieldname.replaceFirst(fieldname.substring(0, 1), fieldname.substring(0, 1).toUpperCase());
				Method method=clazz.getMethod("get"+fieldname);
				String id;
				newlist=new ListForCache<Object>();
				List<Object> child=new ArrayList<Object>();
				for (String string : parameterValues) {

					for (int i=0;i<list.getList().size();i++) {

						id = (String) method.invoke(list.getList().get(i));
						if(id.equals(string)){
							child.add(list.getList().get(i));
						}
					}
					newlist.setList(child);
				}
			}else{
				newlist=list;
			}
			// 将数据生成Excel文件
			HSSFWorkbook workbook = new CommonExcelParser(dao, exception)
					.toExcel2(newlist, fileName);
			response.setHeader("Content-Disposition", "attachment;filename="
					+ fileName);

			// 解决中文乱码
			response.setHeader("Content-Disposition", "attachment;filename="
					+ new String

					(fileName.getBytes("utf-8"), "iso-8859-1"));
			ServletOutputStream outputStream = response.getOutputStream();

			workbook.write(outputStream);
			outputStream.flush();
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}finally{
			session.removeAttribute(cachename);
		}
	}

}
