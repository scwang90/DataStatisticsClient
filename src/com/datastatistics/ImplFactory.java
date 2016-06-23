package com.datastatistics;

import com.datastatistics.kernel.SameNameImpl;

public class ImplFactory {

	static DataStatisticsImpl statisticsImpl;

	public static DataStatisticsImpl getStatisticsImpl() {
		if (statisticsImpl == null) {
			statisticsImpl = new DataStatisticsImpl();
		}
		return statisticsImpl;
	}
	
	static SameNameImpl sameNameImpl;

	public static SameNameImpl getSameNameImpl() {
		if (sameNameImpl == null) {
			sameNameImpl = new SameNameImpl();
		}
		return sameNameImpl;
	}
	
	static{
//		AndRestConfig.setPort("9080");
//		AndRestConfig.setIP("222.85.149.6");
//		AndRestConfig.setVersion("DataStatistics");
//		DefaultResponseHandler.RESULT = "result";
//		DefaultResponseHandler.STATUS = "status";
//		DefaultResponseHandler.STATUS_OK = true;
	}
}
