package com.appdirect.integration;

import com.appdirect.domain.AbstractDomain;
/**
 * @author sunil.kumar.lakhera
 *
 */
public interface AppDirectService {
	
	<T extends AbstractDomain , V> T callAppDirect(String urlProperty, V request, Class<T> responseClass);

}
