package ppms.excel;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ExcelObjStruct {

	private String fieldName;
	private int indexInExcel;
	
	private Map<Integer,String > desc;
	
	public ExcelObjStruct(){
		
		desc=new HashMap<Integer,String>();
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public int getIndexInExcel() {
		return indexInExcel;
	}
	public void setIndexInExcel(int indexInExcel) {
		this.indexInExcel = indexInExcel;
	}
	
	public void setDesc(int key,String value){
		
		desc.put(key, value);
		
	}
	public String getValue(int key){
		
		return desc.get(key);
	}
	
	public int getKey(Object value){
		int key = Integer.MAX_VALUE;
		for (Entry entry:desc.entrySet()) {
			
			if(entry.getValue().equals(value)){
				key= (int) entry.getKey();
			}
		}
		return key;
	}
	
}
