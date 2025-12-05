import java.util.*;
class Main {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int count=user.countoccurence(s1,s2);
        System.out.println(count);
    }
}
class user{
	public static int countoccurence(String s1,String s2){
        // int cnt=0;
        // for(int i=0;i<=s1.length()-s2.length();i++){
        	// String sub=s1.substring(i,i+s2.length());
        	// // System.out.println(sub+",");
        	// if(sub.equals(s2)) cnt++;
        // }
        // return cnt;
        //without using substring
        int i=0;
        int j=0;
        int cnt=0;
        while(i<s1.length()){
        	if(s1.charAt(i)==s2.charAt(j)){
        		i++;
        		j++;
        		if(j==s2.length()-1){
        			cnt++; 
        			j=0;     			
        		}
        	}else{
        	i=i-j+1;
        	j=0;}
        }
        return cnt;
		
	}
}