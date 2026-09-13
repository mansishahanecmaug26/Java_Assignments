import java.util.Scanner;

public class Program {
	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);

	        Date objDate = new Date();

	        int choice;

	        do
	        {
	            System.out.println("------------------------------");
	            System.out.println("Date Menu");
	            System.out.println("1. Set Date");
	            System.out.println("2. Add Days");
	            System.out.println("3. Add Months");
	            System.out.println("4. Add Years");
	            System.out.println("5. Display");
	            System.out.println("6. Compare Dates");
	            System.out.println("7. Exit");
	            System.out.println("------------------------------");

	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch(choice)
	            {
	                case 1:
	                    System.out.println("Enter the day:");
	                    int day = sc.nextInt();

	                    System.out.println("Enter the month:");
	                    int month = sc.nextInt();

	                    System.out.println("Enter the year:");
	                    int year = sc.nextInt();

	                    objDate.setDate(day, month, year);
	                    break;

	                case 2:
	                    System.out.println("Enter number of days:");
	                    int days = sc.nextInt();

	                    objDate.addDays(days);
	                    break;

	                case 3:
	                    System.out.println("Enter number of months:");
	                    int months = sc.nextInt();

	                    objDate.addMonths(months);
	                    break;

	                case 4:
	                    System.out.println("Enter number of years:");
	                    int years = sc.nextInt();

	                    objDate.addYears(years);
	                    break;

	                case 5:
	                    System.out.println(objDate.getDay() + "/" +objDate.getMonth() + "/" +objDate.getYear());
	                    break;

	                case 6:
	                    System.out.println("Compare Dates operation");
	                    break;

	                case 7:
	                    System.out.println("Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid choice");
	            }

	        } while(choice != 7);

	        sc.close();
	    }
	}


	class Date
	{
	    private int day;
	    private int month;
	    private int year;


	    // Setter / Mutator
	    public void setDate(int dd, int mm, int yy)
	    {
	        year = yy;

	        if(mm < 1 || mm > 12)
	        {
	            month = 1;
	        }
	        else
	        {
	            month = mm;
	        }


	        // January, March, May, July, August, October, December
	        if(month == 1 || month == 3 ||
	           month == 5 || month == 7 ||
	           month == 8 || month == 10 ||
	           month == 12)
	        {
	            if(dd < 1 || dd > 31)
	            {
	                day = 1;
	            }
	            else
	            {
	                day = dd;
	            }
	        }

	        // April, June, September, November
	        else if(month == 4 || month == 6 ||
	                month == 9 || month == 11)
	        {
	            if(dd < 1 || dd > 30)
	            {
	                day = 1;
	            }
	            else
	            {
	                day = dd;
	            }
	        }

	        // February
	        else
	        {
	            if(isLeapYear(year))
	            {
	                if(dd < 1 || dd > 29)
	                {
	                    day = 1;
	                }
	                else
	                {
	                    day = dd;
	                }
	            }
	            else
	            {
	                if(dd < 1 || dd > 28)
	                {
	                    day = 1;
	                }
	                else
	                {
	                    day = dd;
	                }
	            }
	        }
	    }


	    // Check Leap Year
	    private boolean isLeapYear(int y)
	    {
	        if((y % 400 == 0) ||
	           (y % 4 == 0 && y % 100 != 0))
	        {
	            return true;
	        }

	        return false;
	    }


	    // Add Days
	    public void addDays(int days)
	    {
	        for(int i = 0; i < days; i++)
	        {
	            day++;

	            int maxDays;

	            if(month == 2)
	            {
	                if(isLeapYear(year))
	                {
	                    maxDays = 29;
	                }
	                else
	                {
	                    maxDays = 28;
	                }
	            }
	            else if(month == 4 || month == 6 ||
	                    month == 9 || month == 11)
	            {
	                maxDays = 30;
	            }
	            else
	            {
	                maxDays = 31;
	            }

	            if(day > maxDays)
	            {
	                day = 1;
	                month++;

	                if(month > 12)
	                {
	                    month = 1;
	                    year++;
	                }
	            }
	        }
	    }


	    // Add Months
	    public void addMonths(int months)
	    {
	        month = month + months;

	        while(month > 12)
	        {
	            month = month - 12;
	            year++;
	        }

	        while(month < 1)
	        {
	            month = month + 12;
	            year--;
	        }

	        // Adjust day if required
	        int maxDays;

	        if(month == 2)
	        {
	            if(isLeapYear(year))
	            {
	                maxDays = 29;
	            }
	            else
	            {
	                maxDays = 28;
	            }
	        }
	        else if(month == 4 || month == 6 ||
	                month == 9 || month == 11)
	        {
	            maxDays = 30;
	        }
	        else
	        {
	            maxDays = 31;
	        }

	        if(day > maxDays)
	        {
	            day = maxDays;
	        }
	    }


	    // Add Years
	    public void addYears(int years)
	    {
	        year = year + years;

	        // If date is 29 February and
	        // new year is not leap year
	        if(month == 2 && day == 29 &&
	           !isLeapYear(year))
	        {
	            day = 28;
	        }
	    }


	    // Getter / Accessor
	    public int getDay()
	    {
	        return day;
	    }


	    public int getMonth()
	    {
	        return month;
	    }


	    public int getYear()
	    {
	        return year;
	    }
	}
