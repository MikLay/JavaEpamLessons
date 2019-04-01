package sorting_elements;

import java.util.Comparator;

public class Shell implements Sorter_strategy
{
	
	
	public <T> void sort(T[] a, Comparator<T> comparator)
	{
		{
			int n = a.length;

			for (int gap = n / 2; gap > 0; gap /= 2)
			{
				for (int i = gap; i < n; i += 1)
				{
					T temp = a[i];

					int j;
					for (j = i; j >= gap && comparator.compare(a[j - gap], temp) > 0; j -= gap)
						a[j] = a[j - gap];

					a[j] = temp;
				}
			}
		}
	}

	@Override
	public String getName()
	{
		return "ShellSort";
	}

}
