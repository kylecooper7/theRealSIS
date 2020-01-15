package theRealSIS;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;






public class SIS
	{
		static ArrayList<Student> listOfStuds = fillStudentList("StudentInfo.txt");
		public static void main(String[] args)
			{
				// TODO Auto-generated method stub

				
				

				
				
				
				
				
				
				

			} //keep at 32
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
  
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
		 private void Syso()
			{
				System.out.println("Hi this is where the Submenu will be. ");

			}                                                                                              
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Emily - end 274
		// Jon - Start 275
		Scanner intInput = new Scanner(System.in);
		
		int choice = intInput.nextInt();
		
		System.out.println("What would you like to do?"
				+ "\n 1) add or delete a student"
				+ "\n 2) change student grades/schedule"
				+ "\n 3) sort students");
		
		if(choice == 1)
		{
			
		}
		else if(choice == 2)
		{
			
		}
		
		else if(choice == 3)
		{
			
		}

			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	// Jon - end 349
	}
