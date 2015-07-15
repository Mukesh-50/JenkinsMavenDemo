package collectionAPI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jdt.internal.compiler.ast.ArrayAllocationExpression;

public class ListDemo1 {

	public static void main(String[] args) {
		
		
		List<String> list=new ArrayList<String>();
		
		List<Double> list1=new ArrayList<Double>();
		
		List<Float>  list2=new ArrayList<Float>();
		
		list2.add(15.1f);
		
		
		list.add("Toolsqa");
		list.add("Toolsqa1");
		list.add("Toolsqa2");
		list.add("Toolsqa3");
		
		System.out.println(list);
		
		
	  Iterator<String> i1=list.iterator();
		
		while(i1.hasNext())
		{
			
			System.out.println(i1.next());
			
		}
		
		
		
		

	}

}
