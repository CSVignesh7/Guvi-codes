import java.util.*;
public class coprime

{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int num=0;
		if(a>b){
			num=b;
		}
		else{
			num=a;
		}
		boolean coprime=true;
		for(int i=2;i<=num;i++){
			if(a%i==0 && b%i==0){
				coprime=false;
				break;
			}
		}
		System.out.println(coprime);
		
	}
}