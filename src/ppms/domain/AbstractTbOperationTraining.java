package ppms.domain;

import java.util.Date;

/**
<<<<<<< HEAD
 * AbstractTbOperationtraining entity provides the base persistence definition
 * of the TbOperationtraining entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbOperationtraining implements
=======
 * AbstractTbOperationTraining entity provides the base persistence definition
 * of the TbOperationTraining entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbOperationTraining implements
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		java.io.Serializable {

	// Fields

<<<<<<< HEAD
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
=======
	private String trainingId;
	private OrganizationNj organizationNj;
	private TbEmployee tbEmployee;
	private Date trainingDate;
	private String trainingLevel;
	private String trainingContent;
	private Double trainingScore;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public AbstractTbOperationtraining() {
	}

	/** minimal constructor */
	public AbstractTbOperationtraining(String trainingid) {
		this.trainingid = trainingid;
	}

	/** full constructor */
	public AbstractTbOperationtraining(String trainingid,
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
=======
	public AbstractTbOperationTraining() {
	}

	/** minimal constructor */
	public AbstractTbOperationTraining(String trainingId) {
		this.trainingId = trainingId;
	}

	/** full constructor */
	public AbstractTbOperationTraining(String trainingId,
			OrganizationNj organizationNj, TbEmployee tbEmployee,
			Date trainingDate, String trainingLevel, String trainingContent,
			Double trainingScore, String createdBy, Date createdTime,
			String modifiedBy, Date modifiedTime) {
		this.trainingId = trainingId;
		this.organizationNj = organizationNj;
		this.tbEmployee = tbEmployee;
		this.trainingDate = trainingDate;
		this.trainingLevel = trainingLevel;
		this.trainingContent = trainingContent;
		this.trainingScore = trainingScore;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	// Property accessors

<<<<<<< HEAD
	public String getTrainingid() {
		return this.trainingid;
	}

	public void setTrainingid(String trainingid) {
		this.trainingid = trainingid;
=======
	public String getTrainingId() {
		return this.trainingId;
	}

	public void setTrainingId(String trainingId) {
		this.trainingId = trainingId;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
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

<<<<<<< HEAD
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
=======
	public Date getTrainingDate() {
		return this.trainingDate;
	}

	public void setTrainingDate(Date trainingDate) {
		this.trainingDate = trainingDate;
	}

	public String getTrainingLevel() {
		return this.trainingLevel;
	}

	public void setTrainingLevel(String trainingLevel) {
		this.trainingLevel = trainingLevel;
	}

	public String getTrainingContent() {
		return this.trainingContent;
	}

	public void setTrainingContent(String trainingContent) {
		this.trainingContent = trainingContent;
	}

	public Double getTrainingScore() {
		return this.trainingScore;
	}

	public void setTrainingScore(Double trainingScore) {
		this.trainingScore = trainingScore;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedTime() {
		return this.modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}