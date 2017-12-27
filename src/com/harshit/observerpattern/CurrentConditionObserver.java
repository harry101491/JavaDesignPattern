package com.harshit.observerpattern;

public class CurrentConditionObserver implements Observer, DisplayElement {
	
	private float temprature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionObserver(Subject subject) {
		this.weatherData = subject;
		weatherData.registerObserver(this);
	}
	
	
	@Override
	public void display() {
		System.out.println("Inside the display of the current condition display method");
		System.out.println("the current temprature is: "+ this.temprature + "\nthe current humidity is: "+ this.humidity);
	}

	@Override
	public void update(float temprature, float humidity, float pressure) {
		this.temprature = temprature;
		this.humidity = humidity;
		display();
	}

}
