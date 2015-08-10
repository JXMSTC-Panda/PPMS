package ppms.excel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ppms.daoimpl.BaseDaoImp;

public class ListForParser<ExcelObjStruct> {

	private List<ExcelObjStruct> list;
	private int size;
	
	@Autowired
	private BaseDaoImp dao;
	public ListForParser(){
		
		list=new ArrayList<>();
	}
	
	public void add(ExcelObjStruct eos){
		
		list.add(eos);
		size++;
	}
	
	public ExcelObjStruct get(int index){
		return list.get(index);
	}
	
	public boolean isComplish(){
		
		if(list.size()<size)
			return false;
		return true;
	}
	
	public void setFullSize(int size){
		
		this.size=size;
	}
	
	public int size(){
		
		return list.size();
	}
}
