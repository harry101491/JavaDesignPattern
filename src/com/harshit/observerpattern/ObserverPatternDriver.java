package com.harshit.observerpattern;

public class ObserverPatternDriver {
	public static void main(String args[]) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionObserver currentCondition = new CurrentConditionObserver(weatherData);
		
		weatherData.setWeatherData(2.5f, 50.0f, 76.5f);
		weatherData.setWeatherData(34.3f, 43.8f, 6.5f);
	}
}
