
public class Program2 {
	public static void main(String[] args) {	
		System.out.println("Enter first value: ");	
		int n1=getInt();
		
		System.out.println("Enter second value: ");	
		int n2=getInt();
		
		int result = n1+n2;
		System.out.println("Result: "+result);	
	}
	
	public static int getInt() {
		try{
			byte arrInput[]=new byte[100];
			int length=System.in.read(arrInput);
			byte [] arrFinal=new byte[length-2];	//Heap
			System.arraycopy(arrInput, 0, arrFinal, 0, length-2);
			String objString = new String(arrFinal);
			int n1=Integer.parseInt(objString);
			return n1;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return -1;
	}

}
