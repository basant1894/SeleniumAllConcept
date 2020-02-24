package ioStreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import org.testng.annotations.Test;

public class CreateTxtFile {
  @Test
  public void f() throws Exception {
	  File f=new File("C:\\Results\\Sample.txt");
	  FileWriter fw=new FileWriter(f, true);
	  BufferedWriter bw=new BufferedWriter(fw);
	  bw.write("Basant");
	  bw.newLine();
	  bw.write("Kumar");
	  bw.newLine();
	  bw.write("Chaudhary");
	  bw.newLine();
	  bw.close();  
  }
  @Test(enabled=false)
  public void readTXTFile() throws Exception {
	  File f=new File("C:\\Results\\Sample.txt");
	  FileReader fr=new FileReader(f);
	  @SuppressWarnings("resource")
	BufferedReader br=new BufferedReader(fr);
	  String str= br.readLine();
	  System.out.println(str);
	  while((str=br.readLine()) !=null)
	  {
		  if(str.contains("Basant"))
		  {
			  System.out.println(str);
		  }
	  }
		  	  
  }
  
}
