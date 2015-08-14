package ppms.exception;

import java.util.ArrayList;
import java.util.List;

/**
 * Excel解析异常
 * @author shark
 *
 */
public class ExcelParserException extends Exception {

	
	private List<ErrorInfo> errors; 
	
	public ExcelParserException(){
		errors=new ArrayList<ErrorInfo>();
	}
	public ExcelParserException(String msg){
		super(msg);
	}
	
	/**
	 * 添加一个错误信息
	 * @param error
	 */
	public void addErrorInfo(ErrorInfo error){
		errors.add(error);
	}
	
	@Override
	public void printStackTrace() {
		super.printStackTrace();
		
		for (ErrorInfo info : errors) {
			
			System.out.println(info!=null?"**":info.getIndex()+": "+info.getInfo());
		}
	}
	
	public List<ErrorInfo> getErrors(){
		
		return errors;
	}
}
