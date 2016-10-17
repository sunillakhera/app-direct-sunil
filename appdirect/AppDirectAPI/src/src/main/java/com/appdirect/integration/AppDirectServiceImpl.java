package com.appdirect.integration;

import java.net.URI;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

import com.appdirect.domain.AbstractResponse;

public class AppDirectServiceImpl implements AppDirectService {
	
	private RestTemplate restTemplate;

	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public <T extends AbstractResponse, V> T callAppDirect(String urlProperty,
			V request, Class<T> responseClass) {
		T result = null;
		try{
		URI uri= new URI(urlProperty);
		HttpHeaders header = new HttpHeaders();
	//	header.putAll(map);
		
		HttpEntity<Object> entity = new HttpEntity<Object>(request, header);
		
		//requestLogging(uri, request);
		//restTemplate.setRequestFactory(requestFactory);
		result = restTemplate.postForObject(uri, entity, responseClass);
		}catch(ResourceAccessException e){
			throw new AppDirectServiceException("ConnectionError",new Throwable());
		}catch(Exception e){
			throw new AppDirectServiceException("ExceptionCaught",new Throwable());
		}
		if(result.isFatelError()){
			
			throw new AppDirectServiceException(new Throwable());
		}
		//responseLogging();
		return result;
	}



}
