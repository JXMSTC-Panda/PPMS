package ppms.exception;

/**
 * 保存Excel处理是出现的异常和错误
 * @author shark
 * @update 2015下午7:15:49
 * @function
 *
 */
public class ErrorInfo {

	
	private int index;
	
	private String info;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public ErrorInfo(int index, String info) {
		super();
		this.index = index;
		this.info = info;
	}

	public ErrorInfo(String info) {
		super();
		this.info = info;
	}
}
