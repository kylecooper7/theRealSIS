package theRealSIS;
import java.util.Scanner;
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
      
		public static void addStudents() 
			{
				
				Scanner userInput = new Scanner(System.in);
				String addStudentName = userInput.nextLine();
				System.out.println("Please enter the new student's first and last name.");
					
				String firstPeriod = userInput.nextLine();
				System.out.println("What is " + addStudentName + "'s first period?"
									+ "\n (a) Biology"
									+ "\n (b) Algebra"
									+ "\n (c) English");
					
					
					
				System.out.println("Now, what is " + addStudentName + "'s second period?");
				
				
					
					
			
			
		    }
		
		public static void deleteStudent()
			{
			
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Emily - end 274
		// Jon - Start 275
	public static void mainAndSubMenu()
	  {
		Scanner intInput = new Scanner(System.in);
		
		
		System.out.println("What would you like to do?" 
							+ "\n (1) add or delete a student" 
							+ "\n (2) change student grades/schedule"
							+ "\n (3) sort students");
		
		int choice = intInput.nextInt();
		
		if(choice == 1)
		{
			System.out.println("Would you like to (1) add a student or (2) delete a student?");
				Scanner userInput = new Scanner(System.in);
					int addStudent = userInput.nextInt();
					int deleteStudent = userInput.nextInt();
				
				if(addStudent == 1)
					{
						addStudents(); 
					}
				else if (deleteStudent == 2)
					{
						deleteStudent();
					}
		}
		
		else if(choice == 2)
		{
			System.out.println("Would you like to"
					           + "\n (a) change a student's grades?"
					           + "\n OR"
					           + "\n (b) switch a student's classes?");
			Scanner changeInput = new Scanner(System.in);
				String changeGrades = changeInput.nextLine();
				String switchClasses = changeInput.nextLine();
				
			if(changeGrades.equals("a"))
				{
					changeGrades();
				}
			else if(switchClasses.equals("b"))
				{
					switchClasses();
				}
		}
		
		else if(choice == 3)
		{
			System.out.println("How would you like to sort your students?"
					           + "\n (1) by last name"
					           + "\n (2) by GPA"
					           + "\n OR"
					           + "\n (3) by period");
			Scanner sortInput = new Scanner(System.in);
				int byLastName = sortInput.nextInt();
				int byGPA = sortInput.nextInt();
				int byPeriod = sortInput.nextInt();
				
			if(byLastName == 1)
				{
					byLastName();
				}
			
			else if(byGPA == 2)
				{
					byGPA();
				}
			else if(byPeriod == 3)
				{
					byPeriod();
				}
		}
	  }

			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
	
	
	
	
	
	
	
	
	
	
	
	// Jon - end 400
	}
