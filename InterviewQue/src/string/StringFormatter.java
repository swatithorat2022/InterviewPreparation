package string;



public class StringFormatter {  
public static String capitalizeWord(String str){  
    String words[]=str.split("\\s");  
    String capitalizeWord="";  
    for(String w:words){  
        String first=w.substring(0,1);  
        String afterfirst=w.substring(1);  
        capitalizeWord+=first.toUpperCase()+afterfirst+" ";
        System.out.println(capitalizeWord);
    }  
    return capitalizeWord.trim();  
}  



public static void main(String[] args) 
{
	System.out.println(capitalizeWord("my name is khan"));
	System.out.println(capitalizeWord("i am swati thorat"));
	
	
}
}  