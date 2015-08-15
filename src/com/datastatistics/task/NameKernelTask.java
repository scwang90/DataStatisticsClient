package com.datastatistics.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import android.os.Message;

import com.andframe.caches.AfPrivateCaches;
import com.andframe.thread.AfTask;
import com.andframe.util.java.AfMD5;
import com.andrestrequest.util.GsonUtil;
import com.datastatistics.ImplFactory;
import com.datastatistics.kernel.SameNameImpl;
import com.datastatistics.model.CountProvinceEntity;
import com.datastatistics.model.SnSameName;

public class NameKernelTask extends AfTask implements Comparator<CountProvinceEntity>{

	private String md5;
	private String name;
	List<CountProvinceEntity> entities = new ArrayList<CountProvinceEntity>();

	AfPrivateCaches caches = AfPrivateCaches.getInstance("sname");
	
	public NameKernelTask(String name,List<CountProvinceEntity> entities) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.entities = entities;
		this.md5 = AfMD5.getMD5(name+entities.size());
	}

	@Override
	protected void onWorking(Message msg) throws Exception {
		// TODO Auto-generated method stub
		if (caches.get(md5, String.class) == null) {
			Collections.sort(entities,this);
			SnSameName sameName = new SnSameName();
			sameName.sameName = name;
			sameName.countProvince = GsonUtil.toJson(entities);
			SameNameImpl impl = ImplFactory.getSameNameImpl();
			impl.submit(sameName);
			caches.put(md5, md5);
		}
	}
	
	@Override
	protected void onException(Throwable e) {
		// TODO Auto-generated method stub
		super.onException(e);
//		AfExceptionHandler.handler(e, "NameKernelTask");
	}

	@Override
	public int compare(CountProvinceEntity lhs, CountProvinceEntity rhs) {
		// TODO Auto-generated method stub
		if (lhs == null || rhs == null) {
			return 0;
		}
		return Integer.compare(lhs.getProvinceCode(), rhs.getProvinceCode());
	}
}
