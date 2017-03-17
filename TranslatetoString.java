import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
class TranslatetoString{
	public static List<String> list=new ArrayList<String>();
	  public  String  getFirstString(int[] arr,char[] chararray){
	    String firstString="";
	    for(int i=0;i<arr.length;i++){
	    	String tm=Character.toString(chararray[arr[i]]);
	    	firstString=firstString.concat(tm);
	    }
	    return firstString;
	}
	public void changedStrings(int[] arr,char chararray[],String fs){
		int j=0;
        for(int i=0;i<arr.length-1;i++){
       	 StringBuffer sb=new StringBuffer(fs);
       	 int num=(arr[j]*10)+arr[j+1];
         if(num<27){
       	  String rp=Character.toString(chararray[num]);
       	  sb.replace(i,i+2, rp);
       	  if(checkString(sb.toString())!=true){
       		  list.add(sb.toString());
              j=j+1;		  
       	  }
         }
         
        }
	}
	public boolean checkString(String ss){
		  for(String s:list){
			  if(s.equals(ss)){
                return true;				  
			  }
		  }
		  return false;
		
	}
	
	public void getLast(int[] arr,char[] chararray,String fs){
		String ls="";
		for(int i=0;i<arr.length;i++){
			if(i<arr.length-1){
				int num=arr[i]*10+arr[i+1];
			if(num<26){
				String cts=Character.toString(chararray[num]);
				ls=ls.concat(cts);
				i=i+1;

			}
			}
			else{
				String cts=Character.toString(chararray[arr[i]]);
				ls=ls.concat(cts);
			}
		}
        if(checkString(ls)!=true){ 
		list.add(ls);
	}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		char chararray[]={'\0','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	    String str=sc.next();
	    TranslatetoString obj=new TranslatetoString();
	   
	    char numarray[]=str.toCharArray();
	    int arr[]=new int[str.length()];
	    for(int i=0;i<str.length();i++){
	    	String num=Character.toString(numarray[i]);
	    	int nu=Integer.parseInt(num);
	    	arr[i]=nu;
	    }
	    String fs=obj.getFirstString(arr,chararray);
         list.add(fs);
         obj.changedStrings(arr, chararray, fs);
         obj.getLast(arr,chararray,fs);
         System.out.println(list.size());
        // System.out.println(list);
}
}
