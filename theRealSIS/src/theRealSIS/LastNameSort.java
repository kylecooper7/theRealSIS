package theRealSIS;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
public class LastNameSort implements Comparator<Student>
	{
		public int compare(Student s1, Student s2)
		{
			return s1.getLastName().compareTo(s2.getLastName());
		}
	}
