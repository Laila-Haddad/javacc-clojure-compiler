package nodes;

import java.util.Iterator;

public class printNode extends treeNode{
	
	public printNode() {} 
	
	public Object execute()
	{
		String text = "";
		
//		Check if there is concatention
		if (children.size() > 1) {
			for (int i = 0; i < children.size(); i++) {
				text += children.get(i).execute().toString();
			}
		}
		else
			text = children.get(0).execute().toString();
		
		System.out.println(text);
		return null;
	}
}
