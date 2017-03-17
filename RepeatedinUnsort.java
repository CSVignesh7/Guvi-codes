import java.util.*;
class RepeatedinUnsort{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
       int len=sc.nextInt();
       int arr[]=new int[len];
       for(int i=0;i<len;i++){
    	   arr[i]=sc.nextInt();
       }
     HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
	  
     for(int i=0;i<arr.length;i++){
		  Integer val=hm.get(arr[i]);
		  if(val==null){
			  val=0;
		  }
		  hm.put(arr[i],val+1);
	  }
       for(Map.Entry<Integer, Integer> entry:hm.entrySet()){
    	if(entry.getValue()==1){
    		System.out.println(entry.getKey());
    	}
    }
	}
}