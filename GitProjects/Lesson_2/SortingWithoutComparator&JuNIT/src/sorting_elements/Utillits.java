package sorting_elements;

import java.util.Random;

import ua.Out;

public class Utillits {
    public static <T> void swapper(T[] array, int f_index, int s_index) {
        T swap = array[f_index];
        array[f_index] = array[s_index];
        array[s_index] = swap;
    }

    public static int[] random_data(int[] data) {
        final Random roll = new Random();

        for (int i = 0; i < data.length; i++) {
            data[i] = roll.nextInt();
        }
        return data;
    }


    public static void milion_random_data()
    {
        Out s_1000000 = new Out("1000000.txt");
        Random roll = new Random();
        for (int i = 0; i < 1_000_000; i++)
            s_1000000.println(roll.nextInt(1_000_000));

        s_1000000.close();
    }

    public static void random_data() {

        Out s_1024 = new Out("1024.txt");
        Out s_2048 = new Out("2048.txt");
        Out s_4096 = new Out("4096.txt");
        Out s_8192 = new Out("8192.txt");
        Out s_16384 = new Out("16384.txt");
        Out s_32768 = new Out("32768.txt");
        Out s_1000000 = new Out("1000000.txt");
        Random roll = new Random();

        for (int i = 0; i < 1024; i++)
            s_1024.println(roll.nextInt(1025));
        for (int i = 0; i < 2048; i++)
            s_2048.println(roll.nextInt(2049));
        for (int i = 0; i < 4096; i++)
            s_4096.println(roll.nextInt(4097));
        for (int i = 0; i < 8192; i++)
            s_8192.println(roll.nextInt(8193));
        for (int i = 0; i < 16384; i++)
            s_16384.println(roll.nextInt(16385));
        for (int i = 0; i < 32768; i++)
            s_32768.println(roll.nextInt(32768));
        for (int i = 0; i < 1_000_000; i++)
            s_32768.println(roll.nextInt(1_000_000));

        s_1024.close();
        s_2048.close();
        s_4096.close();
        s_8192.close();
        s_16384.close();
        s_32768.close();
        s_1000000.close();
    }

    public static void done_data() {

        Out s_1024 = new Out("1024.txt");
        Out s_2048 = new Out("2048.txt");
        Out s_4096 = new Out("4096.txt");
        Out s_8192 = new Out("8192.txt");
        Out s_16384 = new Out("16384.txt");
        Out s_32768 = new Out("32768.txt");
        Out s_1000000 = new Out("1000000.txt");

        for (int i = 0; i < 1024; i++) {
            s_1024.println(i);
        }

        for (int i = 0; i < 2048; i++) {
            s_2048.println(i);
        }
        for (int i = 0; i < 4096; i++) {
            s_4096.println(i);
        }
        for (int i = 0; i < 8192; i++) {
            s_8192.println(i);
        }
        for (int i = 0; i < 16384; i++) {
            s_16384.println(i);
        }
        for (int i = 0; i < 32768; i++) {
            s_32768.println(i);
        }
        for (int i = 0; i < 1_000_000; i++) {
            s_1000000.println(i);
        }


        s_1024.close();
        s_2048.close();
        s_4096.close();
        s_8192.close();
        s_16384.close();
        s_32768.close();
        s_1000000.close();
    }

    public static void done_reversed_data() {

        Out s_1024 = new Out("1024.txt");
        Out s_2048 = new Out("2048.txt");
        Out s_4096 = new Out("4096.txt");
        Out s_8192 = new Out("8192.txt");
        Out s_16384 = new Out("16384.txt");
        Out s_32768 = new Out("32768.txt");
        Out s_1000000 = new Out("1000000.txt");

        for (int i = 0, m = 1024; i < m; i++) {
            s_1024.println(m - i);
        }

        for (int i = 0, m = 2048; i < m; i++) {
            s_2048.println(m - i);
        }
        for (int i = 0, m = 4096; i < m; i++) {
            s_4096.println(m - i);
        }
        for (int i = 0, m = 8192; i < m; i++) {
            s_8192.println(m - i);
        }
        for (int i = 0, m = 16384; i < m; i++) {
            s_16384.println(m - i);
        }
        for (int i = 0, m = 32768; i < m; i++) {
            s_32768.println(m - i);
        }
        for (int i = 0, m = 1_000_000; i < 1_000_000; i++) {
            s_1000000.println(m - i);
        }

        s_1024.close();
        s_2048.close();
        s_4096.close();
        s_8192.close();
        s_16384.close();
        s_32768.close();
        s_1000000.close();

    }

    public static void similar_data() {
        Out s_1024 = new Out("1024.txt");
        Out s_2048 = new Out("2048.txt");
        Out s_4096 = new Out("4096.txt");
        Out s_8192 = new Out("8192.txt");
        Out s_16384 = new Out("16384.txt");
        Out s_32768 = new Out("32768.txt");
        Out s_1000000 = new Out("1000000.txt");

        for (int i = 0; i < 1024; i++) {
            s_1024.println(1);
        }

        for (int i = 0; i < 2048; i++) {
            s_2048.println(1);
        }
        for (int i = 0; i < 4096; i++) {
            s_4096.println(1);
        }
        for (int i = 0; i < 8192; i++) {
            s_8192.println(1);
        }
        for (int i = 0; i < 16384; i++) {
            s_16384.println(1);
        }
        for (int i = 0; i < 32768; i++) {
            s_32768.println(1);
        }
        for (int i = 0; i < 1_000_000; i++) {
            s_1000000.println(1);
        }
        s_1024.close();
        s_2048.close();
        s_4096.close();
        s_8192.close();
        s_16384.close();
        s_32768.close();
        s_1000000.close();

    }

}
