import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
class subString{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a1length=sc.nextInt();
		int a2length=sc.nextInt();
		int a1[]=new int[a1length];
		int a2[]=new int[a2length];
		for(int i=0;i<a1.length;i++){
			a1[i]=sc.nextInt();
		}
		for(int i=0;i<a2.length;i++){
			a2[i]=sc.nextInt();
		}
		Arrays.sort(a1);
		Arrays.sort(a2);
		boolean isPresent=true;
		for(int i=0;i<a1.length;i++){
			 isPresent=check(a1[i],a2);
			if(isPresent==false){
				System.out.println("Not SubString");
				break;
			}
		}
		if(isPresent){
			System.out.println("SubString");
		}
	}
	public static boolean check(int key,int arr[]){
		int low=0;
		int high=arr.length-1;
		while(low<=high){
			int mid=(low+high)/2;
			 if(key<arr[mid]){
				high=mid-1;
			}
			else if(key>arr[mid]){
				low=mid+1;
			}
			else{
				return true;
			}
		}
		return false;
	}
}