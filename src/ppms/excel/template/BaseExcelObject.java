package ppms.excel.template;

import java.lang.reflect.Field;


public class BaseExcelObject implements IExcelTemp {

	@Override
	public IExcelTemp toSave() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Field getField(String fieldName) {

    	Field field=null;
    	try {
			 field=this.getClass().getSuperclass().getDeclaredField(fieldName);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
		}
    	return field;
	}
}
