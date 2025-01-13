package Exceptions;
import java.io.File;
import java.io.FileReader;
import java.io.*;

//Class-> File and File Reader
public class FileNotFoundException {

	public static void main(String[] args) {
		try {
			File f=new File("C:\\Users\\harih\\OneDrive\\Documents\\Java\\JavaProgramming\\src\\Exceptions\\ExceptionHandling.java");
			FileReader fr=new FileReader(f);
			System.out.println("File Exists");
		}
		catch(Exception e) { //FileNotFoundException
			System.out.println("File Does Not Exist");
		}
	}
}
