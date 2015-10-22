import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;


public class ReversalTest {

	@Rule
	public TemporaryFolder folder = new TemporaryFolder();
	
	@Test
	public void test() {
		try{
		File input= folder.newFile("myfile1.txt");
		File output= folder.newFile("myfile2.txt");
		BufferedWriter in = new BufferedWriter(new FileWriter(input));
		
		in.write("Lorem ipsum dolor sit amet,");
		in.write("\n");
		in.write("consectetur adipiscing elit.");
		
		
			Reversal.reverseFile(input, output);
			
			BufferedReader out = new BufferedReader(new FileReader(output));
			
			
			String expected = "elit. adipiscing consectetur " + "\n" + "amet, sit dolor ipsum Lorem ";
			String actual = "";
			
			ArrayList<String> list = new ArrayList<String>();
			String s = "";
			 
			  while((s = out.readLine()) !=null){
				  list.add(s);
				  System.out.println("asdfasf");
			  }
			  for(int i = 0; i < list.size(); i++){
				  System.out.println(list.get(i) + "asdfasdf");
			  }
			  
			  int x = 0;
			  while(x < list.size()){
				  actual += list.get(x);
				  x++;
			  }
			  
			  assertEquals("They are not the same", expected, actual);
			  
			  in.close();
			  out.close();
		} 
		
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

}
