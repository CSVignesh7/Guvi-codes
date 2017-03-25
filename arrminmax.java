import java.util.*;
public class arrminmax 
{
	public static void main(String args[]){
	   Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
        int arr[]=new int[n];
		for(int i=0;i<n;i++){
	    arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
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
