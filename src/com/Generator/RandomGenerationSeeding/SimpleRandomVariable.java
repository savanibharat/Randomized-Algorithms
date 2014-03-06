package com.Generator.RandomGenerationSeeding;

public class SimpleRandomVariable implements RandomVariable{

	@Override
	public double nextDouble() {
	
		return RandomNumberGenerationSeed.nextDouble();
		
	}

	
}
