package ppms.domain;

import java.util.Date;

/**
 * TbPointDetail entity. @author MyEclipse Persistence Tools
 */
public class TbPointDetail extends AbstractTbPointDetail implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TbPointDetail() {
	}

	/** minimal constructor */
	public TbPointDetail(String pointId, TbPoint tbPoint) {
		super(pointId, tbPoint);
	}

	/** full constructor */
	public TbPointDetail(String pointId, TbPoint tbPoint, String operationName,
			Double operationScore, String seq, String createdBy,
			Date createdTime, String modifiedBy, Date modifiedTime) {
		super(pointId, tbPoint, operationName, operationScore, seq, createdBy,
				createdTime, modifiedBy, modifiedTime);
	}

}
