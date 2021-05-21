package com.info.java.garage_task;

public class Motorcycle extends Vehicle {

	// attributes
	private boolean helmet;
	private String twoWheels;
	private boolean doesBikeHaveRadio;

	// constructors
	public Motorcycle(boolean helmet, String twoWheels, boolean radio) {
		this.helmet = true;
		this.twoWheels = twoWheels;
		this.doesBikeHaveRadio = true;
		// methods

	}

	public boolean isHelmet() {
		return helmet;
	}

	public void setHelmet(boolean helmet) {
		this.helmet = helmet;
	}

	public String getTwoWheels() {
		return twoWheels;
	}

	public void setTwoWheels(String twoWheels) {
		this.twoWheels = twoWheels;
	}

	public boolean isDoesBikeHaveRadio() {
		return doesBikeHaveRadio;
	}

	public void setDoesBikeHaveRadio(boolean doesBikeHaveRadio) {
		this.doesBikeHaveRadio = doesBikeHaveRadio;
	}

}
