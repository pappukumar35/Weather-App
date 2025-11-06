package com.cfs.Weather_App.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cfs.Weather_App.dto.ForCast;
import com.cfs.Weather_App.dto.Root;
import com.cfs.Weather_App.dto.WeatherResponse;

@Service
public class WeatherService {
	
	@Value("${weather.api.key}")
	private String apiKey;
	
	@Value("${weather.api.url}")
	private String apiUrl;
	
	private RestTemplate template=new RestTemplate();
	
	public String test() {
		return "get.Data";
	}
	
	public WeatherResponse getData(String city) {
		String url=apiUrl + "?Key="+apiKey+"&q="+city;
		Root response=template.getForObject(url, Root.class);
		WeatherResponse weatherResponse=new WeatherResponse();
		
		weatherResponse.setCity(response.getLocation().name);
		weatherResponse.setRegion(response.getLocation().region);
		weatherResponse.setCountry(response.getLocation().country);
		
		String condition= response.getCurrent().getCondition().getText();
		weatherResponse.setCondition(condition);
		weatherResponse.setTemperature(response.getCurrent().getTemp_c());
		
		return weatherResponse;
	}
	
	public ForCast getForeCast(String city, int days) {
		ForCast forCast=new ForCast();
	     WeatherResponse weatherResponse=getData(city);
	     foreCast.setWeatherResponse(weatherResponse);
	}


}
