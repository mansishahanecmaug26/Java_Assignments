
public class Program {
	public static void main(String[] args) {
//		Base obj = new Derived();
//		obj.display();
//		obj.show();
		
		Base obj = new Base();
		
		Derived data=new Derived();
		obj=data;
		System.out.println(obj);
		
//		Derived xObj=(Derived)obj;
//		xObj.num3=8;
//		System.out.println(xObj);		
	}
}
