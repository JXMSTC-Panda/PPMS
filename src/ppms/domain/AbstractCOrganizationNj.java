package ppms.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * AbstractCOrganizationNj entity provides the base persistence definition of
 * the COrganizationNj entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCOrganizationNj implements java.io.Serializable {

	// Fields

	private BigDecimal orgAreaId;
	private OrganizationNj organizationNj;
	private TbArea tbArea;
	private String orgName;
	private BigDecimal orgTypeId;
	private BigDecimal regionId;
	private String idDesc;
	private BigDecimal type;
	private Date operatingDate;
	private BigDecimal operatingId;
	private String countyDesc;
	private String countyLx;
	private String idDesc2;
	private Boolean isSq;
	private Boolean isSjmc;
	private Boolean isXyd;
	private BigDecimal idType2;
	private BigDecimal countyLxId;
	private BigDecimal countyId;
	private Boolean xsId;
	private Boolean dyId;
	private Boolean hzlxId;
	private Byte qdlxId;
	private Boolean fsxzId;
	private Boolean zdxsId;
	private Short dzsxId;
	private String channelId1;
	private String dy;
	private String qdlx;
	private BigDecimal status;

	// Constructors

	/** default constructor */
	public AbstractCOrganizationNj() {
	}

	/** minimal constructor */
	public AbstractCOrganizationNj(BigDecimal orgAreaId) {
		this.orgAreaId = orgAreaId;
	}

	/** full constructor */
	public AbstractCOrganizationNj(BigDecimal orgAreaId,
			OrganizationNj organizationNj, TbArea tbArea, String orgName,
			BigDecimal orgTypeId, BigDecimal regionId, String idDesc,
			BigDecimal type, Date operatingDate, BigDecimal operatingId,
			String countyDesc, String countyLx, String idDesc2, Boolean isSq,
			Boolean isSjmc, Boolean isXyd, BigDecimal idType2,
			BigDecimal countyLxId, BigDecimal countyId, Boolean xsId,
			Boolean dyId, Boolean hzlxId, Byte qdlxId, Boolean fsxzId,
			Boolean zdxsId, Short dzsxId, String channelId1, String dy,
			String qdlx, BigDecimal status) {
		this.orgAreaId = orgAreaId;
		this.organizationNj = organizationNj;
		this.tbArea = tbArea;
		this.orgName = orgName;
		this.orgTypeId = orgTypeId;
		this.regionId = regionId;
		this.idDesc = idDesc;
		this.type = type;
		this.operatingDate = operatingDate;
		this.operatingId = operatingId;
		this.countyDesc = countyDesc;
		this.countyLx = countyLx;
		this.idDesc2 = idDesc2;
		this.isSq = isSq;
		this.isSjmc = isSjmc;
		this.isXyd = isXyd;
		this.idType2 = idType2;
		this.countyLxId = countyLxId;
		this.countyId = countyId;
		this.xsId = xsId;
		this.dyId = dyId;
		this.hzlxId = hzlxId;
		this.qdlxId = qdlxId;
		this.fsxzId = fsxzId;
		this.zdxsId = zdxsId;
		this.dzsxId = dzsxId;
		this.channelId1 = channelId1;
		this.dy = dy;
		this.qdlx = qdlx;
		this.status = status;
	}

	// Property accessors

	public BigDecimal getOrgAreaId() {
		return this.orgAreaId;
	}

	public void setOrgAreaId(BigDecimal orgAreaId) {
		this.orgAreaId = orgAreaId;
	}

	public OrganizationNj getOrganizationNj() {
		return this.organizationNj;
	}

	public void setOrganizationNj(OrganizationNj organizationNj) {
		this.organizationNj = organizationNj;
	}

	public TbArea getTbArea() {
		return this.tbArea;
	}

	public void setTbArea(TbArea tbArea) {
		this.tbArea = tbArea;
	}

	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public BigDecimal getOrgTypeId() {
		return this.orgTypeId;
	}

	public void setOrgTypeId(BigDecimal orgTypeId) {
		this.orgTypeId = orgTypeId;
	}

	public BigDecimal getRegionId() {
		return this.regionId;
	}

	public void setRegionId(BigDecimal regionId) {
		this.regionId = regionId;
	}

	public String getIdDesc() {
		return this.idDesc;
	}

	public void setIdDesc(String idDesc) {
		this.idDesc = idDesc;
	}

	public BigDecimal getType() {
		return this.type;
	}

	public void setType(BigDecimal type) {
		this.type = type;
	}

	public Date getOperatingDate() {
		return this.operatingDate;
	}

	public void setOperatingDate(Date operatingDate) {
		this.operatingDate = operatingDate;
	}

	public BigDecimal getOperatingId() {
		return this.operatingId;
	}

	public void setOperatingId(BigDecimal operatingId) {
		this.operatingId = operatingId;
	}

	public String getCountyDesc() {
		return this.countyDesc;
	}

	public void setCountyDesc(String countyDesc) {
		this.countyDesc = countyDesc;
	}

	public String getCountyLx() {
		return this.countyLx;
	}

	public void setCountyLx(String countyLx) {
		this.countyLx = countyLx;
	}

	public String getIdDesc2() {
		return this.idDesc2;
	}

	public void setIdDesc2(String idDesc2) {
		this.idDesc2 = idDesc2;
	}

	public Boolean getIsSq() {
		return this.isSq;
	}

	public void setIsSq(Boolean isSq) {
		this.isSq = isSq;
	}

	public Boolean getIsSjmc() {
		return this.isSjmc;
	}

	public void setIsSjmc(Boolean isSjmc) {
		this.isSjmc = isSjmc;
	}

	public Boolean getIsXyd() {
		return this.isXyd;
	}

	public void setIsXyd(Boolean isXyd) {
		this.isXyd = isXyd;
	}

	public BigDecimal getIdType2() {
		return this.idType2;
	}

	public void setIdType2(BigDecimal idType2) {
		this.idType2 = idType2;
	}

	public BigDecimal getCountyLxId() {
		return this.countyLxId;
	}

	public void setCountyLxId(BigDecimal countyLxId) {
		this.countyLxId = countyLxId;
	}

	public BigDecimal getCountyId() {
		return this.countyId;
	}

	public void setCountyId(BigDecimal countyId) {
		this.countyId = countyId;
	}

	public Boolean getXsId() {
		return this.xsId;
	}

	public void setXsId(Boolean xsId) {
		this.xsId = xsId;
	}

	public Boolean getDyId() {
		return this.dyId;
	}

	public void setDyId(Boolean dyId) {
		this.dyId = dyId;
	}

	public Boolean getHzlxId() {
		return this.hzlxId;
	}

	public void setHzlxId(Boolean hzlxId) {
		this.hzlxId = hzlxId;
	}

	public Byte getQdlxId() {
		return this.qdlxId;
	}

	public void setQdlxId(Byte qdlxId) {
		this.qdlxId = qdlxId;
	}

	public Boolean getFsxzId() {
		return this.fsxzId;
	}

	public void setFsxzId(Boolean fsxzId) {
		this.fsxzId = fsxzId;
	}

	public Boolean getZdxsId() {
		return this.zdxsId;
	}

	public void setZdxsId(Boolean zdxsId) {
		this.zdxsId = zdxsId;
	}

	public Short getDzsxId() {
		return this.dzsxId;
	}

	public void setDzsxId(Short dzsxId) {
		this.dzsxId = dzsxId;
	}

	public String getChannelId1() {
		return this.channelId1;
	}

	public void setChannelId1(String channelId1) {
		this.channelId1 = channelId1;
	}

	public String getDy() {
		return this.dy;
	}

	public void setDy(String dy) {
		this.dy = dy;
	}

	public String getQdlx() {
		return this.qdlx;
	}

	public void setQdlx(String qdlx) {
		this.qdlx = qdlx;
	}

	public BigDecimal getStatus() {
		return this.status;
	}

	public void setStatus(BigDecimal status) {
		this.status = status;
	}

}