package array;

import java.lang.reflect.Array;

public class DeleteDuplicate {

	public static void main(String[] args)
	{
		int[] a=new int[6];
		//int []b= {11,12,23};
		 a[0]=11;
		 a[1]=12;
		 a[2]=11;
		 a[3]=13;
		 a[4]=14;
		 a[5]=11;
		int newa[]=new int[6];
		 int l=a.length;
		 int newa1[]=new int[a.length+1];
		 int m=0;
		 System.out.println("before removing duplicate elements");
		 System.out.println(" ");
		 for(int i=0;i<l;i++)
		 {
			 System.out.print(a[i]+" ,");
		 }
		 System.out.println("Duplicate elements are ");
		 System.out.println(" ");
		 int k=0;
		 for(int i=0;i<l;i++)
		 {
			 
          for(int j=i+1;j<l;j++)
          {
        	  if(a[i]==a[j])
        	  {
        		  System.out.print(a[i]+" ,");
        		  newa[k]=a[i];
        		  k++;
        	  }
        	  else
        	  {
        		  newa1[m++]=a[i];
 				 
        	  }
          }
		 }
		 
		// System.out.println(newa);
		 int l2=newa.length;
		
		
		 newa1[m++]=a[l-1];
		 System.out.println("After removing duplicate elements");
		 System.out.println(" ");
		 int l1=newa1.length;
		 for(int i=0;i<l1;i++)
		 {
			 System.out.print(newa1[i]+" ,");
		 }
	}
}



