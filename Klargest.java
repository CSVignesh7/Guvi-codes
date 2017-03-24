import java.util.*;
public class Klargest
{
    public static void main(String[] args) 
   {
         Scanner sc= new Scanner(System.in);
         int arrlen=sc.nextInt();
         int arr[]=new int[arrlen];
         
         for(int i=0;i<arrlen;i++){
        	 arr[i]=sc.nextInt();
         }
       bubblesort(arr);  
       int k=sc.nextInt();
      // System.out.println(Arrays.toString(arr));
       System.out.println("Fourth Largest Element "+arr[3]);
        if(arr.length>=k){
        	System.out.println(arr[k-1]);
        }
    
   }
    public static void bubblesort(int arr[]){
    	 for(int i=0;i<arr.length-1;i++){
    	    	if(arr[i]<arr[i+1]){
    	    		int temp=arr[i];
    	    		arr[i]=arr[i+1];
    	    		arr[i+1]=temp;
    	    		for(int j=i;j>=1;j--){
    	    			if(arr[j]>arr[j-1]){
    	    				int tt=arr[j];
    	    				arr[j]=arr[j-1];
    	    				arr[j-1]=tt;
    	    			}
    	    		}
    	    	}
    	    }
    }
}