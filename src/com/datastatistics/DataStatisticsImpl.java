package com.datastatistics;

import java.util.List;

import com.andframe.application.AfApplication;
import com.andrestrequest.impl.AbstractRequester;
import com.datastatistics.model.CountProvinceEntity;
import com.datastatistics.task.NameKernelTask;

public class DataStatisticsImpl extends AbstractRequester{

	public void statistics(String name,List<CountProvinceEntity> entities) {
		AfApplication.postTask(new NameKernelTask(name,entities));
	}
	
}
