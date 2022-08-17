package array;

public class Sort_Array1 {

	public static void main(String[] args) 
	{
		int _=10;
		System.out.println(_);
		
		int array1[]= {11,23,67,34,99,45};
		int tmp=0;
		for(int i=0;i<array1.length;i++)
		{
		for(int j=i+1;j<array1.length;j++)
		{
			if(array1[i]>array1[j])
			{
				tmp=array1[i];
				array1[i]=array1[j];
				array1[j]=tmp;
				
				
			}
		}
		}
		for(int i=0;i<array1.length;i++)
		{
			System.out.println(array1[i]);
		}
	}
	
	

}
