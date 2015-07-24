package ppms.domain;

import java.util.Date;

/**
<<<<<<< HEAD
 * TbPointdetail entity. @author MyEclipse Persistence Tools
 */
public class TbPointdetail extends AbstractTbPointdetail implements
=======
 * TbPointDetail entity. @author MyEclipse Persistence Tools
 */
public class TbPointDetail extends AbstractTbPointDetail implements
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
		java.io.Serializable {

	// Constructors

	/** default constructor */
<<<<<<< HEAD
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
=======
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
>>>>>>> b0633ca887c97320693bf68c51508c4ad9c3a727
	}

}
