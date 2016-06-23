package com.datastatistics.kernel;

import com.andrestful.api.AbstractRequester;
import com.andrestful.api.HttpMethod;
import com.datastatistics.model.SnSameName;

public class SameNameImpl extends AbstractRequester {

	public void submit(SnSameName name) throws Exception{
		HttpMethod method = HttpMethod.POST;
		String path = "/SnSameName/Post";
		impl.handler.doRequest(method, path ,null, name, null);
	}

}
