package observer;

import subject.Subject;
import subject.WeatherData;
import displayElement.DisplayElement;

public class StatisticsDisplay implements Observer, DisplayElement {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	private Subject weatherData;

	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(Subject data, Object arg) {
		// TODO Auto-generated method stub
		if (data instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)data;
			float temp = weatherData.getTemperature();
			tempSum += temp;
			numReadings++;
	
			if (temp > maxTemp) {
				maxTemp = temp;
			}
	 
			if (temp < minTemp) {
				minTemp = temp;
			}
			display();
		}
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
	}
	
}
