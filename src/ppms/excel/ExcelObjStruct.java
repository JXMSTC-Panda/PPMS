package ppms.excel;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ExcelObjStruct {

	/**
	 * 成员变量名
	 */
	private String fieldName;
	/**
	 * 成员变量在excel文件中对应的列号
	 */
	private int indexInExcel;
	
	/**
	 * 存储描述信息  即comment节点中（-1:高级 1:中级）的配置信息
	 */
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
	
	/**
	 * 根据key值获取value
	 * @param key
	 * @return
	 */
	public String getValue(int key){
		
		return desc.get(key);
	}
	
	/**
	 * 根据value获取key值
	 * @param value
	 * @return
	 */
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
