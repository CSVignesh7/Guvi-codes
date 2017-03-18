import java.util.*;
public class wordReverse 
{
    public static void main(String[] args) 
   {
         Scanner sc= new Scanner(System.in);
         String words=sc.nextLine();
         String[] split=words.split(" ");
         for(int i=split.length-1;i>=0;i--){
        	 System.out.print(split[i]+" ");
         }
         }
}