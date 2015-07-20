package ppms.excel;

import java.util.Date;

import ppms.annotation.Mark;
import ppms.excel.template.BaseExcelObject;


public class HallGrade extends BaseExcelObject{

	private String hallId;
	@Mark(row=0,clomn=4)
	private Date date;
	private int firstGrade;
	private int secGrade;
	private int samGrade;
	private int avaGrage;
	public String getHallId() {
		return hallId;
	}
	public void setHallId(String hallId) {
		this.hallId = hallId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getFirstGrade() {
		return firstGrade;
	}
	public void setFirstGrade(int firstGrade) {
		this.firstGrade = firstGrade;
	}
	public int getSecGrade() {
		return secGrade;
	}
	public void setSecGrade(int secGrade) {
		this.secGrade = secGrade;
	}
	public int getSamGrade() {
		return samGrade;
	}
	public void setSamGrade(int samGrade) {
		this.samGrade = samGrade;
	}
	public int getAvaGrage() {
		return avaGrage;
	}
	public void setAvaGrage(int avaGrage) {
		this.avaGrage = avaGrage;
	}
	@Override
	public String toString() {
		return "HallGrade [hallId=" + hallId + ", date=" + date
				+ ", firstGrade=" + firstGrade + ", secGrade=" + secGrade
				+ ", samGrade=" + samGrade + ", avaGrage=" + avaGrage + "]";
	}
	
}
