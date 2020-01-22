package theRealSIS;

import java.util.ArrayList;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Student
	{
		private String firstName;
		private String lastName;
		private ArrayList<Period> period;

		public Student(String fN, String lN, ArrayList<Period> peds)
			{
				firstName = fN;
				lastName = lN;
				period = peds;
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
				DecimalFormat d = new DecimalFormat("#.##");
				double totalGrade = 0.00;
				for (Period p : period)
					{
						if (p.getLetterGrade().substring(0, 1).equals("A"))
							{
								totalGrade += 4.00;
							} else if (p.getLetterGrade().substring(0, 1).equals("B"))
							{
								totalGrade += 3.00;
							} else if (p.getLetterGrade().substring(0, 1).equals("C"))
							{
								totalGrade += 2.00;
							} else if (p.getLetterGrade().substring(0, 1).equals("D"))
							{
								totalGrade += 1.00;
							} else if (p.getLetterGrade().substring(0, 1).equals("F"))
							{
								totalGrade += 0.00;
							}
						if (p.getLetterGrade().length() > 1)
							{
								if (p.getLetterGrade().substring(1, 2).equals("+"))
									{
										totalGrade += .30;
									} else if (p.getLetterGrade().substring(1, 2).equals("-"))
									{
										totalGrade -= .30;
									}
							}
					}
				String decimal = d.format(totalGrade / period.size());
				return Double.parseDouble(decimal);
			}

		public Period getPeriod(String n)
			{
				for (int i = 0; i < period.size(); i++)
					{
						if (period.get(i).getClassName().equals(n))
							{
								return period.get(i);
							}

					}
				return null;

			}
	}
