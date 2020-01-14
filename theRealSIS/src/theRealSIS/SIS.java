package theRealSIS;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Period;
import java.util.ArrayList;

public class SIS
	{

		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
ArrayList<Student> listOfStuds = fillStudentList("StudentInfo.txt");
				
				
				
				
				
				
				
				
				

				
				
				
				
				
				
				
				
				
				
				
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Kyle - Start 50 
		
public static ArrayList<Student> fillStudentList(String fileName){
	ArrayList<Student> studs = new ArrayList<Student>();
	String line = null;
	try 
    	{
        // FileReader reads text files in the default encoding.
        FileReader fileReader = new FileReader(fileName);

        // Always wrap FileReader in BufferedReader.
        BufferedReader bufferedReader = 
            new BufferedReader(fileReader);

        while(((line = bufferedReader.readLine()) != null)) 
        	{
            String[] info = line.split(" ");
            ArrayList<Period> peds = new ArrayList<Period>();
            int counter = 0;
            for(int i = 2; i< info.length; i+= 2) {
            	counter ++;
            	peds.add(new Period(counter, info[i +1], info[i]));
            	
            }
            studs.add(new Student(info[0], info[1], peds));
        // Always close files.
        	}
        bufferedReader.close();			
    	}
    catch(FileNotFoundException ex) 
    	{
        System.out.println(
            "Unable to open file '" + fileName + "'");				
    	}
    catch(IOException ex) 
    	{
        System.out.println(
            "Error reading file '" + fileName + "'");					
        // Or we could just do this: ex.printStackTrace();
    	}
	return studs;
	
	
	
	
	
	
	
}		
		
		
		
		
		
		
		
		
		
		
		
		





		
		// Kyle - end 124
		// Tanner - Start 125
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				// Tanner - end 199
		// Emily - Start 200 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				// Emily - end 274
		// Jon - Start 275
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				// Jon - end 349
	}
