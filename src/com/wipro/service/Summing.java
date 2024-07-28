package com.wipro.service;
public class Summing implements Runnable{
	private  Long counter=0L;
	
	public Summing() {
		
	}
	
	public Summing(Long counter) {
		this.counter=counter;
	}
	
	@Override
	public void run() {
		Long sum=0L;
		for(long i=1;i<=counter;i++) {
			sum = sum + i;
		}
		
		System.out.println(sum);
		
	}


	@Override
	public String toString() {
		return "Summing [counter=" + counter + "]";
	}


}
