package ppms.domain;

import java.util.Date;

/**
 * TbOperationtraining entity. @author MyEclipse Persistence Tools
 */

public class TbOperationtraining implements java.io.Serializable {

	// Fields

	private String trainingid;
	private OrganizationNj organizationNj;
	private TbEmployee tbEmployee;
	private Date trainingdate;
	private String traininglevel;
	private String trainingcontent;
	private Double trainingscore;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;

	// Constructors

	/** default constructor */
	public TbOperationtraining() {
	}

	/** minimal constructor */
	public TbOperationtraining(String trainingid) {
		this.trainingid = trainingid;
	}

	/** full constructor */
	public TbOperationtraining(String trainingid,
			OrganizationNj organizationNj, TbEmployee tbEmployee,
			Date trainingdate, String traininglevel, String trainingcontent,
			Double trainingscore, String createdby, Date createdtime,
			String modifiedby, Date modifiedtime) {
		this.trainingid = trainingid;
		this.organizationNj = organizationNj;
		this.tbEmployee = tbEmployee;
		this.trainingdate = trainingdate;
		this.traininglevel = traininglevel;
		this.trainingcontent = trainingcontent;
		this.trainingscore = trainingscore;
		this.createdby = createdby;
		this.createdtime = createdtime;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
	}

	// Property accessors

	public String getTrainingid() {
		return this.trainingid;
	}

	public void setTrainingid(String trainingid) {
		this.trainingid = trainingid;
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

	public Date getTrainingdate() {
		return this.trainingdate;
	}

	public void setTrainingdate(Date trainingdate) {
		this.trainingdate = trainingdate;
	}

	public String getTraininglevel() {
		return this.traininglevel;
	}

	public void setTraininglevel(String traininglevel) {
		this.traininglevel = traininglevel;
	}

	public String getTrainingcontent() {
		return this.trainingcontent;
	}

	public void setTrainingcontent(String trainingcontent) {
		this.trainingcontent = trainingcontent;
	}

	public Double getTrainingscore() {
		return this.trainingscore;
	}

	public void setTrainingscore(Double trainingscore) {
		this.trainingscore = trainingscore;
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