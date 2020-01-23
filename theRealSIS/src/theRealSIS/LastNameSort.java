package theRealSIS;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class LastNameSort implements Comparator<Student>
	{
		private String method;

		public LastNameSort(String meth)
			{
				method = meth;
			}

		public int compare(Student s1, Student s2)
			{
				if (method.equals("LastName"))
					{
						return s1.getLastName().compareTo(s2.getLastName());
					} else if (method.equals("GPA"))
					{
						return (int) ((s2.getGPA() - s1.getGPA()) * 100);
					} else if (method.equals("FirstName"))
					{
						return s1.getFirstName().compareTo(s2.getFirstName());
					} else if (method.equals("Period 1"))
					{
						return s1.getPeriod().get(Integer.parseInt(method.substring(7)) - 1).getClassName().compareTo(s2.getPeriod().get(Integer.parseInt(method.substring(7)) - 1).getClassName());
					} else if (method.equals("Period 2"))
					{
						return s1.getPeriod().get(Integer.parseInt(method.substring(7)) - 1).getClassName().compareTo(s2.getPeriod().get(Integer.parseInt(method.substring(7)) - 1).getClassName());
					} else if (method.equals("Period 3"))
					{
						return s1.getPeriod().get(Integer.parseInt(method.substring(7)) - 1).getClassName().compareTo(s2.getPeriod().get(Integer.parseInt(method.substring(7)) - 1).getClassName());
					} else
					{
						return s1.getPeriod(method).getPeriodNumber() - s2.getPeriod(method).getPeriodNumber();
					}
			}
	}
