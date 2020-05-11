package searchAlgo;

public class BinarySearch {

	public static void main(String[] args) {
		int searchKey = 10;
		int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
		int midValue = (arr.length - 1)/ 2;
		System.out.println("midValue"+arr[midValue]);
		if(searchKey == arr[midValue]){
			System.out.println("Element is found in position"+arr[midValue]);
		}else if(searchKey > arr[midValue]){
			System.out.println("greater than"+arr[midValue]);
			System.out.println("greater than"+ (arr.length - 1));
			for(int i = 4; i < 8; i++){
				System.out.println("I"+i);
				if(searchKey == arr[i]){
					System.out.println("Element is found in position"+i);
				}else{
					break;
				}
			}
			
		}else if(searchKey < arr[midValue]){
			System.out.println("greater than");
			for(int i = 0; i < 5; i++){
				if(searchKey == arr[i]){
					System.out.println("Element is found in position"+i);
				}else{
					
				}
			}
		}

	}

}
