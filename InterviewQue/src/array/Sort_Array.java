package array;

import java.util.Arrays;

public class Sort_Array 
{

	public static void main(String[] args) 
	{
		int i;
		int array[]= {0,9,8,4,6,2,7,1,5};
		System.out.println("Elements of Array before sorting");
		for( i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		Arrays.sort(array);
		
		System.out.println("Elements of Array before sorting by using in-builtMethod");
		for( i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
		int array1[]= {0,9,8,4,6,2,7,1,5};
		
		
		for(i=0;i<array1.length;i++)
		{
			for(int j=i+1;j<array1.length;j++)
			{
				int tmp=0;
				if(array1[i]>array1[j])
				{
					tmp=array1[i];
					array1[i]=array1[j];
					array1[j]=tmp;
				}
			}
			
			
		}
		
		
		System.out.println("Elements of Array before sorting by using Custom-Method");
		
		for( i=0;i<array1.length;i++)
		{
			System.out.println(array1[i]);
		}
	}
}
