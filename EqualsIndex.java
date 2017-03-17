import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
class EqualsIndex{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        List<Integer> list=new ArrayList<Integer>();
 	    int arr[]=new int[length];
	    for(int i=0;i<arr.length;i++){
	    	arr[i]=sc.nextInt();
	    	if(arr[i]==i){
	    	list.add(arr[i]);
	    }
	    }
	    for(int x:list){
	    	System.out.println("the number "+x+" equals its index "+x);
	    }
	}
}