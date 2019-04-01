package ua.company;

import static ua.company.Fibonacci.*;

public class ConsoleApplication {
    public static void main (String args[])
    {
        int n = 9;
        System.out.println(fibMatrix(n));
        System.out.println(fibIter(n));
        System.out.println(fibRecursive(n));
    }
}
