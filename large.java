import java.lang.*;
import java.util.*;

public class large{
	public static int largest(int[] arr){
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		return max;
	}	
	public static void main(String args[]){
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int num=largest(arr);
		System.out.println(num);
	}
}