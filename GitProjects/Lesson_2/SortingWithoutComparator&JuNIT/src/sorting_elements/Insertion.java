package sorting_elements;

import java.util.Comparator;

public class Insertion implements Sorter_strategy
{
	public <T> void sort(T[] a, Comparator<T> comparator)
	{
		for (int i = 1; i < a.length; i++)
		{
			int j = i;
			while (j > 0 && comparator.compare(a[j], a[j - 1]) < 0)
			{
				Utillits.swapper(a, j, j - 1);
				j--;
			}
		}
	}
	@Override
	public String getName()
	{
		return "InsertionSort";
	}
}
