#second maximum element in the array

import java.lang.*;
import java.util.*;

public class sec_max{
	public static void main(String args[]){
		int arr[]=new int[5];
		sec_max ma=new sec_max();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		int max=Integer.MIN_VALUE;
		int sec=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				sec=max;
				max=arr[i];
			}
			else if(arr[i]>sec && arr[i]!=max){	
				sec=arr[i];
			}	
		}
		System.out.println("second largest : "+sec);
	}
}
