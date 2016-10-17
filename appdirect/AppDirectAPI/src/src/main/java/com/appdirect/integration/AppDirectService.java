package com.appdirect.integration;

import com.appdirect.domain.AbstractResponse;

public interface AppDirectService {
	
	<T extends AbstractResponse , V> T callAppDirect(String urlProperty, V request, Class<T> responseClass);

}
