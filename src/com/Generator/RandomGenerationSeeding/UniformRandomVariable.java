package com.Generator.RandomGenerationSeeding;

public class UniformRandomVariable implements RandomVariable{
	
	protected double u;
	protected double v;
	
	public UniformRandomVariable(double u,double v){
		
		this.u=u;
		this.v=v;
	}
	
	@Override
	public double nextDouble() {
		
		return u+(v-u)*RandomNumberGenerationSeed.nextDouble();//Vi is nextDouble
		//suffices to produce a sequence of random numbers  u+(v-u)Vi uniformly distributed on the interval (u,v).
	}
	
	

}
