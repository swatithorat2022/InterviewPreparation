package number;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		
		
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter the 3 digit number");
			/*
			 * String n=sc.next()+sc.nextLine(); String rev=""; char [] ch=n.toCharArray();
			 * int l=ch.length; for(int i=l-1;i>=0;i--) { rev+=ch[i]; }
			 * System.out.println(rev); if(n.equalsIgnoreCase(rev)) {
			 * System.out.println("numbr is pallindrome"); } else {
			 * System.out.println(" not pallindrome"); }
			 */
	        
	        int num=sc.nextInt();
	        int rev=0;
	        int n=num;
	        while(num>0)
	        {
	        	int d=num%10;
	        	rev=10*rev+d;
	        	num=num/10;
	        }
	        System.out.println(rev);
	        if(n==rev)
	        {
	        	System.out.println("numbr is pallindrom");
	        }
	        else
	        {
	        	System.out.println("number is not pallindrome");
	        }
	        
	}

}
