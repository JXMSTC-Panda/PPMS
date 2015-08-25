package ppms.domain;

public class MountGuardCard {
	/*
	 * areadesc:城西 employeecode:100989 employeename:邵文娟
	 * idnumber:3201061970052020 orgid:2 org_Name:湖南路营业厅 value:普通员工
	 * examdate:2015-08-11 examexpire:12.0 examscore:80.0
	 */
	private String areadesc;
	private String employeecode;
	private String employeename;
	private String idnumber;
	private String org_Name;
	
	private String value;
	private String examdate;

	private Double examexpire;
	private Double examscore;
	
	private Integer orgid;

	public MountGuardCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MountGuardCard(String areadesc, String employeecode,
			String employeename, String idnumber, String org_Name,
			String value, String examdate, Double examexpire, Double examscore,
			Integer orgid) {
		super();
		this.areadesc = areadesc;
		this.employeecode = employeecode;
		this.employeename = employeename;
		this.idnumber = idnumber;
		this.org_Name = org_Name;
		this.value = value;
		this.examdate = examdate;
		this.examexpire = examexpire;
		this.examscore = examscore;
		this.orgid = orgid;
	}

	public String getAreadesc() {
		return areadesc;
	}

	public void setAreadesc(String areadesc) {
		this.areadesc = areadesc;
	}

	public String getEmployeecode() {
		return employeecode;
	}

	public void setEmployeecode(String employeecode) {
		this.employeecode = employeecode;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getIdnumber() {
		return idnumber;
	}

	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}

	public String getOrg_Name() {
		return org_Name;
	}

	public void setOrg_Name(String org_Name) {
		this.org_Name = org_Name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getExamdate() {
		return examdate;
	}

	public void setExamdate(String examdate) {
		this.examdate = examdate;
	}

	public Double getExamexpire() {
		return examexpire;
	}

	public void setExamexpire(Double examexpire) {
		this.examexpire = examexpire;
	}

	public Double getExamscore() {
		return examscore;
	}

	public void setExamscore(Double examscore) {
		this.examscore = examscore;
	}

	public Integer getOrgid() {
		return orgid;
	}

	public void setOrgid(Integer orgid) {
		this.orgid = orgid;
	}
	
	
}
