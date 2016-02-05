package observer;

import subject.Subject;
import subject.WeatherData;
import displayElement.DisplayElement;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(Subject data, Object arg) {
		// TODO Auto-generated method stub
		if (data instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)data;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}
	
}
