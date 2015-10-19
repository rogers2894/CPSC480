import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Reversal {

	//private static String getLine;
	
	public static void reverseFile(File	input,File output) throws FileNotFoundException	{
		String getLine = "";
		try {
			//here you can traverse through the file
			Scanner line = new Scanner(input);
			//if the line is not empty then it will get put into this new line
			while(line.hasNext()){
				getLine += line.nextLine() + "\n";
				//System.out.println(getLine);
			}
			
			line.close();
			
			String delimiter = "[' ']";
			
			System.out.println(getLine);
			
			String[] tokens = getLine.split(delimiter);
			
			
			FileWriter writer = new FileWriter(output, false);
			
			for(int i = tokens.length - 1; i >= 0; i--){
				writer.append(tokens[i] + " ");
			}
			
			writer.close();
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
