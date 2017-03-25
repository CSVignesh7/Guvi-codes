import java.util.*;
public class reverseWord
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String split[]=str.split(" ");
		for(int j=split.length-1;j>=0;j--){
			System.out.print(split[j]+" ");
		}
		
	}
}