package ppms.action.interfaces;

import java.util.List;

public class ListForCache<T> {

	private long beginCache;

	private long cacheTime;

	private List<T> list;

	public ListForCache(){
		
		beginCache=System.currentTimeMillis();
		cacheTime=10*60*1000;
	}
	public boolean checkTimeOut() {

		long nowTime = System.currentTimeMillis();
		if (nowTime - beginCache > cacheTime) {
			return true;
		}
		return false;
	}

	public final long getBeginCache() {
		return beginCache;
	}

	public final void setBeginCache(long beginCache) {
		this.beginCache = beginCache;
	}

	public final long getCacheTime() {
		return cacheTime;
	}

	public final void setCahceTime(long cacheTime) {
		this.cacheTime = cacheTime;
	}

	public final List<T> getList() {
		return list;
	}

	public final void setList(List<T> list) {
		this.list = list;
	}

}
