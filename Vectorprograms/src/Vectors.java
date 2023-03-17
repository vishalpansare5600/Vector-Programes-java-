import java.util.Vector;

public class Vectors 
{	
	
	public static void main(String[] args) 
	{
		Vector V=new Vector();
		V.addVector(new Integer(10));
		V.addVector(new Integer(10));
		V.addVector(new Integer(10));
		V.addVector(new Integer(10));
		V.addVector(new Integer(10));
		System.out.println("vector elements are ");
		System.out.println(V);
		System.out.println("orignal size="+V.size());
		V.removerElementAt(3);
		V.insertElementAt(3);
		
		System.out.println("current size="+V.size());
	}

}
