package javaLogicalprogramming;

public class FloydTriangle {

	public FloydTriangle() {
		// TODO Auto-generated constructor stub
	}
	/*Note- Floyd Triangle is like
	1
	2 3
	4 5 6
	7 8 9 10*/
	public static void main(String[] args) {
		int j = 0;
		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= i; k++) {
				++j;
				System.out.print(j);
			}
			System.out.println("");
		}
		//trianglePattern1();
		//trianglePattern2();
		//trianglePattern3();
		//trianglePattern4();
		//trianglePattern5();
		//trianglePattern6();
		//trianglePattern7();
		//trianglePattern8();
		//trianglePattern9(); //complex
		//trianglePattern10();
		//trianglePattern11();
		//trianglePattern12();
		//trianglePattern13();
		trianglePattern14();

	}
  /*1 
	1 2 
	1 2 3 
	1 2 3 4 
	1 2 3 4 5*/ 
	private static void trianglePattern1() {
		int j = 0;
		for (int i = 1; i <= 5; i++) {
			j = 1;
			for (int k = 1; k <= i; k++) {
				System.out.print(j);
				j++;
			}
			System.out.println("");
		}
	}
   /** 
	* * 
	* * * 
	* * * * 
	* * * * **/
	private static void trianglePattern2() {
		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
   /*0 
    0 1 
   0 1 2 
  0 1 2 3 
0 1 2 3 4*/ 
	private static void trianglePattern3() {
		for (int i = 1; i <= 5; i++) {
			int j = 0;
			for (int t = 0; t < 5 - i; t++) {
                System.out.print(" ");
            }
			for (int k = 1; k <= i; k++) {
				System.out.print(j + " ");
				j++;
			}
			System.out.println("");
		}
	}
	/*  1 
	   2 2 
	  3 3 3 
	 4 4 4 4 
	5 5 5 5 5*/
	private static void trianglePattern4() {
		for (int i = 1; i <= 5; i++) {
			int j = i;
			for (int t = 0; t < 5 - i; t++) {
                System.out.print(" ");
            }
			for (int k = 1; k <= i; k++) {
				System.out.print(j + " ");
				
			}
			System.out.println("");
		}
	}
 /*	 5 
    5 4 
   5 4 3 
  5 4 3 2 
 5 4 3 2 1*/
	private static void trianglePattern5() {
		for (int i = 1; i <= 5; i++) {
			int j = 5;
			for (int t = 0; t < 5 - i; t++) {
                System.out.print(" ");
            }
			for (int k = 1; k <= i; k++) {
				System.out.print(j + " ");
				j--;
			}
			System.out.println("");
		}
	}
   /*1 2 3 4 5 
	  1 2 3 4 
	   1 2 3 
	    1 2 
	     1
	 */
	private static void trianglePattern6() {
		int count = 5;
		for (int i = 1; i <= 5; i++) {
			//int j = 5;
			for (int t = 0; t < 5 + i; t++) {
                System.out.print(" ");
            }
			for (int k = 1; k <= count; k++) {
				System.out.print(k + " ");
				//j--;
			}
			System.out.println("");
			count--;
		}
	}
	/*  1 
	   2 1 
	  3 2 1 
	 4 3 2 1 
	5 4 3 2 1
		 */
	private static void trianglePattern7() {
        for (int i = 1; i <= 5; i++) {
            for (int t = 0; t < 5 - i; t++) {
				System.out.print(" ");
			}
			for (int k = 1, l = i; k <= i; k++) {
				System.out.print(l + " ");
				l--;
			}
			System.out.println("");

		}
	}
	/*  1 
	   2 7 
	  3 8 13 
	 4 9 14 19 
	5 10 15 20 25
			 */
	private static void trianglePattern8() {
     for (int i = 1; i <= 5; i++) {
         for (int t = 0; t < 5 - i; t++) {
				System.out.print(" ");
			}
			for (int k = 1, l = i; k <= i; k++) {
				System.out.print(l + " ");
				l=l+5;
			}
			System.out.println("");

		}
	}
	/*  1 
	   1 1 
	  1 2 1 
	 1 3 3 1 
	1 4 6 4 1
				 */
    private static void trianglePattern9() {
         for (int i = 1; i <= 5; i++) {
           for (int t = 0; t < 5 - i; t++) {
				System.out.print(" ");
			}
            int temp = 1; 
			for (int k = 1;k <= i; k++) {
				System.out.print(temp+ " ");
				temp = (temp * (i - k)) / (k);
			}
			System.out.println("");

		}
	}
	 /* 5 
	   4 5 
	  3 4 5 
	 2 3 4 5 
	1 2 3 4 5
	*/
   private static void trianglePattern10() {
	   int count = 1;
       for (int i = 5; i >=1; i--) {
            for (int t = 0; t < 5 - count; t++) {
				System.out.print(" ");
			}
            for (int k = 1, l = i;k <= count; k++) {
				System.out.print(l+ " ");
				l=l+1;
			}
			System.out.println("");
			count++;

		}
	}
	 /* 1
	   121
	  12321
	 1234321
	123454321
	*/
  private static void trianglePattern11() {
		System.out.println("***********************");
		int columnCount = 0;
		for (int i = 1; i <= 5; i++) {
			for (int t = 0; t < 5 - i; t++) {
				System.out.print(" ");
			}
			int l = 1;
			int count = 0;
			int j = 0;
			if (i == 1) {
				j = 1;
			} else {
				j = columnCount + 2;

			}
			columnCount = 0;
			for (int k = 1; k <= j; k++) {
				System.out.print(l + " ");
				if (count + 1 >= i) {
                    l = l - 1;
				} else {
                    l = l + 1;
				}
				count++;
				columnCount++;
			}
			System.out.println("");
		}
		System.out.println("***********************");  
	}
	/*  1 
	   2 7 
	  3 8 13 
	 4 9 14 19 
	5 10 15 20 25
		*/
	private static void trianglePattern12() {
		System.out.println("***********************");
		int l = 1;
		for (int i = 1; i <= 5; i++) {
			for (int t = 0; t < 5 - i; t++) {
				System.out.print(" ");
			}
			int j = l;
			for (int k = 1; k <= i; k++) {
				System.out.print(j + " ");
				j = j + 5;
			}
			System.out.println("");
			l++;
		}
		System.out.println("***********************");  
	}
	/*  1 
	   1 0 
	  1 0 1 
	 1 0 1 0 
	1 0 1 0 1 */
	private static void trianglePattern13() {
		System.out.println("***********************");
		for (int i = 1; i <= 5; i++){
			for (int t = 0; t < 5 - i; t++){
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				if((k % 2) == 0){
					System.out.print(0+ " ");
				}else{
					System.out.print(1 + " ");
				}
			}
			System.out.println("");
		}
		System.out.println("***********************");  
	}
	/*  1 
	   2 6 
	  3 7 10 
	 4 8 11 13 
	5 9 12 14 15 */
	private static void trianglePattern14() {
		System.out.println("***********************");
		int l = 1;
		//int j = 1;
		for (int i = 1; i <= 5; i++){
			for (int t = 0; t < 5 - i; t++){
				System.out.print(" ");
			}
			int j =l;
			for (int k = 1; k <= i; k++) {
				if(k == 2){
					j = j + 4;
					System.out.print(j+ " ");
				}else if(k == 3){
					j = j + 3;
					System.out.print(j+ " ");
				}else if(k == 4){
					j = j + 2;
					System.out.print(j+ " ");
				}else if(k == 5){
					j = j + 1;
					System.out.print(j+ " ");
				}else if(k == 1){
					System.out.print(j+ " ");
				}
			}
			l++;
			System.out.println("");
		}
		System.out.println("***********************");  
	}
	
	
	
}
