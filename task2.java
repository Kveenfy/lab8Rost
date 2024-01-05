package lab8;

import java.io.*;

public class task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("lab8/task2.txt"));
        String input = "", t = "";
        while ((t = in.readLine()) != null) input += t;
        String arr[] = input.split(" ");
        in.close();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > 2) arr[i] = arr[i].toUpperCase();
            System.out.print(arr[i] + ' ');
        }
    }
}
