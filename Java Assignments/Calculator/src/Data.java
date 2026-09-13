public class Data{
//	public static void main(String[] args){
	static int iStatic;
	
	int n1;
	float n2;
	Boolean status;
	char key;
	static String str;

	static{
		iStatic=1;
		System.out.println("Static block fired");
	}
	{
		System.out.println("Init Block");
	}
	public Data(){
		System.out.println("Data ctor");
	}
}

