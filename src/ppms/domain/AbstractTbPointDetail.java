package ppms.domain;

import java.util.Date;

/**
<<<<<<< HEAD
 * AbstractTbPointdetail entity provides the base persistence definition of the
 * TbPointdetail entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbPointdetail implements java.io.Serializable {

	// Fields

	private String pointid;
	private TbPoint tbPoint;
	private String operationname;
	private Double operationscore;
	private String seq;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;
=======
 * AbstractTbPointDetail entity provides the base persistence definition of the
 * TbPointDetail entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTbPointDetail implements java.io.Serializable {

	// Fields

	private String pointId;
	private TbPoint tbPoint;
	private String operationName;
	private Double operationScore;
	private String seq;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727

	// Constructors

	/** default constructor */
<<<<<<< HEAD
	public AbstractTbPointdetail() {
	}

	/** minimal constructor */
	public AbstractTbPointdetail(String pointid, TbPoint tbPoint) {
		this.pointid = pointid;
=======
	public AbstractTbPointDetail() {
	}

	/** minimal constructor */
	public AbstractTbPointDetail(String pointId, TbPoint tbPoint) {
		this.pointId = pointId;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		this.tbPoint = tbPoint;
	}

	/** full constructor */
<<<<<<< HEAD
	public AbstractTbPointdetail(String pointid, TbPoint tbPoint,
			String operationname, Double operationscore, String seq,
			String createdby, Date createdtime, String modifiedby,
			Date modifiedtime) {
		this.pointid = pointid;
		this.tbPoint = tbPoint;
		this.operationname = operationname;
		this.operationscore = operationscore;
		this.seq = seq;
		this.createdby = createdby;
		this.createdtime = createdtime;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
=======
	public AbstractTbPointDetail(String pointId, TbPoint tbPoint,
			String operationName, Double operationScore, String seq,
			String createdBy, Date createdTime, String modifiedBy,
			Date modifiedTime) {
		this.pointId = pointId;
		this.tbPoint = tbPoint;
		this.operationName = operationName;
		this.operationScore = operationScore;
		this.seq = seq;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	// Property accessors

<<<<<<< HEAD
	public String getPointid() {
		return this.pointid;
	}

	public void setPointid(String pointid) {
		this.pointid = pointid;
=======
	public String getPointId() {
		return this.pointId;
	}

	public void setPointId(String pointId) {
		this.pointId = pointId;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public TbPoint getTbPoint() {
		return this.tbPoint;
	}

	public void setTbPoint(TbPoint tbPoint) {
		this.tbPoint = tbPoint;
	}

<<<<<<< HEAD
	public String getOperationname() {
		return this.operationname;
	}

	public void setOperationname(String operationname) {
		this.operationname = operationname;
	}

	public Double getOperationscore() {
		return this.operationscore;
	}

	public void setOperationscore(Double operationscore) {
		this.operationscore = operationscore;
=======
	public String getOperationName() {
		return this.operationName;
	}

	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}

	public Double getOperationScore() {
		return this.operationScore;
	}

	public void setOperationScore(Double operationScore) {
		this.operationScore = operationScore;
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

	public String getSeq() {
		return this.seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

<<<<<<< HEAD
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