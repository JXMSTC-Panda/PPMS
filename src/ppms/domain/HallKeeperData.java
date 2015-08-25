package ppms.domain;

public class HallKeeperData {

	/*
	 * employeecode:100989 employeename:邵文娟 areadesc:城东 org_Name浙大科技园营业厅
	 * postname店长 academicdegree本科 strtelecomlevel初级 strmobilelevel中级
	 * performancescorenull promotionscore59.0 firstscore62.0 secondscore72.0
	 * aver62.0
	 */
	private String employeecode;
	private String employeename;
	private String areadesc;
	private String org_Name;
	private String postname;
	private String academicdegree;
	private String strtelecomlevel;
	private String strmobilelevel;

	private Double performancescore;
	private Double promotionscore;
	private Double firstscore;
	private Double secondscore;
	private Double aver;

	public HallKeeperData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HallKeeperData(String employeecode, String employeename,
			String areadesc, String org_Name, String postname,
			String academicdegree, String strtelecomlevel,
			String strmobilelevel, Double performancescore,
			Double promotionscore, Double firstscore, Double secondscore,
			Double aver) {
		super();
		this.employeecode = employeecode;
		this.employeename = employeename;
		this.areadesc = areadesc;
		this.org_Name = org_Name;
		this.postname = postname;
		this.academicdegree = academicdegree;
		this.strtelecomlevel = strtelecomlevel;
		this.strmobilelevel = strmobilelevel;
		this.performancescore = performancescore;
		this.promotionscore = promotionscore;
		this.firstscore = firstscore;
		this.secondscore = secondscore;
		this.aver = aver;
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

	public String getAreadesc() {
		return areadesc;
	}

	public void setAreadesc(String areadesc) {
		this.areadesc = areadesc;
	}

	public String getOrg_Name() {
		return org_Name;
	}

	public void setOrg_Name(String org_Name) {
		this.org_Name = org_Name;
	}

	public String getPostname() {
		return postname;
	}

	public void setPostname(String postname) {
		this.postname = postname;
	}

	public String getAcademicdegree() {
		return academicdegree;
	}

	public void setAcademicdegree(String academicdegree) {
		this.academicdegree = academicdegree;
	}

	public String getStrtelecomlevel() {
		return strtelecomlevel;
	}

	public void setStrtelecomlevel(String strtelecomlevel) {
		this.strtelecomlevel = strtelecomlevel;
	}

	public String getStrmobilelevel() {
		return strmobilelevel;
	}

	public void setStrmobilelevel(String strmobilelevel) {
		this.strmobilelevel = strmobilelevel;
	}

	public Double getPerformancescore() {
		return performancescore;
	}

	public void setPerformancescore(Double performancescore) {
		this.performancescore = performancescore;
	}

	public Double getPromotionscore() {
		return promotionscore;
	}

	public void setPromotionscore(Double promotionscore) {
		this.promotionscore = promotionscore;
	}

	public Double getFirstscore() {
		return firstscore;
	}

	public void setFirstscore(Double firstscore) {
		this.firstscore = firstscore;
	}

	public Double getSecondscore() {
		return secondscore;
	}

	public void setSecondscore(Double secondscore) {
		this.secondscore = secondscore;
	}

	public Double getAver() {
		return aver;
	}

	public void setAver(Double aver) {
		this.aver = aver;
	}

}
