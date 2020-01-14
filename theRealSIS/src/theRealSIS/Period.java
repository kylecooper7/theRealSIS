package theRealSIS;

public class Period
	{
		private int periodNumber;
		private String letterGrade;
		private String className;
		public Period (int pN, String lG, String cN)
		{
			periodNumber = pN;
			letterGrade = lG;
			className = cN;
		}
		public int getPeriodNumber()
			{
				return periodNumber;
			}
		public void setPeriodNumber(int periodNumber)
			{
				this.periodNumber = periodNumber;
			}
		public String getLetterGrade()
			{
				return letterGrade;
			}
		public void setLetterGrade(String letterGrade)
			{
				this.letterGrade = letterGrade;
			}
		public String getClassName()
			{
				return className;
			}
		public void setClassName(String className)
			{
				this.className = className;
			}
	}
