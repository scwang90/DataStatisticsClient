package com.datastatistics;

import com.andframe.application.AfApplication;
import com.andrestful.api.AbstractRequester;
import com.datastatistics.model.CountProvinceEntity;
import com.datastatistics.task.NameKernelTask;

import java.util.List;

public class DataStatisticsImpl extends AbstractRequester {

	public void statistics(String name,List<CountProvinceEntity> entities) {
		AfApplication.postTask(new NameKernelTask(name,entities));
	}
	
}
