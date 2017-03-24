import java.util.*;
public class matS3
{
    public static void main(String[] args) 
   {
         Scanner sc= new Scanner(System.in);
         int rowlen=sc.nextInt();
         int collen=sc.nextInt();
         int arr[][]=new int[rowlen][collen];
         
         for(int i=0;i<arr.length;i++){
        	 for(int j=0;j<arr[i].length;j++){
        		 arr[i][j]=sc.nextInt();
        	 }
         }
         
        for(int i=0;i<arr.length;i++){
        	 for(int j=0;j<arr[i].length;j++){
        	 if(arr[i][j]==0){
        		makerow(arr,i); 
        	 }
         }
       }
         for(int i=0;i<arr.length;i++){
        	 for(int j=0;j<arr[i].length;j++){
        	 if(arr[i][j]==0){
        		makecol(arr,j,collen); 
        	}
        }
       }
         
         for(int i=0;i<arr.length;i++){
        	 for(int j=0;j<arr[i].length;j++){
        		 if(arr[i][j]>1){
        			 arr[i][j]=0;
        		 }
        	 System.out.print(" "+arr[i][j]);
         }
        	 System.out.println();
   }
         
}
    public static void makerow(int[][] arr,int  row){
    	for(int i=0;i<arr.length;i++){
    		if(arr[row][i]==1)
    		arr[row][i]=arr[row][i]+1;
    	}
    }
   public static void makecol(int[][] arr,int col,int collen){
    	for(int i=0;i<collen;i++){
    		if(arr[i][col]==1 || arr[i][col]==2)
    		arr[i][col]=arr[i][col]+1;
    	}
    }
}