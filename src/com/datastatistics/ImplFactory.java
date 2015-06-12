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
		
	}
}
