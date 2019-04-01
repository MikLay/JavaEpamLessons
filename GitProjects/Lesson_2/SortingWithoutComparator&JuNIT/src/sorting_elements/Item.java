package sorting_elements;


public class Item implements Comparable<Item>
{
	private int size;


//	Item(int size, int height, String color)
//	{
//		this.size = size;
//		this.height = height;
//		this.color = color;
//	}

	@Override
	public int compareTo(Item that)
	{
		return this.size - that.size;
	}
}