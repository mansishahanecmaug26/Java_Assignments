
public class Program3 {

	public static void main(String[] args) {
	
		System.out.println("Enter value: ");
		float n1=getFloat();
		
		System.out.println("Enter value: ");
		float n2=getFloat();
		
		double result =n1+n2;
		System.out.println(result);
		}
		
	public static float getFloat() {
		String objString = getString();
		float data=Float.parseFloat(objString);
		return data;
	}
	
	public static int getInt() {
		
		return Integer.parseInt(getString());
	}
	
	
	public static String getString() {
		try{
			byte arrInput[]=new byte[100];
			int length=System.in.read(arrInput);
			byte [] arrFinal=new byte[length-2];	//Heap
			System.arraycopy(arrInput, 0, arrFinal, 0, length-2);
			String objString = new String(arrFinal);

			return objString;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
}
