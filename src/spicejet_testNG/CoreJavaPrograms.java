package spicejet_testNG;

import org.testng.annotations.Test;

public class CoreJavaPrograms {
  @Test(enabled=false)
  public void reverseString() {
	  String str="Nagesh";
	  System.out.println(str.length());
	  
	  for(int i=0; i<str.length(); i++)
	  {
		  System.out.print(str.charAt(i));
	  }
	  System.out.println();
	  for(int i=str.length()-1; i>=0; i--)
	  {
		  System.out.print(str.charAt(i));
	  }
	  System.out.println();
  }
  @Test(enabled=false)
  public void stringComparisons() {
	  String str="Nagesh";
	  if(str.equalsIgnoreCase("nagesh"))
	  {
		  System.out.println("Matching");
	  }else{
		  System.out.println("Not matching");
	  }
	  
	  if(str.contains("Nag"))
	  {
		  System.out.println("Available");
	  }else{
		  System.out.println("Not available");
	  }
  }
  @Test
  public void palindromeString() {
	  String str="Madam";
	   String str1 = "";
	  for(int i=str.length()-1; i>=0; i--)
	  {
		  System.out.println(str.charAt(i));
		  str1=str1+str.charAt(i);
	  }
	  System.out.println("Reversed String is :"+str1);
	  if(str.equalsIgnoreCase(str1))
	  {
		  System.out.println("Its palindrome");
	  }else{
		  System.out.println("Its not a palindrome");
	  }
  }
}










