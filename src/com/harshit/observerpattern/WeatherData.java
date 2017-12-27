package com.harshit.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
	private List<Observer> observerList;
	private float temprature;
	private float pressure;
	private float humidity;
	
	public WeatherData() {
		this.observerList = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		this.observerList.add(o);
	}
	
	@Override
	public void removeObserver(Observer o) {
		if(observerList.isEmpty()) {
			throw new IllegalStateException();
		}
		else {
			int index = observerList.indexOf(o);
			if(index >= 0) {
				observerList.remove(index);
			}
		}
	}
	
	@Override
	public void notifyObservers() {
		for(Observer o: observerList) {
			o.update(temprature, humidity, pressure);
		}
	}
	
	public void setWeatherData(float temprature, float humidity, float pressure) {
		this.temprature = temprature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.notifyObservers();
	}
	
	public float getTemprature() {
		return this.temprature;
	}
	
	public float getHumidity() {
		return this.humidity;
	}
	
	public float getPressure() {
		return this.pressure;
	}
}
