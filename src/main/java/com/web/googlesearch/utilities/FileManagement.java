package com.web.googlesearch.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.WebDriver;
import com.web.googlesearch.pages.PageObject;
public class FileManagement extends PageObject {

	static PrintWriter writer;
	static FileOutputStream fos;
	
	//Path for the Error Log
	static File log = new File("./Log/Errors.txt");

	public FileManagement(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	//Function to Write the Exceptions in a File
	public static void logError(Exception e)
	{
		writeToFile("ERROR : " + e.getMessage());
	}


	//Function to Write the contents in a Specific File
	public static void writeToFile(String msg)
	{
		try
		{
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy h:mm:ss a");
			String formattedDate = sdf.format(date);
			fos = new FileOutputStream(log, true);
			writer = new PrintWriter(fos);
			writer.println("\r\n" + formattedDate + " : " + msg + "\r\n");
			writer.close();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
