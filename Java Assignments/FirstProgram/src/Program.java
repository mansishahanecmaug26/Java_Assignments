
public class Program {
		public static void main(String[] args)
		{
			try{
				byte arrInput[]=new byte[100];
				System.out.println("Enter value: ");
				int length=System.in.read(arrInput);
				byte [] arrFinal=new byte[length-2];	//Heap
				System.arraycopy(arrInput, 0, arrFinal, 0, length-2);
				String objString = new String(arrFinal);
				int n1=Integer.parseInt(objString);
				
				byte arrInput1[]=new byte[100];
				System.out.println("Enter value: ");
				int length1=System.in.read(arrInput1);
				byte [] arrFinal1=new byte[length1-2];	//Heap
				System.arraycopy(arrInput1, 0, arrFinal1, 0, length1-2);
				String objString1 = new String(arrFinal1);
				int n2=Integer.parseInt(objString1);
				int result = n1+n2;

				System.out.println(" Result: "+result);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}	
}

