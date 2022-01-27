import java.util.Iterator;

public interface DynamicListInterface<Item>
{
	public void add(Item item);
	public void addAt(int index, Item item);
	public Item get(int index);
	public Item set(int index, Item item);	
	public boolean remove(Item item);
	public Item removeAt(int index);
	public int indexOf(Item item);	
	public int lastIndexOf(Item item);
	public boolean contains(Item item);
	public int size();
	public boolean isEmpty();
	public void clear();
	public Iterator<Item> iterator();
}
