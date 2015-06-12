package com.datastatistics.task;

import java.util.ArrayList;
import java.util.List;

import android.os.Message;

import com.andframe.thread.AfTask;
import com.andrestrequest.util.GsonUtil;
import com.datastatistics.ImplFactory;
import com.datastatistics.kernel.SameNameImpl;
import com.datastatistics.model.CountProvinceEntity;
import com.datastatistics.model.SnSameName;

public class NameKernelTask extends AfTask {

	private String name;
	List<CountProvinceEntity> entities = new ArrayList<CountProvinceEntity>();

	public NameKernelTask(String name,List<CountProvinceEntity> entities) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.entities = entities;
	}

	@Override
	protected void onWorking(Message msg) throws Exception {
		// TODO Auto-generated method stub
		SnSameName sameName = new SnSameName();
		sameName.sameName = name;
		sameName.countProvince = GsonUtil.toJson(entities);
		SameNameImpl impl = ImplFactory.getSameNameImpl();
		impl.submit(sameName);
	}

}