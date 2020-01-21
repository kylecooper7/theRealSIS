package theRealSIS;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;






public class SIS
	{
		static ArrayList<Student> listOfStuds = fillStudentList("StudentInfo.txt");
		public static void main(String[] args)
			{
				// TODO Auto-generated method stub

				

				
				byGPA();
				
				
				
				

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
		
		public static void byLastName()
		{
			Collections.sort(listOfStuds, new LastNameSort("LastName"));
			displayStudents(listOfStuds);
		}
		public static void byFirstName()
		{
			Collections.sort(listOfStuds, new LastNameSort("FirstName"));
			displayStudents(listOfStuds);
		}
		public static void byGPA()
		{
			Collections.sort(listOfStuds, new LastNameSort("GPA"));
			displayStudents(listOfStuds);
		}
		public static void byPeriod(String className)
		{
			Collections.sort(listOfStuds, new LastNameSort(className));
			displayStudents(listOfStuds);
		}
		
		public static void displayStudents(ArrayList<Student>something)
		{
			for(Student s : something)
				{
					System.out.print(s.getFirstName());
					System.out.print(" " + s.getLastName());
					for (Period p : s.getPeriod())
						{
							System.out.print(" " + p.getClassName());
							System.out.print(" " + p.getLetterGrade());
							System.out.print(" P" + p.getPeriodNumber());
						}
					System.out.print(" " + s.getGPA());
					System.out.println();
				}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		// Tanner - end 199
		// Emily - Start 200 
      
		public static void addStudents() 
			{
			
			
			
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
					System.out.println("What class name would you like to sort by?");
					Scanner classInput = new Scanner(System.in);
					String className = classInput.nextLine();
					
					byPeriod(className);
				}
		}
	  }

			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
	
	
	
	
	
	
	
	// Jon - end 400
	}
