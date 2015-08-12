package ppms.domain;

import java.util.Date;

/**
 * TbPerformance entity. @author MyEclipse Persistence Tools
 */

/**   
*    
* 项目名称：PPMS   
* 类名称：TbPerformance   
* 类描述：  绩效实体类 
* 创建人：SuperPcf
* 创建时间：2015-8-10 下午2:33:35   
* 修改人：（修改人的名字） 
* 修改时间：2015-8-10 下午2:33:35   
* 修改备注：   
* @version    
*    
*/ 
public class TbPerformance implements java.io.Serializable {

	// Fields

	/** 
	
	* @字段：performanceid :绩效ID，由系统产生
	
	*/ 
	private String performanceid;
	/** 
	
	* @字段：organizationNj :营业厅表实体类（同步营业厅信息表）
	
	*/ 
	private OrganizationNj organizationNj;
	/** 
	
	* @字段：tbEmployee : 员工表实体类
	
	*/ 
	private TbEmployee tbEmployee;
	/** 
	
	* @字段：performancetype :绩效类型（false：月度绩效，true：年度绩效）
	
	*/ 
	private Boolean performancetype;
	/** 
	
	* @字段：performancedate : 月份（月度绩效）/年份（年度绩效）
	
	*/ 
	private Date performancedate;
	/** 
	
	* @字段：performancescore : 月度考核成绩
	
	*/ 
	private Double performancescore;
	/** 
	
	* @字段：remark : 绩效表中的备注
	
	*/ 
	private String remark;
	/** 
	
	* @字段：gradestandardorgfilename : 上传评分标准时的原文件名
	
	*/ 
	private String gradestandardorgfilename;
	/** 
	
	* @字段：gradestandardfilename : 存在本系统中临时目录下的文件名yyyymm.excel(yyyy.excel)，
	* 相对于临时目录 /file/performance/month(year)/员工Id
	*/ 
	private String gradestandardfilename;
	/** 
	
	* @字段：createdby : 创建人
	
	*/ 
	private String createdby;
	/** 
	
	* @字段：createdtime : 创建时间
	*/ 
	private Date createdtime;
	/** 
	
	* @字段：modifiedby : 最后修改人
	
	*/ 
	private String modifiedby;
	/** 
	
	* @字段：modifiedtime : 最后修改时间
	
	*/ 
	private Date modifiedtime;

	
	
	
	
	
	// Constructors

	/** default constructor */
	public TbPerformance() {
	}

	/** minimal constructor */
	public TbPerformance(String performanceid) {
		this.performanceid = performanceid;
	}

	/** full constructor */
	public TbPerformance(String performanceid, OrganizationNj organizationNj,
			TbEmployee tbEmployee, Boolean performancetype,
			Date performancedate, Double performancescore, String remark,
			String gradestandardorgfilename, String gradestandardfilename,
			String createdby, Date createdtime, String modifiedby,
			Date modifiedtime) {
		this.performanceid = performanceid;
		this.organizationNj = organizationNj;
		this.tbEmployee = tbEmployee;
		this.performancetype = performancetype;
		this.performancedate = performancedate;
		this.performancescore = performancescore;
		this.remark = remark;
		this.gradestandardorgfilename = gradestandardorgfilename;
		this.gradestandardfilename = gradestandardfilename;
		this.createdby = createdby;
		this.createdtime = createdtime;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
	}

	// Property accessors

	public String getPerformanceid() {
		return this.performanceid;
	}

	public void setPerformanceid(String performanceid) {
		this.performanceid = performanceid;
	}

	public OrganizationNj getOrganizationNj() {
		return this.organizationNj;
	}

	public void setOrganizationNj(OrganizationNj organizationNj) {
		this.organizationNj = organizationNj;
	}

	public TbEmployee getTbEmployee() {
		return this.tbEmployee;
	}

	public void setTbEmployee(TbEmployee tbEmployee) {
		this.tbEmployee = tbEmployee;
	}

	public Boolean getPerformancetype() {
		return this.performancetype;
	}

	public void setPerformancetype(Boolean performancetype) {
		this.performancetype = performancetype;
	}

	public Date getPerformancedate() {
		return this.performancedate;
	}

	public void setPerformancedate(Date performancedate) {
		this.performancedate = performancedate;
	}

	public Double getPerformancescore() {
		return this.performancescore;
	}

	public void setPerformancescore(Double performancescore) {
		this.performancescore = performancescore;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getGradestandardorgfilename() {
		return this.gradestandardorgfilename;
	}

	public void setGradestandardorgfilename(String gradestandardorgfilename) {
		this.gradestandardorgfilename = gradestandardorgfilename;
	}

	public String getGradestandardfilename() {
		return this.gradestandardfilename;
	}

	public void setGradestandardfilename(String gradestandardfilename) {
		this.gradestandardfilename = gradestandardfilename;
	}

	public String getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public Date getCreatedtime() {
		return this.createdtime;
	}

	public void setCreatedtime(Date createdtime) {
		this.createdtime = createdtime;
	}

	public String getModifiedby() {
		return this.modifiedby;
	}

	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
	}

	public Date getModifiedtime() {
		return this.modifiedtime;
	}

	public void setModifiedtime(Date modifiedtime) {
		this.modifiedtime = modifiedtime;
	}

}