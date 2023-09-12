import java.util.*;
import java.lang.*;

public class rev_arr{
	public void printarr(int[] array){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}
	public static void main(String[] args){
		int[] arr=new int[5];
		rev_arr rev=new rev_arr();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		int start=0,end=arr.length-1;
		int temp=0;
		while(start<end){
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		rev.printarr(arr);
	}
}