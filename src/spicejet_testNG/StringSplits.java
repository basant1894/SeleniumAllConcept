package spicejet_testNG;

import org.testng.annotations.Test;

public class StringSplits {
  @Test(enabled=false)
  public void arrays() {
	  int[] k;
	  char[] c;
	  Object[] o;
	  String[] str;
	  String[] str2=new String[10];
	  String[] str3={"ramu", "Raj", "Ramesh", "Sri","Rahim"};
	  System.out.println(str3.length);
	  for(int i=0; i<str3.length; i++)
	  {
		  System.out.println(str3[i]);
	  }
	  System.out.println("------------------------------------");
	  for(int i=str3.length-1; i>=0; i--)
	  {
		  System.out.println(str3[i]);
	  }
  }
  @Test
  public void stringSplits() {
	  String str="one,two,three,four";
	  String[] s=str.split(",");
	  System.out.println(s.length);
	  for(int i=0 ;i<s.length; i++)
	  {
		  if(s[i].equals("three"))
		  {
			  String str1=s[i];
			  System.out.println(str1);
		  }
	  }
  }
}






