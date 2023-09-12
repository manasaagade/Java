import java.lang.*;
import java.util.*;

public class odd_integers{
	public void printarr(int[] array){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}

	public static void main(String[] args){
		int[] arr=new int[5];
		odd_integers od=new odd_integers();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		int c=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0){
				c++;
			}
		}
		int index=0;
		int[] result=new int[c];  //new array for only odd values
		for(int i=0;i<arr.length;i++){	
			if(arr[i]%2!=0){
				result[index]=arr[i];
				index++;
			}
		}
		od.printarr(result);
		
	}
}