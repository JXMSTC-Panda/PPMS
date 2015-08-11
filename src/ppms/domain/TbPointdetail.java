package ppms.domain;

import java.util.Date;

/**
 * TbPointdetail entity. @author MyEclipse Persistence Tools
 */

public class TbPointdetail implements java.io.Serializable {

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

	// Constructors

	/** default constructor */
	public TbPointdetail() {
	}

	/** minimal constructor */
	public TbPointdetail(String pointid, TbPoint tbPoint) {
		this.pointid = pointid;
		this.tbPoint = tbPoint;
	}

	/** full constructor */
	public TbPointdetail(String pointid, TbPoint tbPoint, String operationname,
			Double operationscore, String seq, String createdby,
			Date createdtime, String modifiedby, Date modifiedtime) {
		this.pointid = pointid;
		this.tbPoint = tbPoint;
		this.operationname = operationname;
		this.operationscore = operationscore;
		this.seq = seq;
		this.createdby = createdby;
		this.createdtime = createdtime;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
	}

	// Property accessors

	public String getPointid() {
		return this.pointid;
	}

	public void setPointid(String pointid) {
		this.pointid = pointid;
	}

	public TbPoint getTbPoint() {
		return this.tbPoint;
	}

	public void setTbPoint(TbPoint tbPoint) {
		this.tbPoint = tbPoint;
	}

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
	}

	public String getSeq() {
		return this.seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
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