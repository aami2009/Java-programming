package pagination;

import java.util.*;
public class Pagination {
    private static String list = "30103020509010305678";
    private static int pageCount = -1;
    private static int dataFetchFrom = 0;
    private static int dataFetchTo = 0;
    private static int dataLength = 4;
	public static void main(String[] args) {
			
		next();
		next();
		previous();
       
	}
	private static void previous(){
		System.out.println("pageCount"+pageCount);
		if(pageCount == 0){
			
		}else{
			
			pageCount --;
			dataFetchFrom = pageCount * dataLength;
			dataFetchTo = dataLength;
			System.out.println("pageCount  pre"+pageCount);
			System.out.println("dataFetchFrom pre"+dataFetchFrom);
			System.out.println("dataFetchTo pre"+dataFetchTo);
			String subString = list.substring(dataFetchFrom, dataFetchTo);
		    System.out.println("subString"+subString);
		}
	}
    private static void next(){
    	
    	++pageCount;
    	dataFetchFrom = pageCount * dataLength;
    	dataFetchTo = dataLength;
    	System.out.println("pageCount  next"+pageCount);
		System.out.println("dataFetchFrom next"+dataFetchFrom);
		System.out.println("dataFetchTo next"+dataFetchTo);
		String subString = list.substring(dataFetchFrom, dataFetchTo);
	    System.out.println("subString n"+subString);
	}

}
