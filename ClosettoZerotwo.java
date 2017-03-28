import java.util.*;
public class ClosettoZerotwo
{
    public static void main(String[] args) 
   {
        Scanner sc= new Scanner(System.in);
        int len=sc.nextInt();
        int arr[]=new int[len];
        for(int i=0;i<arr.length;i++){
        	arr[i]=sc.nextInt();
        }
        int min1=0,min2=0,sum=0;
        int min=Math.abs(arr[0]+arr[1]);
        for(int i=0;i<arr.length;i++){
        	for(int j=i+1;j<arr.length;j++){
        		sum=Math.abs(arr[i]+arr[j]);
        		if(sum<min){
        			min=sum;
        			 min1=i;
        			 min2=j;
        			 //System.out.println(i+"<--i "+" j-->"+j);
        		}
        	}
        }
        System.out.println(arr[min1]+" "+arr[min2]);
    }
}