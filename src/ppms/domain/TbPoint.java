package ppms.domain;

import java.util.Date;
import java.util.Set;

/**
 * TbPoint entity. @author MyEclipse Persistence Tools
 */
public class TbPoint extends AbstractTbPoint implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TbPoint() {
	}

	/** minimal constructor */
<<<<<<< HEAD
	public TbPoint(String pointid) {
		super(pointid);
	}

	/** full constructor */
	public TbPoint(String pointid, TbEmployee tbEmployee, TbJob tbJob,
			Integer orgid, Date pointmonth, String orgtype,
			Double employeepoint, Double employeeperformance,
			Double orgperformance, Double regulatepoint, Integer rankseq,
			Double encouragementmoney, Double tax, Double netincome,
			Double orglevel, Double breachdeductpoint, Double lastpoint,
			Double deducttax, String createdby, Date createdtime,
			String modifiedby, Date modifiedtime, Set tbPointdetails) {
		super(pointid, tbEmployee, tbJob, orgid, pointmonth, orgtype,
				employeepoint, employeeperformance, orgperformance,
				regulatepoint, rankseq, encouragementmoney, tax, netincome,
				orglevel, breachdeductpoint, lastpoint, deducttax, createdby,
				createdtime, modifiedby, modifiedtime, tbPointdetails);
=======
	public TbPoint(String pointId) {
		super(pointId);
	}

	/** full constructor */
	public TbPoint(String pointId, TbEmployee tbEmployee, TbJob tbJob,
			Integer orgId, Date pointMonth, String orgType,
			Double employeePoint, Double employeePerformance,
			Double orgPerformance, Double regulatePoint, Integer rankSeq,
			Double encouragementMoney, Double tax, Double netIncome,
			Double orgLevel, Double breachDeductPoint, Double lastPoint,
			Double deductTax, String createdBy, Date createdTime,
			String modifiedBy, Date modifiedTime, Set tbPointDetails) {
		super(pointId, tbEmployee, tbJob, orgId, pointMonth, orgType,
				employeePoint, employeePerformance, orgPerformance,
				regulatePoint, rankSeq, encouragementMoney, tax, netIncome,
				orgLevel, breachDeductPoint, lastPoint, deductTax, createdBy,
				createdTime, modifiedBy, modifiedTime, tbPointDetails);
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}
