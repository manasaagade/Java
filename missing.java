import java.lang.*;
import java.util.*;

public class missing{
	public static void main(String args[]){
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		for(int i=0;i<arr.length;i++){
			sum=sum-arr[i];
		}
		System.out.println(sum);
	}
}