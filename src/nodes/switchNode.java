package nodes;

public class switchNode extends treeNode{

	public switchNode() {}

	@Override
	public Object execute() {

		int defaultExists = 0;

		// Figure out if there's a default case
		if (children.size() % 2 != 0)
			defaultExists = 1;

		boolean matched = false;
		for (int i = 0; i < children.size() - defaultExists; i++) {
			matched = (boolean)children.get(i).execute();
			if (matched) {
				System.out.println("switchNode matched and executed blockNode");
				return null;
			}
		}
		if (defaultExists == 1)
		{
			System.out.println("default case executed");
			children.get(children.size() - 1).execute();
			return null;
		}
		return null;
	}
}
