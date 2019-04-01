package sorting_elements;

import java.util.Comparator;

public class Bubble implements Sorter_strategy
{
	public <T> void sort(T[] a, Comparator<T> comparator)
	{
		int l = a.length;
		for (int i = 0; i < l; i++)
			for (int j = i; j > 0; j--)
			{
				if ((comparator.compare( a[j], a[j - 1])) < 0)
				{
					Utillits.swapper(a, j - 1, j);
				} else
					break;
			}
	}
	@Override
	public String getName()
	{
		return "BubbleSort";
	}
}
