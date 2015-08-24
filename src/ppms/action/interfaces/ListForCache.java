package ppms.action.interfaces;

import java.util.List;

public class ListForCache<T> {

	private long beginCache;

	private long cacheTime;

	private List<T> list;

	public ListForCache(){
		
		beginCache=System.currentTimeMillis();
		cacheTime=5*60*1000;
	}
	public boolean checkTimeOut() {

		long nowTime = System.currentTimeMillis();
		if (nowTime - beginCache > cacheTime) {
			return true;
		}
		return false;
	}

	public  long getBeginCache() {
		return beginCache;
	}

	public  void setBeginCache(long beginCache) {
		this.beginCache = beginCache;
	}

	public  long getCacheTime() {
		return cacheTime;
	}

	public  void setCahceTime(long cacheTime) {
		this.cacheTime = cacheTime;
	}

	public  List<T> getList() {
		return list;
	}

	public  void setList(List<T> list) {
		this.list = list;
	}

}
