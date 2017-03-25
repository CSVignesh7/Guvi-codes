import java.util.*;
public class arrminmax 
{
	public static void main(String args[]){
	   Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6};
        int temp[]=new int[arr.length];
        int high=arr.length-1;
        int low=0;
        for(int i=0;i<arr.length;i++){
        	if(i%2==0){
        		temp[i]=arr[high--];
        	}
        	else{
        		temp[i]=arr[low++];
        	}
        }
        System.out.println(Arrays.toString(temp));
	}
}