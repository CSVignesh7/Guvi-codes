import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
class FirstRepeatedElement{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
 	    int arr[]=new int[length];
	    for(int i=0;i<arr.length;i++){
	    	arr[i]=sc.nextInt();
	    }
	    for(int i=0;i<arr.length-1;i++){
	    	for(int j=i+1;j<arr.length;j++){
	    	if(arr[i]==arr[j]){
	    		System.out.println(arr[i]);
	    		return;
	    	}
	    	}
	    }
	    
	}
}