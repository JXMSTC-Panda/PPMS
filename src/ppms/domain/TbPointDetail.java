package ppms.domain;

import java.util.Date;

/**
 * TbPointdetail entity. @author MyEclipse Persistence Tools
 */
public class TbPointdetail extends AbstractTbPointdetail implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TbPointdetail() {
	}

	/** minimal constructor */
	public TbPointdetail(String pointid, TbPoint tbPoint) {
		super(pointid, tbPoint);
	}

	/** full constructor */
	public TbPointdetail(String pointid, TbPoint tbPoint, String operationname,
			Double operationscore, String seq, String createdby,
			Date createdtime, String modifiedby, Date modifiedtime) {
		super(pointid, tbPoint, operationname, operationscore, seq, createdby,
				createdtime, modifiedby, modifiedtime);
	}

}
