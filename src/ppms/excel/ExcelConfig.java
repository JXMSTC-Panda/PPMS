package ppms.excel;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * 模板excel的配置文件对象，存储了excel文件和它所对应的类的映射关系
 * @author shark
 *
 */
public class ExcelConfig {

	private static Properties config;
	static{
		config=new Properties();
		try {
			config.load(new FileInputStream(new File(ExcelConfig.class.getClassLoader().getResource("template_excel.properties").getPath())));
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	/**
	 * 通过文件名获取excel文件对应类的全类名
	 * @param fileName 文件名字（带后缀）
	 * @return excel文件对应类的全类名
	 */
	public static String getObjectFromConfig(String fileName){
		
		return config.getProperty(fileName);
	}
		
}
