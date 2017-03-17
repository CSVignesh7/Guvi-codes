import java.util.*;
public class LCP 
{
    public static void main(String[] args) 
   {
        Scanner sc= new Scanner(System.in);
        int len=sc.nextInt();int index=0;
        int min=Integer.MAX_VALUE;
        String arr[]=new String[len];
    	String ans="";
        for(int i=0;i<arr.length;i++){
        	arr[i]=sc.next();
        	int stlen=arr[i].length();
        	if(stlen<min){
        		min=stlen;
        		index=i;
        	}
        }
        	char[] small=arr[index].toCharArray();
        	aa:
        	for(int i=0;i<small.length;i++){
        		boolean che=true;
        		for(int j=0;j<arr.length;j++){
        		  char temp=arr[j].charAt(i);
        		  if(temp==small[i]){
        			  che=true;
        			  //ans=ans+small[i];
        		  }
        		  else{
        			  break aa;
        		  }
        	  }
        		if(che){
        			ans=ans+small[i];
        		}
        	    }
        	System.out.println(ans);	
    }
}