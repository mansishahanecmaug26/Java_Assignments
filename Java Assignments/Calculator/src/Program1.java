
public class Program1 {
		public static void main(String[] args){
		Date objDate = new Date();

		System.out.println("Enter the day : ");
		int day=ConsoleInput.getInt();

		System.out.println("Enter the month : ");
		int month=ConsoleInput.getInt();

		objDate.setDate(day,month,2026);

		System.out.println(objDate.getDay() + "/" + objDate.getMonthy() + "/" + objDate.getYear());

		}
	}

public class Date{
	private int day;
	private int month;
	private int year;

	public void setDate(int dd, int mm, int yy)
	{
		year = yy;
		if(mm < 1 || mm > 12)
			month =1;
		else
			month=mm;
		if(month == 1 ||month == 3 ||month == 5 ||month == 7 ||month == 8 ||month == 10 ||month == 12){

			if(dd < 1 || dd > 31)
				day = 1;
			else
				day=dd;
			}
			else if(month == 2 ||month == 4 ||month == 6 ||month == 9 ||month == 11)
			{
}
	}
}
