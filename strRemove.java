import java.util.*;
public class strRemove
{
    public static void main(String[] args) 
   {
         Scanner sc= new Scanner(System.in);
          String str=sc.next();
          char[] chars=str.toCharArray();
          Set<Character> charset=new LinkedHashSet<Character>();
          for(char c:chars){
        	  charset.add(c);
          }
          for(char c:charset){
        	  System.out.print(c);
          }
    }
}