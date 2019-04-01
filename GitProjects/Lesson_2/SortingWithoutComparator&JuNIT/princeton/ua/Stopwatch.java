package ua;

/*************************************************************************
 *  Compilation:  javac Stopwatch.java
 *
 *
 *************************************************************************/

/**
 * <i>Stopwatch</i>. This class is a data type for measuring the running time
 * (wall clock) of a program.
 * <p>
 * For additional documentation, see
 * <a href="http://introcs.cs.princeton.edu/32class">Section 3.2</a> of
 * <i>Introduction to Programming in Java: An Interdisciplinary Approach</i> by
 * Robert Sedgewick and Kevin Wayne.
 */

public class Stopwatch
{
	private final long start;

	public Stopwatch()
	{
		start = System.nanoTime();
	}

	public double elapsedTime()
	{
		long now = System.nanoTime();
		return (now - start) / 1000;
	}
}