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
	}

}
