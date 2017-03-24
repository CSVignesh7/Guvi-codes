import java.util.*;
public class largestSubArray
{
    public static void main(String[] args) 
   {
         Scanner sc= new Scanner(System.in);
         int arrlen=sc.nextInt();
         int arr[]=new int[arrlen];
         
         for(int i=0;i<arrlen;i++){
        	 arr[i]=sc.nextInt();
         }
    int star=0,end=0,max=0,sum=0,s=0;
    for(int i=0;i<arr.length;i++){
    	sum=sum+arr[i];
    	if(max<sum){
    		max=sum;
    		star=s;
    		end=i;
    	}
    	if(sum<0){
    		sum=0;
    		s=i+1;
    	}
    }
   //System.out.println(max);
    for(int i=star;i<=end;i++){
    	System.out.print(" "+arr[i]);
    }
   }
}