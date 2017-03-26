import java.util.*;
public class longestSubstring
{
   public static void main(String  args[]){
	   Scanner sc=new Scanner(System.in);
	   String str=sc.next();
       String temp="",max="";
	   for(int i=0;i<str.length();i++){
		   char c=str.charAt(i);
		   boolean isContains=check(temp,c);
		   if(isContains){
			   temp="";
			   temp=temp.concat(Character.toString(c));
		   }
		   else{
			   temp=temp.concat(Character.toString(c));
			   
		   }
		   if(temp.length()>max.length()){
			   max=temp;
		   }
	   }
	   System.out.println(max);
   }
   public static boolean check(String str,Character c){
	   
	   for(int i=0;i<str.length();i++){
		   if(c.equals(str.charAt(i))){
			   return true;
		   }
	   }
	   return false;
   }
}