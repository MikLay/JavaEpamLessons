package sorting_elements;

import java.util.Comparator;

public class Quick2 implements Sorter_strategy
{

	private final static int INSERTION_SORT_THERSHOLD = 6;

	public <T> void sort(T[] a, Comparator<T> comparator)
	{
		DoQuickSortUp(a, 0, a.length - 1, comparator);
	}

	private static <T> void DoQuickSortUp(T[] a, int low, int high, Comparator<T> comparator)
	{
		if (high <= low + INSERTION_SORT_THERSHOLD)
		{
			insertionsort(a, low, high, comparator);
			return;
		}

		int pi = partition(a, low, high, comparator);

		DoQuickSortUp(a, low, pi - 1, comparator);
		DoQuickSortUp(a, pi + 1, high, comparator);

	}

	private static <T> void insertionsort(T[] a, int lo, int hi, Comparator<T> comparator)
	{
		for (int i = lo; i < hi; i++)
		{
			for (int j = i; j > lo; j--)
			{
				if (comparator.compare(a[j], a[j - 1]) < 0)
					Utillits.swapper(a, j, j - 1);
			}
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
		return "QuickSort with Insertion";
	}
}
