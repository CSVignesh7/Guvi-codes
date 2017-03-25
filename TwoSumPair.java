import java.util.*;
public class TwoSumPair
{
    public static void main(String[] args) 
   {
         Scanner sc= new Scanner(System.in);
         int arrlen=sc.nextInt();
        int arr[]=new int[arrlen];
        
        for(int i=0;i<arr.length;i++){
        	arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        int start=0,end=0;
        aa:
        for(int i=0;i<arr.length;i++){
        	for(int j=i+1;j<arr.length;j++){
        		if(arr[i]+arr[j]==tar){
        			start=i;
        			end=j;
        			break aa;
        		}
        	}
        }
        System.out.println(arr[start]+" "+arr[end]);
        	
        
    }
}