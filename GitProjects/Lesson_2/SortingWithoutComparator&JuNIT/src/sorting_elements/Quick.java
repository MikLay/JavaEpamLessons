package sorting_elements;

import java.util.Comparator;


public class Quick implements Sorter_strategy
{
	public <T> void sort(T[] a, Comparator<T> comparator)
	{
		DoQuickSortUp(a, 0, a.length - 1, comparator);
	}

	private static <T> void DoQuickSortUp(T[] a, int low, int high, Comparator<T> comparator)
	{
		if (low < high)
		{
			int pi = partition(a, low, high, comparator);

			DoQuickSortUp(a, low, pi - 1, comparator);
			DoQuickSortUp(a, pi + 1, high, comparator);
		}
	}

	private static <T> int partition(T[] a, int low, int high, Comparator<T> comparator)
	{
		{
			T pivot = a[high];
			int i = (low - 1); 
			for (int j = low; j < high; j++)
			{
				if (comparator.compare(a[j], pivot) <= 0)
				{
					i++;

					Utillits.swapper(a, i, j);

				}
			}

			Utillits.swapper(a, i + 1, high);

			return i + 1;
		}
	}
	@Override
	public String getName()
	{
		return "QuickSort";
	}
}
