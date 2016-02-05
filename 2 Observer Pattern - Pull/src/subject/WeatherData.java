package subject;

import java.util.ArrayList;
import java.util.List;

import observer.Observer;

public class WeatherData implements Subject {
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	private boolean changed = false;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}
	
	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		notifyObservers(null);
	}
	
	@Override
	public void notifyObservers(Object arg) {
		// TODO Auto-generated method stub
		if (changed) {
			for (Observer observer : observers) {
				observer.update(this, arg);
			}
			changed = false;
		}
	}
	
	private void setChanged() {
		changed = true;
	}
	
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
}
