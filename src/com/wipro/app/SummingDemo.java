package com.wipro.app;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import com.wipro.service.Summing;
public class SummingDemo {
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(10);
		
		for(int i = 1;i<= 500;i++) {
			Runnable runnable = new Summing(100000L+i);
			service.execute(runnable);
		}
		
//		service.shutdown();
		
		List<Runnable> list = service.shutdownNow();
		
		Iterator<Runnable> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		try {
			service.awaitTermination(5, TimeUnit.MINUTES);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
