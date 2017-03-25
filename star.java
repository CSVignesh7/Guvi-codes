import java.util.*;
public class star

{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int len=num*2+1;
		int temp=num;
	     for(int j=temp;j>=1;j--){
	    	 for(int i=1;i<len;i++){
	    		 System.out.print("*");
	    		 if(i==num){
	    			 System.out.print(" ");
	    			 num--;
	    		 }
	    	 }
	    	 len=len-2;
	    	 System.out.println();
	     }
	}
}