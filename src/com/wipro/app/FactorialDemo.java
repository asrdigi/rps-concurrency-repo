package com.wipro.app;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class FactorialDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService service = Executors.newSingleThreadExecutor();
		
		//service.execute()
		service.submit(new Runnable() {
			@Override
			public void run() {
				long fact=1;
				int n=5;
				while(n>0) {
					fact *= n;
					n--;
				}
				System.out.println(fact);
			}
			
		});
		
		
		Future<Long> future = service.submit(new Callable<Long>() {
			@Override
			public Long call() throws Exception {
				long fact=1;
				int n=5;
				while(n>0) {
					fact *= n;
					n--;
				}
				return fact;
			}
			
		});
		
		while(!future.isDone()) {
			Thread.sleep(1);
		}
		
		System.out.println(future.get());
		
		
		service.shutdown();
	}
	
}
