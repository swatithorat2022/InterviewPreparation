package number;

import java.util.Scanner;
class Solution {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 3 digit number");
        int n=sc.nextInt();
        if(n<0||n>999)
        {
        	System.out.println("wrong input");
        	
        }
        else
        {
        	int u=n%10;   //last digit
        	int tt=n/10;
        	int t=tt%10;   // 2nd digit
        	int h=n/100;   //1st digit
        	String[] uw = new String[]{"zero","one","two","three","four","five", "six","seven","eight","nine","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen", "nineteen"};
            String[] tw = new String[]{"","ten","twenty","thirty","forty","fifty","sixty", "seventy","eighty","ninety"};
            String[] hw = new String[]{"Hundread",};
            if(n<20)
            {
            	System.out.println(uw[n]);
            }
            else if(n<100)
            {
            	System.out.println(tw[t]+" "+uw[u]);
            }
            else
            	System.out.println(uw[h]+" "+hw[0]+" "+tw[t]+" "+uw[u]);
        }
      
    }//main
}