package jdbc.demo.com;

import java.util.Arrays;
import java.util.Iterator;

public class DuplicateRemove {

	public static void main(String[] args) {

		
		int arr[]= {4,5,7,4,1,4,5,8,6};
		Arrays.sort(arr);
		
		for (int i = 0; i <= arr.length; i++) {
			for (int j =i+1; j < arr.length; j++) {
				
				if(arr[i]==arr[j])
				{
					continue;
				}
				else
				{
					System.out.print(arr[i]);
				}
				
				
			}
			
			
		}
	}

}
