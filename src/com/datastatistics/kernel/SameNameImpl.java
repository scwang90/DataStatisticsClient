package com.datastatistics.kernel;

import com.andrestrequest.http.DefaultRequestHandler.HttpMethod;
import com.andrestrequest.impl.AbstractRequester;
import com.datastatistics.model.SnSameName;

public class SameNameImpl extends AbstractRequester{

	public void submit(SnSameName name) throws Exception{
		// TODO Auto-generated method stub
		HttpMethod method = HttpMethod.POST;
		String path = "/SnSameName/Post";
		handler.doRequest(method, path ,null, name, null);
	}

}
