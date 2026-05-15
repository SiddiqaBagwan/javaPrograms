import java.util.*;

public class Test{
/*	public String toLower(String text){
		char[] arr=text.toCharArray();
		for(int i=0;i<arr.length;i++){
			if(arr[i]<='Z'&&arr[i]>='A'){
				arr[i]=(char)(arr[i]+32);
			}
		}
		
		return new String(arr);
	}
	
	
	public boolean isEqual(String s2,String s3){
		if(s2.length()!=s3.length()){
			return false;
		}
		for(int i=0;i<s2.length();i++){
			if(s2.charAt(i)!=s3.charAt(i)){
				return false;
			}
		}
		return true;
	}
	
	public String reverse(String s4){
		char[] arr=s4.toCharArray();
		int start=0;
		int end=arr.length-1;
		while(start<end){
			char temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		return new String(arr);
	}
	
	public String Remove(String s5){
		String result="";
		for(int i=0;i<s5.length();i++){
			char ch=s5.charAt(i);
			if(!(ch>='0'&&ch<='9')){
				result+=ch;
			}
		}
		return result;
	}
	
	public int countW(String s6){
		int count=0;
		for(int i=0;i<s6.length();i++){
			if(s6.charAt(i)!=' '&&(i==0||s6.charAt(i-1)==' ')){
				count++;
			}
		}
		return count;
	}
	*/
	
	public String toLower(String s1){
		return s1.toLowerCase();
	}
	
	public boolean isEqual(String s2,String s3){
		return s2.equals(s3);
	}
	
	public String reverse(String s4){
		StringBuilder sb=new StringBuilder(s4);
		return sb.reverse().toString();
	}
	
	public String Remove(String s5){
		return s5.replaceAll("////d","");
	}
	
	public int countW(String s6){
		if(s6.trim().isEmpty()){
			return 0;
		}
		return s6.trim().split("////s+").length;
	}
	

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Test obj=new Test();
		String t1=sc.nextLine();
		System.out.println(obj.toLower(t1));
		
		String t2=sc.nextLine();
		String t3=sc.nextLine();
		System.out.println(obj.isEqual(t2,t3));
		
		String t4=sc.nextLine();
		System.out.println(obj.reverse(t4));
		
		String t5=sc.nextLine();
		System.out.println(obj.Remove(t5));
		
		String t6=sc.nextLine();
		System.out.println(obj.countW(t6));
		
	}
}
