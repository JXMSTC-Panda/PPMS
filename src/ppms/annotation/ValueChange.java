package ppms.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 标记该成员变量的值来之数据字典表，即要做值转换
 * @author shark
 * @update 2015下午6:59:52
 * @function
 *
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ValueChange{

	public String tb_name () default "TbMaster";
	
	public String key_type() ;
}
