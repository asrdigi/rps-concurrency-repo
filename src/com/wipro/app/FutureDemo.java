package com.wipro.app;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import com.wipro.service.Task;
/*
* The instance of the class that implements Callable interface is called
* Callable object
*/
public class FutureDemo {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService service = Executors.newFixedThreadPool(10);
		
		Future<Integer> future = service.submit(new Task());
		
		while(!future.isDone()) {
//			Thread.sleep(10);
			System.out.println("Processing...");
		}
		
		Integer result;
		try {
			result = future.get();
			System.out.println(result);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {		
			e.printStackTrace();
		}
		
		//Anonymous inner class
		Future<Integer> futureNew = service.submit(new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				
				return new Random().nextInt();
			}
			
		});
		
		
		while(!futureNew.isDone()) {
			System.out.println("Working on it...");
			
		}
		
		try {
			Integer resultNew = futureNew.get();
			System.out.println(resultNew);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		
	}
}
