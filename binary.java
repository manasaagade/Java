import java.util.*;
import java.lang.*;

public class binary{
	public static int binary_search(int[] arr,int k){
		int start=0,end=arr.length-1;
		while(start<=end){
			int mid=(start+end)/2;

			if(arr[mid]==k){
				return mid;
			}
			else if(arr[mid]<k){
				start=mid+1;
			}
			else{
				end=mid-1;
			}
		}
		return -1;
	}
	public static void main(String args[]){
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("enter key to search:");
		int key=sc.nextInt();
		int index=binary_search(arr,key);

		if(index==-1){	
			System.out.println(index);
		}
		else{
			System.out.println(index+1);
		}
	}
}