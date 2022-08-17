package string;

public class FirstFourLast {

	public static void main(String[] args)
	{
      String str="SwatiSanjayThorat";
      String firstfour=str.substring(0,4);
      String lastfour=str.substring(str.length()-4, str.length());
      System.out.println(firstfour);
      System.out.println(lastfour);

	}

}
