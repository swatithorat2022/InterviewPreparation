package angle;

public class Test 
{
	static int findAngle(int hh, int mm)
	{
	    // handle 24-hour notation
	    hh = hh % 12;
	 
	    // find the position of the hour's hand
	    int h = (hh * 360) / 12 + (mm * 360) / (12 * 60);
	 
	    // find the position of the minute's hand
	    int m = (mm * 360) / (60);
	 
	    // calculate the angle difference
	    int angle =Math.abs(h - m);
	 
	    // consider the shorter angle and return it
	    if (angle > 180) 
	    {
	        angle = 360 - angle;
	    }
	 
	    return angle;
	}
	 
	// Clock Angle Problem
 public static void main(String[] args) 
 {
	

	
	    int hh = 21;
	    int mm = 30;
	 
	    System.out.println(findAngle(hh, mm));
	 
	}

}
