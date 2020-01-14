package theRealSIS;

import java.util.ArrayList;

public class Student
	{
		private String firstName;
		private String lastName;
		private ArrayList<Period> period;

		public Student(String fN, String lN, ArrayList<Period> p)
			{
				firstName = fN;
				lastName = lN;
				period = p;
			}

		public String getFirstName()
			{
				return firstName;
			}

		public void setFirstName(String firstName)
			{
				this.firstName = firstName;
			}

		public String getLastName()
			{
				return lastName;
			}

		public void setLastName(String lastName)
			{
				this.lastName = lastName;
			}

		public ArrayList<Period> getPeriod()
			{
				return period;
			}

		public void setPeriod(ArrayList<Period> period)
			{
				this.period = period;
			}

		public double getGPA()
			{
				double totalGrade = 0;
				for (Period p : period)
					{
						if (p.getLetterGrade().substring(0, 1).equals("A"))
							{
								totalGrade += 4.0;
							} else if (p.getLetterGrade().substring(0, 1).equals("B"))
							{
								totalGrade += 3.0;
							} else if (p.getLetterGrade().substring(0, 1).equals("C"))
							{
								totalGrade += 2.0;
							} else if (p.getLetterGrade().substring(0, 1).equals("D"))
							{
								totalGrade += 1.0;
							} else if (p.getLetterGrade().substring(0, 1).equals("F"))
							{
								totalGrade += 0.0;
							}
						if (p.getLetterGrade().substring(1, 2).equals("+"))
							{
								totalGrade += .3;
							} else if (p.getLetterGrade().substring(1, 2).equals("-"))
							{
								totalGrade -= .3;
							}
					}
				return totalGrade / period.size();
			}
	}
