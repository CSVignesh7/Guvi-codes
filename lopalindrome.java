import java.util.*;
public class lopalindrome
{
	public void findpalindrome(String str){
		String longpalindrome="";
		for(int i=0;i<str.length();i++){
			for(int j=str.length()-1;j>=0 && j!=i;j--){
				if(ispalindrome(str.substring(i,j+1))){
					if(str.substring(i,j+1).length()>longpalindrome.length()){
						longpalindrome=str.substring(i,j+1);
					}
				}
			}
		}
		System.out.println(longpalindrome);
	}
	public boolean ispalindrome(String s){
		int end=s.length()-1;
		for(int i=0;i<s.length()/2;i++){
			if(s.charAt(i)!=s.charAt(end)){
				return false;
			}
			end--;
		}
		return true;
	}
	public static void main(String args[]){
	   Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       lopalindrome obj=new lopalindrome();
       obj.findpalindrome(str);
	}
	
}