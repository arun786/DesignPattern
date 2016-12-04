package com.arun.constant;

import com.arun.changes.FlyBehaviour;

public abstract class Animal {
	protected FlyBehaviour fly; // Strategy pattern, separate those which changes

	public abstract void makeSound();

	public abstract void eatingHabits();

	public void performfly() {
		System.out.println(fly.fly());
	}

}
