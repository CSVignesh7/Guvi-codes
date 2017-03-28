import java.util.*;
public class arrayRotate {
	public void rotate(int arr[]){
		 for(int i=arr.length-1;i>=1;i--){
			 int temp=arr[i];
			 arr[i]=arr[i-1];
			 arr[i-1]=temp;
		 }
		     
	}
     public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
       int arrlen=sc.nextInt();
       int arr[]=new int[arrlen];
       for(int i=0;i<arr.length;i++){
    	   arr[i]=sc.nextInt();
       } 
       int rotate=sc.nextInt();
       arrayRotate obj=new arrayRotate();
       
       for(int i=0;i<=rotate;i++){
    	   obj.rotate(arr);
       }
       for(int i=0;i<arr.length;i++){
    	   System.out.println(arr[i]);
       }
     }
}
