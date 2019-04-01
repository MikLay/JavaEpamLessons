package sorting_elements;

import java.util.Comparator;

public class Quick4 implements Sorter_strategy
{
	public final static int INSERTION_SORT_THERSHOLD = 6;

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

		int[] pivots = partition3(a, low, high, comparator);

		int lt = pivots[0];
		int gt = pivots[1];

		DoQuickSortUp(a, low, lt - 1, comparator);
		DoQuickSortUp(a, gt + 1, high, comparator);

	}

	private static <T> int[] partition3(T[] array, int lo, int hi, Comparator<T> comparator)
	{

		int lt = lo, gt = hi;
		T cmp = array[lo];
		int i = lo;

		while (true)
		{
			if (comparator.compare(array[i], cmp) < 0)
				Utillits.swapper(array, i++, lt++);
			else if (comparator.compare(array[i], cmp) > 0)
				Utillits.swapper(array, i, gt--);
			else
				i++;

			if (i > gt)
				break;
		}

		return new int[] { lt, gt };

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

	@Override
	public String getName()
	{
		return "Improved QuickSort";
	}
}
