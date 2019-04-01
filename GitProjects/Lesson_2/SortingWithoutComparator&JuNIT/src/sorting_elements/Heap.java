package sorting_elements;

import java.util.Comparator;

public class Heap implements Sorter_strategy
{
	public <T> void sort(T[] arr, Comparator<T> comparator)
    {
        int n = arr.length;
 
        for (int i = n / 2 - 1; i >= 0; i--)
            heaping(arr, n, i, comparator);
 
        for (int i=n-1; i>=0; i--)
        {
        	Utillits.swapper(arr, 0, i);
 
            heaping(arr, i, 0, comparator);
        }
    }
	
    private <T> void heaping(T[] arr, int n, int i, Comparator<T> comparator)
    {
        int largest = i;  
        int l = 2*i + 1;  
        int r = 2*i + 2;  
 
        if (l < n && comparator.compare(arr[l],arr[largest]) > 0)
            largest = l;
 
        if (r < n && comparator.compare(arr[r],arr[largest]) > 0)
            largest = r;
 
        if (largest != i)
        {
            Utillits.swapper(arr, i, largest);
        
            heaping(arr, n, largest, comparator);
        }
    }

    @Override
	public String getName()
	{
		return "HeapSort";
	}
}
