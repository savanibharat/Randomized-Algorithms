package com.Generator.RandomGenerationSeeding;

public class GenerateRandom {

	public static void main(String[] args) {
		
		
		SimpleRandomVariable s=new SimpleRandomVariable();
		System.out.println(s.nextDouble());
		UniformRandomVariable u=new UniformRandomVariable(10444543543l, 124543543);
		System.out.println(u.nextDouble());
		
	}
	
	
}
