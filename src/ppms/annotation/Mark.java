package ppms.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 注解：标记excel转对象时，数据源为列名的成员变量
 * @author shark
 *
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Mark {

	/**
	 * 列名所在的行
	 * @return
	 */
	public int row () default 1;
	/**
	 * 列名所在的列
	 * @return
	 */
	public int clomn() default 4;
}
