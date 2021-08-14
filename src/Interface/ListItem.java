package Interface;

public abstract class ListItem {
	protected ListItem rightLink, leftLink;
	protected Object value;

	public ListItem(Object value) {
		this.value = value;
	}

	abstract ListItem next();

	abstract ListItem setNext(ListItem listItem);

	abstract ListItem previous();

	abstract ListItem setPrevious(ListItem listItem);

	abstract int compareTo(ListItem listItem);

	public Object getValue() {
		return this.value;
	}

	public void setValue(Object object) {
		this.value = object;
	}
}
