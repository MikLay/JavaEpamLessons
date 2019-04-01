package sorting_elements;

import ua.In;
import ua.Out;
import ua.Stopwatch;

public class SortTester
{

	static Out out = new Out("output_data.txt");

	public static void main(String[] args)
	{

		Sorter_strategy[] SorterSet = new Sorter_strategy[5];

		SorterSet[0] = new Quick4();
		SorterSet[1] = new Comb();
		SorterSet[2] = new Heap();
		SorterSet[3] = new Shell();
		SorterSet[4] = new Merge4();
		
		out.println(
				"__________________________________________________\n__________________________________________________"
						+ "\nRANDOM DATA");
		Utillits.milion_random_data();
		time(SorterSet);





		/*out.println(
				"__________________________________________________\n__________________________________________________"
						+ "\nSORTED DATA");
		Utillits.done_data();
		time(SorterSet);
		out.println(
				"__________________________________________________\n__________________________________________________"
						+ "\nREVERSED SORTED DATA");
		Utillits.done_reversed_data();
		time(SorterSet);
		out.println(
				"__________________________________________________\n__________________________________________________"
						+ "\nSIMILAR DATA");
		Utillits.similar_data();
		time(SorterSet);
*/
		out.close();
	}

	private static void time(Sorter_strategy[] SorterSet)
	{
		for (Sorter_strategy strategy : SorterSet)
		{
			out.println("------------------------------");
			out.println("Algorithm: " + strategy.getName().toUpperCase());
			int temp[] = new In("1000000.txt").readAllInts();
			Integer[] a1_000_000 = changer(temp);
			out.println("Sorting 1_000_000: " + certain(a1_000_000, strategy) + " nanoseconds");


			/*out.println("------------------------------");
			out.println("Algorithm: " + strategy.getName().toUpperCase());
			int temp[] = new In("1024.txt").readAllInts();
			Integer[] a1024 = changer(temp);
			out.println("Sorting 1024: " + certain(a1024, strategy) + " nanoseconds");

			temp = new In("2048.txt").readAllInts();
			Integer[] a2048 = changer(temp);
			out.println("Sorting 2048: " + certain(a2048, strategy) + " nanoseconds");

			temp = new In("4096.txt").readAllInts();
			Integer[] a4096 = changer(temp);
			out.println("Sorting 4096: " + certain(a4096, strategy) + " nanoseconds");

			temp = new In("8192.txt").readAllInts();
			Integer[] a8192 = changer(temp);
			out.println("Sorting 8192: " + certain(a8192, strategy) + " nanoseconds");

			temp = new In("16384.txt").readAllInts();
			Integer[] a16384 = changer(temp);
			out.println("Sorting 16384: " + certain(a16384, strategy) + " nanoseconds");

			temp = new In("32768.txt").readAllInts();
			Integer[] a32768 = changer(temp);
			out.println("Sorting 32768: " + certain(a32768, strategy) + " nanoseconds");

			out.println("---------------------------------");*/
		}

	}

	
	private static double certain(Integer[] array, Sorter_strategy strategy)
	{
		double sum = 0;
		int iter = 1;
		for(int i = 0; i < iter; i++)
		{
			Stopwatch timer = new Stopwatch();
			strategy.sort(array);
			sum = timer.elapsedTime();
		}
	return sum/iter;
	
	}
	private static Integer[] changer(int[] data)
	{
		Integer n_data[] = new Integer[data.length];
		for (int i = 0; i < data.length; i++)
		{
			n_data[i] = data[i];
		}
		return n_data;
	}
}
