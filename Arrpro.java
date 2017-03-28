import java.util.*;
public class Arrpro
{
   public static void main(String  args[]){
	   Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();
       Checker checker=new Checker();
       element[] arr=new element[size];
       
      for(int i=0;i<size;i++){
    	  int temp=sc.nextInt();
    	  int BinNum=findbin(temp);
    	  arr[i]=new element(temp,BinNum);
      }
      Arrays.sort(arr,checker);
      for(int i=0;i<size;i++){
    	  System.out.println(arr[i].number);
      }
   }
   public static int findbin(int num){
	   int sum=0;
	   while(num>0){
		   if(num%2==1){
			   sum++;
		   }
		   num=num/2;
	   }
	   return sum;
   }
   
}
class element{
	int number;
	int binNum;
	public element(int ele,int BinNum){
		number=ele;
		binNum=BinNum;
	}
	
}
class Checker implements Comparator<element>{
	public int compare(element e1,element e2){
		if(e1.binNum==e2.binNum){
			return e2.number-e1.number;
		}
		else {
            return e2.binNum - e1.binNum;
        }

	}
}
