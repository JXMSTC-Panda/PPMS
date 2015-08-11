package ppms.excel;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;



/**
 * 模板excel的配置文件对象，存储了excel文件和它所对应的类的映射关系
 * 
 * @author shark
 * 
 */
public class ExcelConfig {

	private static Properties dataBegin;
	private static Map<String, List<String>> config;
	
	static {
		//定义解析器
		SAXReader reader = new SAXReader();
	    List<String> ObjectsConf = null;
	    //excel和对象的映射关系对象
	    ExcelObjStruct eos=null;
		try {

			//获取文档对象
			Document document = reader.read(new FileInputStream(new File(
					ExcelConfig.class.getClassLoader()
							.getResource("configForObject.xml").getPath())));
			//获取根节点
			Element root = document.getRootElement();
			config=new HashMap<String,List<String>>();
			
			//获取excel节点
			List<Element> element_excel = root.elements("excel");
			
			//遍历所有的excel节点
			for (Element element : element_excel) {
				ObjectsConf=new ArrayList<String>();
				
				//获取excel的文件名
				String excelFileName = element.attribute("name").getText();
				//获取object节点
				List<Element> elements_obj = element.elements("object");
				
				//遍历所有object的对象
				for (Element element2 : elements_obj) {
					//获取excel对应类的全类名
					String clazz = element2.element("class_name").getText().trim();
					ObjectsConf.add(clazz);
				}
				config.put(excelFileName, ObjectsConf);
			}
			dataBegin=new Properties();
			dataBegin.load(new FileInputStream(new File(
					ExcelConfig.class.getClassLoader()
							.getResource("excel_dataBegin.properties").getPath())));
			System.out.println();
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * 通过文件名获取excel文件对应类的全类名
	 * 
	 * @param fileName
	 *            文件名字（带后缀）
	 * @return excel文件对应类的全类名
	 */
	public static List<String> getObjectFromConfig(String fileName) {

		return config.get(fileName);
	}
	
	public static int  getDataBegin(String fielName){
		
		return Integer.valueOf((String) dataBegin.getProperty(fielName, "1"));
	}
}
