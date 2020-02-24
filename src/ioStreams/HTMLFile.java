package ioStreams;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class HTMLFile {
  @Test
  public void f() throws Exception {
	  File f=new File(".\\Results\\LoginResults.html");
	  FileWriter fw=new FileWriter(f);
	  BufferedWriter bw=new BufferedWriter(fw);
	  
	  bw.close();
	  
	  
	  
  }
}





