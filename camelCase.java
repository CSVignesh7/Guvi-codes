import java.util.*;
public class camelCase {
    public static void main(String[] args) 
   {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        boolean isCamel=true;
        for(int i=0;i<str.length();i++){
        	if(Character.isLowerCase(str.charAt(i))){
        		isCamel=false;
        		break;
        	}
        }
        System.out.println(isCamel);
    }
}