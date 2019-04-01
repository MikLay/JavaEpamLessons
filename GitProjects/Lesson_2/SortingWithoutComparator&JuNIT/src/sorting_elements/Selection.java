package sorting_elements;

import java.util.Comparator;

public class Selection implements Sorter_strategy
{
	public <T> void sort(T[] a, Comparator<T> comparator)
	{
		for (int i = 0; i < a.length - 1; i++)
		{
			int index = i;
			for (int j = i + 1; j < a.length; j++)
				if (comparator.compare( a[index], a[j]) < 0)
					index = j;
		Utillits.swapper(a, index, i);
		}
	}
	@Override
	public String getName()
	{
		return "SelectionSort";
	}
}
