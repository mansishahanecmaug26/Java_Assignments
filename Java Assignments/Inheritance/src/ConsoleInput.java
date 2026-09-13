public class ConsoleInput {

    public static void main(String[] args) {

        PrimeMembers p = new PrimeMembers();

        System.out.println("Enter name:");
        p.setName(getString());

        System.out.println("Enter age:");
        p.setAge(getInt());

        System.out.println("Enter phone number:");
        p.setPhoneNumber(getString());

        System.out.println("Enter address:");
        p.setAddress(getString());

        System.out.println("Enter salary:");
        p.setSalary(getFloat());

        System.out.println("Enter joining year:");
        p.setJoiningYear(getInt());

        System.out.println("Enter joining fees:");
        p.setJoiningFees(getFloat());

        System.out.println("Enter active status (true/false):");
        p.setIsActive(Boolean.parseBoolean(getString()));

        System.out.println("\nMember Details:");
        p.display();

        p.printSalary();
    }

    public static float getFloat() {
        String objString = getString();
        float data = Float.parseFloat(objString);
        return data;
    }

    public static int getInt() {
        return Integer.parseInt(getString());
    }

    public static String getString() {
        try {
            byte arrInput[] = new byte[100];
            int length = System.in.read(arrInput);

            byte[] arrFinal = new byte[length - 2];

            System.arraycopy(arrInput, 0, arrFinal, 0, length - 2);

            String objString = new String(arrFinal);
            return objString;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static class Member {
        private String name;
        private int age;
        private String phoneNumber;
        private String address;
        private float salary;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getAddress() {
            return address;
        }

        public void setSalary(float salary) {
            this.salary = salary;
        }

        public float getSalary() {
            return salary;
        }

        public void printSalary() {
            System.out.println("Salary = " + salary);
        }
    }

    public static class PrimeMembers extends Member {
        private int joiningYear;
        private float joiningFees;
        private boolean isActive;

        public void setJoiningYear(int joiningYear) {
            this.joiningYear = joiningYear;
        }

        public int getJoiningYear() {
            return joiningYear;
        }

        public void setJoiningFees(float joiningFees) {
            this.joiningFees = joiningFees;
        }

        public float getJoiningFees() {
            return joiningFees;
        }

        public void setIsActive(boolean isActive) {
            this.isActive = isActive;
        }

        public boolean getIsActive() {
            return isActive;
        }

        public void display() {
            System.out.println("Name = " + getName());
            System.out.println("Age = " + getAge());
            System.out.println("Phone Number = " + getPhoneNumber());
            System.out.println("Address = " + getAddress());
            System.out.println("Salary = " + getSalary());
            System.out.println("Joining Year = " + getJoiningYear());
            System.out.println("Joining Fees = " + getJoiningFees());
            System.out.println("Is Active = " + getIsActive());
        }
    }

    public static class Calculator {

        public int add(int n1, int n2) {
            return n1 + n2;
        }

        public float add(float n1, float n2) {
            return n1 + n2;
        }
    }
}