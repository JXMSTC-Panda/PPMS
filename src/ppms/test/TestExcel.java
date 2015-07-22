package ppms.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import ppms.excel.CommonExcelParser;
import ppms.excel.StandardGrade;
import ppms.excel.template.IExcelTemp;

public class TestExcel {

	@Test
	public void TestToExcel(){
		
		StandardGrade standGrade=new StandardGrade();
		standGrade.setGrade1(40);
		standGrade.setGrade2(45);
		standGrade.setHallId("A2202");
		standGrade.setHallName("罗氏营业厅");
		
		List<IExcelTemp> list=new ArrayList<IExcelTemp>();
		list.add(standGrade);
		
		new CommonExcelParser().toExcel(list, "C:/Users/shark/Desktop/原始参考资料/EXCEL模板/标准化检查成绩批量导出模板.xls");
	}
}
