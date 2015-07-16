package ppms.domain;

import ppms.excel.template.BaseExcelObject;

public class StandardGrade extends BaseExcelObject{

	private int id;
	private String hallId;
	private String hallName;
	private int grade1;
	private int grade2;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHallId() {
		return hallId;
	}
	public void setHallId(String hallId) {
		this.hallId = hallId;
	}
	public String getHallName() {
		return hallName;
	}
	public void setHallName(String hallName) {
		this.hallName = hallName;
	}
	public int getGrade1() {
		return grade1;
	}
	public void setGrade1(int grade1) {
		this.grade1 = grade1;
	}
	public int getGrade2() {
		return grade2;
	}
	public void setGrade2(int grade2) {
		this.grade2 = grade2;
	}
	@Override
	public String toString() {
		return "StandardGrade [id=" + id + ", hallId=" + hallId + ", hallName="
				+ hallName + ", grade1=" + grade1 + ", grade2=" + grade2 + "]";
	}
}
