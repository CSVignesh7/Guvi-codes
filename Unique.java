import java.util.Arrays;
import java.util.Scanner;
class Unique{
   
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int arrLength=sc.nextInt();
		int arr[]=new int[arrLength];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]!=arr[i+1]){
				System.out.println(arr[i]);
				break;
			}
			else{
				i=i+1;
			}
		}
	}
}
