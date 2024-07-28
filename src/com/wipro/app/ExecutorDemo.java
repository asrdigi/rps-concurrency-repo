package com.wipro.app;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
public class ExecutorDemo {
	public static void main(String[] args) {
		Executor executor = Executors.newSingleThreadExecutor();
		
		/*
		 * pass Runnable object
		 *
		 * Thread[pool-1-thread-1,5,main]
		 */
		executor.execute(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread());
				
			}
			
		});
	}
}
