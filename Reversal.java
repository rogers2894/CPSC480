import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Reversal {

	public static void reverseFile(File	input,File output) throws FileNotFoundException	{
		
		  try{
		  
		  BufferedReader in = new BufferedReader(new FileReader(input));
		  BufferedWriter out = new BufferedWriter(new FileWriter(output));
		  ArrayList<String> list = new ArrayList<String>();
		  String s = "";
		  while((s = in.readLine()) !=null) {
			  list.add(s);
		  }
		  
		  for(int i = 0; i < list.size(); i++){
			  System.out.println(list.get(i));
		  }
		  String lines[] = new String[list.size()];
		  
		  for (int i = lines.length - 1; i >= 0; i--) {
		  lines[i] = list.get(list.size()-(i+1));
		System.out.println(lines[i]);
		}
		  for(int i = 0; i < lines.length; i++){
			  String delimiter = "[' ']";
			  
			  String[] tokens = lines[i].split(delimiter);
			  String[] reverse = new String[tokens.length];
			  
			  for(int x = 0; x < tokens.length; x++){
				  reverse[x] = tokens[tokens.length - 1 - x];
			  }
			  String t = "";
			  int z = 0;
			 while(z < reverse.length){
				 t += reverse[z] + " ";
				 z++;
			 }
			 
			 lines[i] = t;
		  }
		  
		      for (int i = 0; i < lines.length; i++) {
		System.out.println(lines[i]);
		  out.write(lines[i]);
		  if(i < lines.length - 1){
		  out.write ("\n");
		  }
		}

		out.close();
		in.close();
		  }
		  catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	}
		
	public static void main(String[] args){
			
			File input = new File("C:\\eclipse\\eclipse\\workspace\\480 Assignment 2\\src\\input.txt");
			File output = new File("C:\\eclipse\\eclipse\\workspace\\480 Assignment 2\\src\\output.txt");
			
			try {
				reverseFile(input, output);
			} 
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
}
