package com.wipro.service;
import java.util.Random;
import java.util.concurrent.Callable;
public class Task implements Callable<Integer>{
	@Override
	public Integer call() throws Exception {
		Thread.sleep(100);
		return new Random().nextInt();
	}
}
