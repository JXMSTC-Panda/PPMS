package ppms.excel;

public class ResObject {

	private String cloumn;
	private Object object;
	
	public String getCloumn() {
		return cloumn;
	}
	public void setCloumn(String cloumn) {
		this.cloumn = cloumn;
	}
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
	public ResObject(String cloumn, Object object) {
		super();
		this.cloumn = cloumn;
		this.object = object;
	}
}
