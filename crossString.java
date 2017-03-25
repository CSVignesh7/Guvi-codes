import java.util.*;
public class crossString
{
	public static void main(String args[]){
	   Scanner sc=new Scanner(System.in);
	   String str=sc.next();
	   char arr[]=str.toCharArray();
	   int mid=arr.length/2;
	   int left=mid;
	  int right=mid; 
	  for(int i=0;i<arr.length;i++){
		  System.out.print(" "+arr[i]);
	  }
	  System.out.println();
	  for(int i=0;i<(arr.length/2)-1;i++){
	  		   for(int j=0;j<arr.length;j++){
	  			  
	  			    if(j<left){
	  				   System.out.print(" "+arr[j]);
	  			   }
	  			   else if(j>right){
	  					   System.out.print(" "+arr[j]);
	  			   }
	  			   else{
	  				   System.out.print("  ");
	  				   
	  			   }
	  			   
	  		   }
	  		   System.out.println();
	  		   left--;
	  		   right++;
	  	   }
	   int last=arr.length-1;
	   for(int i=0;i<arr.length/2;i++){
		   for(int j=0;j<arr.length;j++){
			   if(j<=i){
				   System.out.print(" "+arr[j]);
			   }
			   else if(j>=last){
				   System.out.print(" "+arr[j]);
				   
			   }
			   else{
				   System.out.print("  ");
			   }
		   }
		   last--;
		   System.out.println();
	   }
	   for(int i=0;i<arr.length;i++){
			  System.out.print(" "+arr[i]);
		  }
		  System.out.println();
	}
}