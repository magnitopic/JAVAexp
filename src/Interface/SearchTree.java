package Interface;

public class SearchTree implements NodeList {
	private ListItem root;

	public SearchTree(ListItem root) {
		this.root = root;
	}

	@Override
	public ListItem getRoot() {
		return root;
	}

	@Override
	public boolean addItem(ListItem listItem) {
		if (this.root == null) {
			this.root = listItem;
			return true;
		}
		ListItem currentItem = this.root;
		while (currentItem != null) {
			int comparison = (currentItem.compareTo(listItem));
			if (comparison < 0) {
				if (currentItem.next() != null) {
					currentItem = currentItem.next();
				} else {
					currentItem.setNext(listItem).setPrevious(currentItem);
					return true;
				}
			} else if (comparison > 0) {
				if (currentItem.previous() != null) {
					currentItem.previous().setNext(listItem).setPrevious(currentItem.previous());
					listItem.setNext(currentItem).setPrevious(listItem);
				} else {
					listItem.setNext(this.root).setPrevious(listItem);
					this.root = listItem;
				}
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean removeItem(ListItem listItem) {
		ListItem currentItem = this.root;
		ListItem parentItem = currentItem;
		while (currentItem != null) {
			int comparison = (currentItem.compareTo(listItem));
			if (comparison < 0) {
				parentItem = currentItem;
				currentItem = currentItem.next();
			} else if (comparison > 0) {
				parentItem = currentItem;
				currentItem = currentItem.previous();
			} else {
				performRemoval(currentItem, parentItem);
				return true;
			}
		}
		return false;
	}

	private void performRemoval(ListItem item, ListItem parent) {
		if (item.next() == null) {
			if (parent.next() == item) {
				parent.setNext(item.previous());
			} else if (parent.previous() == item) {
				parent.setPrevious(item.previous());
			} else {
				this.root = item.previous();
			}
		} else if (item.previous() == null) {
			if (parent.next() == item) {
				parent.setNext(item.next());
			} else if (parent.previous() == item) {
				parent.setPrevious(item.next());
			} else {
				this.root = item.next();
			}
		} else {

			ListItem current = item.next();
			ListItem leftmostParent = item;
			while (current.previous() != null) {
				leftmostParent = current;
				current = current.previous();
			}
			item.setValue(current.getValue());
			if (leftmostParent == item) {
				item.setNext(current.next());
			} else {
				leftmostParent.setPrevious(current.next());
			}
		}
	}

	@Override
	public void traverse(ListItem root) {
		if (root != null) {
			traverse(root.previous());
			System.out.println(root.getValue());
			traverse(root.next());
		}
	}
}
