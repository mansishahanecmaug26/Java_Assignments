
public class Employees {
	    double salary;
	    int hours;

	    void getInfo(double s, int h) {
	        salary = s;
	        hours = h;
	    }

	    void addSal() {
	        if (salary < 500) {
	            salary = salary + 10;
	        }
	    }

	    void addWork() {
	        if (hours > 6) {
	            salary = salary + 5;
	        }
	    }

	    public static void main(String[] args) {
	        Employees e = new Employees();

	        e.getInfo(450, 8);

	        e.addSal();
	        e.addWork();

	        System.out.println("Final Salary = " + e.salary);
	    }
	}
