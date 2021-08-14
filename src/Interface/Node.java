package Interface;

public class Node extends ListItem {

	public Node(Object object) {
		super(object);
	}

	ListItem next() {
		return super.rightLink;
	}

	@Override
	ListItem setNext(ListItem listItem) {
		super.rightLink = listItem;
		return super.rightLink;
	}

	@Override
	ListItem previous() {
		return super.leftLink;
	}

	@Override
	ListItem setPrevious(ListItem listItem) {
		super.leftLink = listItem;
		return super.leftLink;
	}

	@Override
	int compareTo(ListItem item) {
		if (item != null) {
			return ((String) super.getValue()).compareTo((String) item.getValue());
		} else {
			return -1;
		}
	}
}
