package concurrentPackage;

import java.util.concurrent.RecursiveTask;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinWorkerThread;
import java.util.*;
import java.io.*;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;


public class ForkJoin {
	public static void main(String[] args)
	{
		
		summetion();  
	}
	private static void summetion(){
		 ForkJoinPool pool = new ForkJoinPool();
		  Sum1 sum1 = new Sum1();
	      Sum2 sum2 = new Sum2();
	      
	      pool.execute(sum1);
	      pool.execute(sum2);
	      //pool.execute(sum3);
	      
	      pool.shutdown();
	      
	      Integer results1 = (Integer)sum1.join();
	      System.out.println("results1===========1====="+results1);
	      Integer results2 = (Integer)sum2.join();
	      System.out.println("results2================"+results2);
	}
}	
class Sum1 extends RecursiveTask{

	Integer sum = 0;
	Integer var1 = 30;
	Integer var2 = 20;
	
	@Override
	protected Integer compute(){
		
		Sum1 sum1 = new Sum1();
		sum1.fork();
		sum = sum1.add();
		return sum;
	}
	private Integer add(){
		return sum = var1 + var2;
	}
	
}
class Sum2 extends RecursiveTask{

	Integer sum = 0;
	Integer var1 = 10;
	Integer var2 = 20;
	
	@Override
	protected Integer compute(){
		
		Sum2 sum2 = new Sum2();
		sum2.fork();
		sum = sum2.add();
		return sum;
	}
	private Integer add(){
		return sum = var1 + var2;
	}
	
}
