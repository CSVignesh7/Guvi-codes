
import java.util.*;
public class arrayPuzzle 
{
	public void product(int[] arr,int arrlen){
		
		int[] left=new int[arrlen];
		int[] right=new int[arrlen];
		int pro[]=new int[arrlen];
		
		left[0]=1;
		right[arrlen-1]=1;
		
		for(int i=1;i<left.length;i++){
			left[i]=arr[i-1]*left[i-1];
		}
		//System.out.println(Arrays.toString(left));
		for(int i=arrlen-2;i>=0;i--){
			right[i]=arr[i+1]*right[i+1];
		}
		//System.out.println(Arrays.toString(right));
		for(int i=0;i<arrlen;i++){
			pro[i]=left[i]*right[i];
		}
		System.out.println(Arrays.toString(pro));
	}
    public static void main(String[] args) 
   {
         Scanner sc= new Scanner(System.in);
          int arrlen=sc.nextInt();
          int arr[]=new int[arrlen];
           for(int i=0;i<arrlen;i++){
        	  arr[i]=sc.nextInt();
          }
          arrayPuzzle obj=new arrayPuzzle();
          obj.product(arr,arrlen);
          
           
    }
}