
package theRealSIS;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;





public class SIS
	{
		static ArrayList<Student> listOfStuds = fillStudentList("StudentInfo.txt");
		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
//byGPA();
				

				
				
				
			mainAndSubMenu();
				
				
				
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
		
		
		
	public static void formatColumns(String s, int colCount){
		int numSpaces = colCount - s.length();
	for(int i = 0; i < numSpaces; i++) {
		System.out.print(" ");
	}
	}	
		public static void menWho() {
			Scanner userInput = new Scanner(System.in);
			String s = userInput.nextLine();
			if(s.contentEquals("")) {
				mainAndSubMenu();
			}
		}
		
		public static void byPeriod() {
			System.out.println("Please input a period number to sort by:");
			Scanner deets = new Scanner(System.in);
			String s = deets.nextLine();
			Collections.sort(listOfStuds, new LastNameSort("Period " + s));
			displayStudents(listOfStuds);
			menWho();
		}
  // Kyle - end 124
		// Tanner - Start 125
		public static void byLastName()
		{
			Collections.sort(listOfStuds, new LastNameSort("LastName"));
			displayStudents(listOfStuds);
			menWho();
		}
		public static void byFirstName()
		{
			Collections.sort(listOfStuds, new LastNameSort("FirstName"));
			displayStudents(listOfStuds);
			menWho();
		}
		public static void byGPA()
		{
			Collections.sort(listOfStuds, new LastNameSort("GPA"));
			displayStudents(listOfStuds);
			menWho();
		}
		public static void byClassName(String className)
		{
			Collections.sort(listOfStuds, new LastNameSort(className));
			displayStudents(listOfStuds);
			menWho();
		}
		public static void displayStudents(ArrayList<Student>something)
		{
			int colCount = 10;
			DecimalFormat decFor = new DecimalFormat("0.00");
			int counter = 0;
			for(Student s : something)
				{
				counter++;
				String cheese = "" + counter + ".";
				System.out.print(cheese);
				formatColumns(cheese ,5);
					//System.out.println();
					String studentGPA = decFor.format(s.getGPA());
					System.out.print(s.getFirstName());
					formatColumns(s.getFirstName(), colCount);
					System.out.print(" " + s.getLastName());
					formatColumns(s.getLastName(), colCount);
					for (Period p : s.getPeriod())
						{
							System.out.print(" " + p.getClassName());
							formatColumns(p.getClassName(), colCount - 1);
							System.out.print(" " + p.getLetterGrade());
							formatColumns(p.getLetterGrade(), colCount - 1);
							System.out.print(" P" + p.getPeriodNumber());
							formatColumns("   ", colCount - 1);
						}
					System.out.print(" " + studentGPA);
					formatColumns("    ", colCount - 1);
					System.out.println();
				}	
		}	
		public static void changeGrades() {
			Scanner userInput = new Scanner(System.in);
			Scanner userInput2 = new Scanner(System.in);
			System.out.println("Please input the student's number:");
			displayStudents(listOfStuds);
			int num = userInput2.nextInt();
			System.out.println("Period:");
			int periodNum = userInput2.nextInt();
			System.out.println("Change Grade To:");
			String grade = userInput.nextLine();
			listOfStuds.get(num - 1).getPeriod().get(periodNum - 1).setLetterGrade(grade);
			displayStudents(listOfStuds);
			System.out.println(listOfStuds.get(num - 1).getFirstName() + " " + listOfStuds.get(num - 1).getLastName() + "'s grade has been changed.");
			menWho();
			}
public static void switchClasses() {
	Scanner userInput = new Scanner(System.in);
	Scanner userInput2 = new Scanner(System.in);
	System.out.println("Student Name:");
	String name = userInput.nextLine();
	System.out.println("Period:");
	int periodNum = userInput2.nextInt();
	System.out.println("Switch With");
	String grade = userInput.nextLine();
	for(Student s: listOfStuds) {
		if((s.getFirstName() + " " +s.getLastName()).equals(name)) {
			s.getPeriod().get(periodNum).setLetterGrade(grade);}}
	displayStudents(listOfStuds);		
	menWho();
}
	







// Tanner - end 219
		// Emily - Start 220 
      
		public static void addStudents() 
			{
				Scanner userInput = new Scanner(System.in);
				ArrayList<Period> perds = new ArrayList<Period>();
				System.out.println("Please enter the new student's first and last name.");
				String addStudentName = userInput.nextLine();
				String[] studName = addStudentName.split(" ");
				System.out.println("What is " + addStudentName + "'s first period?"
									+ "\n (a) Biology"
									+ "\n (b) Algebra"
									+ "\n (c) English");
				String firstPeriod = userInput.nextLine();
				if(firstPeriod.equals("a")) // first period is Biology
					{
					String fP = "Biology";
					System.out.println("What is " + addStudentName + "'s grade in " + fP + "?");
					String fPGrade = userInput.nextLine();
						perds.add(new Period(1, fPGrade, fP));
						System.out.println("Now, what is " + addStudentName + "'s second period?"
								+ "\n (a) Algebra"
								+ "\n (b) English");
					}
				else if(firstPeriod.equals("b")) // first period is Algebra
					{
					String fP = "Algebra";
					System.out.println("What is " + addStudentName + "'s grade in " + fP + "?");
					String fPGrade = userInput.nextLine();
					perds.add(new Period(1, fPGrade, fP));
						System.out.println("Now, what is " + addStudentName + "'s second period?"
								+ "\n (a) Biology"
								+ "\n (b) English");
					}
				else if(firstPeriod.equals("c")) // first period is English 
					{
					String fP = "English";
					System.out.println("What is " + addStudentName + "'s grade in " + fP + "?");
					String fPGrade = userInput.nextLine();
					perds.add(new Period(1, fPGrade, fP));
						System.out.println("Now, what is " + addStudentName + "'s second period?"
								+ "\n (a) Biology"
								+ "\n (b) Algebra");	
					}
			String secondPeriod = userInput.nextLine();
			if(firstPeriod.equals("a") && secondPeriod.equals("a")) // second period is Algebra
				{
				String sP = "Algebra";
				System.out.println("What is " + addStudentName + "'s grade in " + sP + "?");
				String sPGrade = userInput.nextLine();
				perds.add(new Period(2, sPGrade, sP));
					String thirdPeriod = new String("English"); // third period is English 
					System.out.println("What is " + addStudentName + "'s grade in " + thirdPeriod + "?");
					String tPGrade = userInput.nextLine();
					perds.add(new Period(3, tPGrade, thirdPeriod));
				}
			else if(firstPeriod.equals("a") && secondPeriod.equals("b")) // second period is English
				{
				String sP = "English";
				System.out.println("What is " + addStudentName + "'s grade in " + sP + "?");
				String sPGrade = userInput.nextLine();
				perds.add(new Period(2, sPGrade, sP));
					String thirdPeriod = new String("Algebra"); // third period is Algebra 
					System.out.println("What is " + addStudentName + "'s grade in " + thirdPeriod + "?");
					String tPGrade = userInput.nextLine();
					perds.add(new Period(3, tPGrade, thirdPeriod));
				}
			else if(firstPeriod.equals("b") && secondPeriod.equals("a")) // second period is Biology
			{
				String sP = "Biology";
				System.out.println("What is " + addStudentName + "'s grade in " + sP + "?");
				String sPGrade = userInput.nextLine();
				perds.add(new Period(2, sPGrade, sP));
					String thirdPeriod = new String("English"); // third period is English
					System.out.println("What is " + addStudentName + "'s grade in " + thirdPeriod + "?");
					String tPGrade = userInput.nextLine();
					perds.add(new Period(3, tPGrade, thirdPeriod));
				}
			else if(firstPeriod.equals("b") && secondPeriod.equals("b")) // second period is English
				{
				String sP = "English";
				System.out.println("What is " + addStudentName + "'s grade in " + sP + "?");
				String sPGrade = userInput.nextLine();
				perds.add(new Period(2, sPGrade, sP));
					String thirdPeriod = new String("Biology"); // third period is Biology
					System.out.println("What is " + addStudentName + "'s grade in " + thirdPeriod + "?");
					String tPGrade = userInput.nextLine();
					perds.add(new Period(3, tPGrade, thirdPeriod));
				}
			else if(firstPeriod.equals("c") && secondPeriod.equals("a")) // second period is Biology
				{
				String sP = "Biology";
				System.out.println("What is " + addStudentName + "'s grade in " + sP + "?");
				String sPGrade = userInput.nextLine();
				perds.add(new Period(2, sPGrade, sP));
					String thirdPeriod = new String("Algebra"); // third period is Algebra
					System.out.println("What is " + addStudentName + "'s grade in " + thirdPeriod + "?");
					String tPGrade = userInput.nextLine();
					perds.add(new Period(3, tPGrade, thirdPeriod));
				}
			else if(firstPeriod.equals("c") && secondPeriod.equals("b")) // second period is Algebra 
				{
				String sP = "Algebra";
				System.out.println("What is " + addStudentName + "'s grade in " + sP + "?");
				String sPGrade = userInput.nextLine();
				perds.add(new Period(2, sPGrade, sP));
					String thirdPeriod = new String("Biology"); // third period is Biology
					System.out.println("What is " + addStudentName + "'s grade in " + thirdPeriod + "?");
					String tPGrade = userInput.nextLine();
					perds.add(new Period(3, tPGrade, thirdPeriod));
				}	
	listOfStuds.add(new Student(studName[0], studName[1], perds));
	displayStudents(listOfStuds);
	System.out.println(addStudentName + " has been added to the student roster.");
	menWho();
		    }	
		public static void deleteStudent()
			{
				System.out.println("Please type in the student's number you would like to remove from your class.");
				Scanner deleteStudent = new Scanner(System.in);
				displayStudents(listOfStuds);
				int studentRemoved = deleteStudent.nextInt();
				listOfStuds.remove(studentRemoved - 1);
				//New class list with the student removed 
				
				displayStudents(listOfStuds);
				System.out.println("Student Roster Updated.");
				menWho();
				
			}
		
		
		
		
		
		
		
		
		
		
		// Emily - end 359
		// Jon - Start 360
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
				
				
				if(addStudent == 1)
					{
						addStudents(); 
					}
				else if (addStudent == 2)
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
		
				
			if(changeGrades.equals("a"))
				{
					changeGrades();
				}
			else if(changeGrades.equals("b"))
				{
					switchClasses();
				}
		}
		
		else if(choice == 3)
		{
			System.out.println("How would you like to sort your students?"
					           + "\n (1) by last name"
					           + "\n (2) by GPA"
					           + "\n (3) by class name"
					           + "\n (4) by period");
			Scanner sortInput = new Scanner(System.in);
				int byLastName = sortInput.nextInt();
				
				
			if(byLastName == 1)
				{
					byLastName();
				}
			
			else if(byLastName == 2)
				{
					byGPA();
				}
			else if(byLastName == 3)
				{
					System.out.println("What class name would you like to sort by?");
					Scanner classInput = new Scanner(System.in);
					String className = classInput.nextLine();
					
					byClassName(className);
				}
			else if(byLastName == 4)
			{
				byPeriod();
				
				
			}
			
		}
	  }

			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
	
	
	
	
	
	
	
	// Jon - end 400
	}
