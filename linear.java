import java.util.*;
import java.lang.*;

public class linear{
	public static int linear_search(int[] array,int k){
		for(int i=0;i<array.length;i++){
			if(array[i]==k){
				return i;
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
		System.out.println("enter key to search : ");
		int key=sc.nextInt();
		int index= linear_search(arr,key);
		if(index==-1){
			System.out.println("not found");
		}
		else{
			System.out.println(index+1);
		}
	}
}
