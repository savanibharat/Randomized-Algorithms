package com.Generator.RandomGenerationSeeding;

public class RandomNumberGenerationSeed {

	private RandomNumberGenerationSeed(){}
	private static final int a=16807;
	private static final int m=2147483647;
	private static final int q=127773;
	private static final int r=2836;
	private static int seed;
	
	public static void setSeed(int s){
		
		if(s<1||s>=m)
			
			throw new IllegalArgumentException("Invalid Seed");
		seed=s;
	}
	
	public static double nextDouble(){
		
		seed=a*(seed%q)-r*(seed/q);
		if(seed<=0)
			seed+=m;
		return (double)seed/(double)m;
		
	}
	

}
