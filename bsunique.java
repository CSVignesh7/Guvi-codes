import java.util.*;
public class bsunique
{
	public static void main(String args[]){
	   Scanner sc=new Scanner(System.in);
	   String str=sc.next();
	   char arr[]=str.toCharArray();
       Arrays.sort(arr);
       String ans="";
       for(int i=0;i<arr.length;i++){
    	   int fo=findfirst(arr,arr[i]);
    	   int lo=findlast(arr,arr[i]);	   
    	   if(fo==lo){
    		   ans=ans.concat(Character.toString(arr[i]));
    	   }
       }
       System.out.println(ans);
	}
	static int findfirst(char[] values,char key){
		int low = 0;
		int high = values.length -1 ;
 
		while(low <= high){
			int mid = (low+high) / 2;
			if(key == values[mid] && (mid == 0 || key != values[mid-1]))
				return mid;
			else if(key <= values[mid])
				high = mid - 1;
			else
				low = mid + 1;	
		}
		return -1;
	}
	static int findlast(char[] values,char key){
		int low = 0;
		int high = values.length -1 ;
		int arrayLength = high; 
 
		while(low <= high){
			int mid = (low+high) / 2;			
			if(key == values[mid] && (mid == arrayLength || key != values[mid+1]))
				return mid;
			else if(key >= values[mid])
				low = mid + 1;
			else
				high = mid - 1;		
		}
		return -1;
	}
}