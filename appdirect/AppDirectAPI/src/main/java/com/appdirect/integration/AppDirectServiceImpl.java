package com.appdirect.integration;

import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

import com.appdirect.domain.AbstractDomain;

/**
 * @author sunil.kumar.lakhera
 *
 */
public class AppDirectServiceImpl implements AppDirectService {
	
	private RestTemplate restTemplate;
  
	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
    Logger logger = Logger.getLogger("AppDirectServiceImpl");
	public <T extends AbstractDomain, V> T callAppDirect(String urlProperty,
			V request, Class<T> responseClass) {
		T result = null;
		try{
		URI uri= new URI(urlProperty);
		HttpHeaders header = new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		// this information is dummy need to be set  by using Oauth aunthentication
		header.set("oauth_signature_method", "HMAC-SHA1");
		header.set("oauth_nonce", "VeJO1tP7RKUE1rz");
		header.set("oauth_timestamp", "1438728054");
		header.set("oauth_signature", "appdirect-91");
	
		HttpEntity<Object> entity = new HttpEntity<Object>(request, header);
		requestLogging(uri, entity);
		restTemplate.setRequestFactory(clientHttpRequestFactory());
		
		result = restTemplate.postForObject(uri, entity, responseClass);
		}catch(ResourceAccessException e){
			throw new AppDirectServiceException("ConnectionError",new Throwable());
		}catch(Exception e){
			throw new AppDirectServiceException("ExceptionCaught",new Throwable());
		}
		if(result.isFatelError()){
			
			throw new AppDirectServiceException(new Throwable());
		}
		
		responseLogging(result);
		return result;
	}
    //TODO: logging request
	public  <V>void requestLogging(URI uri, HttpEntity<V> entity  ){
		logger.log(Level.INFO, "");
	}
	//TODO: logging response
	public <T> void responseLogging(T result){
		
		logger.log(Level.INFO, "");
	}
	
	 private static ClientHttpRequestFactory clientHttpRequestFactory() {
	        
	        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
	        factory.setReadTimeout(30000); // setting timeout as read timeout
	        factory.setConnectTimeout(30000); // setting timeout as connect timeout
	        return factory;
	    }  


}
