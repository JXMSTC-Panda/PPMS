package ppms.util;

import java.sql.Timestamp;
import java.util.Date;

/**
 * 获取时间字符串
 * 
 * @author shark
 * 
 */
public class TimeStringUtils {

	public static String getTimeString() {
		
		String id = "";
		synchronized (TimeStringUtils.class) {

			String[] ids = new Timestamp(System.currentTimeMillis())
					.toLocaleString().split(" ");
			String[] arrayOfString1 = ids;
			int j = ids.length;
			for (int i = 0; i < j; i++) {
				String str = arrayOfString1[i];
				id = id + str;
			}

			String[] ids1 = id.split("-");
			id = "";
			String[] arrayOfString2;
			int k = (arrayOfString2 = ids1).length;
			for (j = 0; j < k; j++) {

				String str = arrayOfString2[j];
				id = id + str;
			}

			String[] ids2 = id.split(":");
			id = "";
			String[] arrayOfString3;
			int m = (arrayOfString3 = ids2).length;

			for (k = 0; k < m; k++) {

				String str = arrayOfString3[k];
				id = id + str;
			}
		}
		System.out.println(id);
		return id;
	}
}
