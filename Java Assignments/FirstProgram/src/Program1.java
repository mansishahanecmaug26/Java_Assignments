
public class Program1 {
		public static void main(String[] args)
		{
			try{
				byte arrInput[]=new byte[100];	//Heap
				System.out.println("Enter value: ");
				//System.in.println(arrInput);
				int length=System.in.read(arrInput);
				byte [] arrFinal=new byte[length-2];
				System.arraycopy(arrInput, 0, arrFinal, 0, length-2);
				String objString=new String(arrFinal);
				//int n1=Integer.parseFloat(objString);//55

				float n1=Float.parseFloat(objString);

				System.out.println("Data entered is  "+objString);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
