import java.util.TreeSet;

public class SortStringAlphabeticalOrder
{
    public static String[] sortStrings(final TreeSet<String> arr) {
        final int n = arr.size();
        String[] str_arr = new String[n];
        str_arr = arr.toArray(str_arr);
        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; ++i) {
                str_arr[i] = str_arr[i].toUpperCase();
            }
            for (int i = n / 2; i < n; ++i) {
                str_arr[i] = str_arr[i].toLowerCase();
            }
        }
        else {
            for (int i = 0; i < n / 2 + 1; ++i) {
                str_arr[i] = str_arr[i].toUpperCase();
            }
            for (int i = n / 2 + 1; i < n; ++i) {
                str_arr[i] = str_arr[i].toLowerCase();
            }
        }
        return str_arr;
    }
    
    public static void main(final String[] args) {
        final TreeSet<String> str = new TreeSet<String>();
        str.add("Hello");
        str.add("Welcome");
        str.add("tO");
        str.add("the");
        str.add("Capgemini");
        final String[] arr_result = sortStrings(str);
        String[] array;
        for (int length = (array = arr_result).length, j = 0; j < length; ++j) {
            final String i = array[j];
            System.out.print(String.valueOf(i) + "  ");
        }
    }
}