import java.util.*;
public class DelKDigits 
{
    public static void main(String[] args) 
   {
        Scanner sc= new Scanner(System.in);
         String num=sc.next();
         int arr[]=new int[num.length()];
         int del=sc.nextInt();
         for(int i=0;i<arr.length;i++){
        	 int temp=(int)num.charAt(i)-'0';
        	 arr[i]=temp;
         }
         Arrays.sort(arr);
         String ans="";
         for(int i=0;i<arr.length-del;i++){
        	 ans=ans.concat(Integer.toString(arr[i]));
         }
         System.out.println(ans);
   }
}