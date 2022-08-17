package angle;

public class Test1 {

	public static void main(String[] args)
	{
		int hh=12;
		int mm=30;
		int  angle=Math.abs(((11*mm)-(60*hh))/2);
		if(angle>180)
		{
			angle=360-angle;
		}
		System.out.println((angle));
		
		int h=(30*hh)+(mm*(1/2));
		int m=(6*mm);
		int angle1=Math.abs(h-m);
		if(angle1>180)
		{
			angle1=360-angle1;
		}
		System.out.println((angle1));

	}

}
