package ppms.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * COrganizationNj entity. @author MyEclipse Persistence Tools
 */

public class COrganizationNj implements java.io.Serializable {

	// Fields

	private BigDecimal orgareaid;
	private OrganizationNj organizationNj;
	private TbArea tbArea;
<<<<<<< HEAD
	private String org_Name;
	private BigDecimal org_Type_Id;
	private BigDecimal region_Id;
	private String id_Desc;
	
	private BigDecimal type;
	private Date operating_Date;
	private BigDecimal operating_Id;
	private String county_Desc;
	private String county_Lx;
	private String id_Desc2;
	private Boolean is_Sq;
	private Boolean is_Sjmc;
	private Boolean is_Xyd;
	private BigDecimal id_Type2;
	private BigDecimal county_LxId;
	private BigDecimal county_Id;
	private Boolean xs_Id;
	private Boolean dy_Id;
	private Boolean hzlx_Id;
	private Byte qdlx_Id;
	private Boolean fsxz_Id;
	private Boolean zdxs_Id;
	private Short dzsx_Id;
	private String channel_Id1;
	
=======
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
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	private String dy;
	private String qdlx;
	private BigDecimal status;

	// Constructors

	/** default constructor */
	public COrganizationNj() {
	}

	/** minimal constructor */
	public COrganizationNj(BigDecimal orgareaid) {
		this.orgareaid = orgareaid;
	}

	/** full constructor */
	public COrganizationNj(BigDecimal orgareaid, OrganizationNj organizationNj,
			TbArea tbArea, String orgName, BigDecimal orgTypeId,
			BigDecimal regionId, String idDesc, BigDecimal type,
			Date operatingDate, BigDecimal operatingId, String countyDesc,
			String countyLx, String idDesc2, Boolean isSq, Boolean isSjmc,
			Boolean isXyd, BigDecimal idType2, BigDecimal countyLxId,
			BigDecimal countyId, Boolean xsId, Boolean dyId, Boolean hzlxId,
			Byte qdlxId, Boolean fsxzId, Boolean zdxsId, Short dzsxId,
			String channelId1, String dy, String qdlx, BigDecimal status) {
		this.orgareaid = orgareaid;
		this.organizationNj = organizationNj;
		this.tbArea = tbArea;
<<<<<<< HEAD
		this.org_Name = orgName;
		this.org_Type_Id = orgTypeId;
		this.region_Id = regionId;
		this.id_Desc = idDesc;
		this.type = type;
		this.operating_Date = operatingDate;
		this.operating_Id = operatingId;
		this.county_Desc = countyDesc;
		this.county_Lx = countyLx;
		this.id_Desc2 = idDesc2;
		this.is_Sq = isSq;
		this.is_Sjmc = isSjmc;
		this.is_Xyd = isXyd;
		this.id_Type2 = idType2;
		this.county_LxId = countyLxId;
		this.county_Id = countyId;
		this.xs_Id = xsId;
		this.dy_Id = dyId;
		this.hzlx_Id = hzlxId;
		this.qdlx_Id = qdlxId;
		this.fsxz_Id = fsxzId;
		this.zdxs_Id = zdxsId;
		this.dzsx_Id = dzsxId;
		this.channel_Id1 = channelId1;
=======
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
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
		this.dy = dy;
		this.qdlx = qdlx;
		this.status = status;
	}

<<<<<<< HEAD
	public BigDecimal getOrgareaid() {
		return orgareaid;
=======
	// Property accessors

	public BigDecimal getOrgareaid() {
		return this.orgareaid;
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	}

	public void setOrgareaid(BigDecimal orgareaid) {
		this.orgareaid = orgareaid;
	}

	public OrganizationNj getOrganizationNj() {
<<<<<<< HEAD
		return organizationNj;
=======
		return this.organizationNj;
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	}

	public void setOrganizationNj(OrganizationNj organizationNj) {
		this.organizationNj = organizationNj;
	}

	public TbArea getTbArea() {
<<<<<<< HEAD
		return tbArea;
=======
		return this.tbArea;
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	}

	public void setTbArea(TbArea tbArea) {
		this.tbArea = tbArea;
	}

<<<<<<< HEAD
	public String getOrg_Name() {
		return org_Name;
	}

	public void setOrg_Name(String org_Name) {
		this.org_Name = org_Name;
	}

	public BigDecimal getOrg_Type_Id() {
		return org_Type_Id;
	}

	public void setOrg_Type_Id(BigDecimal org_Type_Id) {
		this.org_Type_Id = org_Type_Id;
	}

	public BigDecimal getRegion_Id() {
		return region_Id;
	}

	public void setRegion_Id(BigDecimal region_Id) {
		this.region_Id = region_Id;
	}

	public String getId_Desc() {
		return id_Desc;
	}

	public void setId_Desc(String id_Desc) {
		this.id_Desc = id_Desc;
	}

	public BigDecimal getType() {
		return type;
=======
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
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	}

	public void setType(BigDecimal type) {
		this.type = type;
	}

<<<<<<< HEAD
	public Date getOperating_Date() {
		return operating_Date;
	}

	public void setOperating_Date(Date operating_Date) {
		this.operating_Date = operating_Date;
	}

	public BigDecimal getOperating_Id() {
		return operating_Id;
	}

	public void setOperating_Id(BigDecimal operating_Id) {
		this.operating_Id = operating_Id;
	}

	public String getCounty_Desc() {
		return county_Desc;
	}

	public void setCounty_Desc(String county_Desc) {
		this.county_Desc = county_Desc;
	}

	public String getCounty_Lx() {
		return county_Lx;
	}

	public void setCounty_Lx(String county_Lx) {
		this.county_Lx = county_Lx;
	}

	public String getId_Desc2() {
		return id_Desc2;
	}

	public void setId_Desc2(String id_Desc2) {
		this.id_Desc2 = id_Desc2;
	}

	public Boolean getIs_Sq() {
		return is_Sq;
	}

	public void setIs_Sq(Boolean is_Sq) {
		this.is_Sq = is_Sq;
	}

	public Boolean getIs_Sjmc() {
		return is_Sjmc;
	}

	public void setIs_Sjmc(Boolean is_Sjmc) {
		this.is_Sjmc = is_Sjmc;
	}

	public Boolean getIs_Xyd() {
		return is_Xyd;
	}

	public void setIs_Xyd(Boolean is_Xyd) {
		this.is_Xyd = is_Xyd;
	}

	public BigDecimal getId_Type2() {
		return id_Type2;
	}

	public void setId_Type2(BigDecimal id_Type2) {
		this.id_Type2 = id_Type2;
	}

	public BigDecimal getCounty_LxId() {
		return county_LxId;
	}

	public void setCounty_LxId(BigDecimal county_LxId) {
		this.county_LxId = county_LxId;
	}

	public BigDecimal getCounty_Id() {
		return county_Id;
	}

	public void setCounty_Id(BigDecimal county_Id) {
		this.county_Id = county_Id;
	}

	public Boolean getXs_Id() {
		return xs_Id;
	}

	public void setXs_Id(Boolean xs_Id) {
		this.xs_Id = xs_Id;
	}

	public Boolean getDy_Id() {
		return dy_Id;
	}

	public void setDy_Id(Boolean dy_Id) {
		this.dy_Id = dy_Id;
	}

	public Boolean getHzlx_Id() {
		return hzlx_Id;
	}

	public void setHzlx_Id(Boolean hzlx_Id) {
		this.hzlx_Id = hzlx_Id;
	}

	public Byte getQdlx_Id() {
		return qdlx_Id;
	}

	public void setQdlx_Id(Byte qdlx_Id) {
		this.qdlx_Id = qdlx_Id;
	}

	public Boolean getFsxz_Id() {
		return fsxz_Id;
	}

	public void setFsxz_Id(Boolean fsxz_Id) {
		this.fsxz_Id = fsxz_Id;
	}

	public Boolean getZdxs_Id() {
		return zdxs_Id;
	}

	public void setZdxs_Id(Boolean zdxs_Id) {
		this.zdxs_Id = zdxs_Id;
	}

	public Short getDzsx_Id() {
		return dzsx_Id;
	}

	public void setDzsx_Id(Short dzsx_Id) {
		this.dzsx_Id = dzsx_Id;
	}

	public String getChannel_Id1() {
		return channel_Id1;
	}

	public void setChannel_Id1(String channel_Id1) {
		this.channel_Id1 = channel_Id1;
	}

	public String getDy() {
		return dy;
=======
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
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	}

	public void setDy(String dy) {
		this.dy = dy;
	}

	public String getQdlx() {
<<<<<<< HEAD
		return qdlx;
=======
		return this.qdlx;
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	}

	public void setQdlx(String qdlx) {
		this.qdlx = qdlx;
	}

	public BigDecimal getStatus() {
<<<<<<< HEAD
		return status;
=======
		return this.status;
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
	}

	public void setStatus(BigDecimal status) {
		this.status = status;
	}

<<<<<<< HEAD
	// Property accessors

=======
>>>>>>> df2843316861e49e795adae8ce3c1c795be31012
}