package ppms.domain;

import java.util.Date;

/**
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

	// Constructors

	/** default constructor */
	public AbstractTbPointDetail() {
	}

	/** minimal constructor */
	public AbstractTbPointDetail(String pointId, TbPoint tbPoint) {
		this.pointId = pointId;
		this.tbPoint = tbPoint;
	}

	/** full constructor */
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
	}

	// Property accessors

	public String getPointId() {
		return this.pointId;
	}

	public void setPointId(String pointId) {
		this.pointId = pointId;
	}

	public TbPoint getTbPoint() {
		return this.tbPoint;
	}

	public void setTbPoint(TbPoint tbPoint) {
		this.tbPoint = tbPoint;
	}

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
	}

	public String getSeq() {
		return this.seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
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
	}

}