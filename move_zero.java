import java.util.*;
import java.lang.*;

public class move_zero{	
	public static void main(String args[]){
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int j=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0 && arr[j]==0){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			else if(arr[j]!=0){
				j++;
			}
		
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}