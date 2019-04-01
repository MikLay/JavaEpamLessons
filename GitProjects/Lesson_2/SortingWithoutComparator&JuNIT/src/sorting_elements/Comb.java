package sorting_elements;

import java.util.Comparator;

public class Comb implements Sorter_strategy
{
	public <T> void sort(T[] a, Comparator<T> comparator)
	{
		int gap = a.length;
		boolean swapped;

		do
		{
			swapped = false;
			gap = newGap(gap);

			for (int i = 0; i < (a.length - gap); i++)
			{
				if (comparator.compare((T) a[i], (T) a[i + gap]) > 0)
				{
					swapped = true;
					Utillits.swapper(a, i, i + gap);
				}
			}
		} while (gap > 1 || swapped);

	}

	private int newGap(int gap)
	{
		gap = gap * 10 / 13;

		if (gap == 9 || gap == 10)
			gap = 11;
		if (gap < 1)
			return 1;

		return gap;
	}

	@Override
	public String getName()
	{
		return "CombSort";
	}
}
