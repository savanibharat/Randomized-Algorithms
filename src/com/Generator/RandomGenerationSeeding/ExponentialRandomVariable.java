package com.Generator.RandomGenerationSeeding;

public class ExponentialRandomVariable implements RandomVariable {

	protected double m=1;
	public ExponentialRandomVariable(double m){
		
		this.m=m;
	}
	
	@Override
	public double nextDouble() {
		
		return -m*Math.log(RandomNumberGenerationSeed.nextDouble());
	}
	
	
}
