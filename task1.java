package lab8;

import java.io.*;

public class task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("lab8/task1.txt"));
        String input = "", t = "";
        while ((t = in.readLine()) != null) input += t + '\n';
        in.close();

        for (int i = 0; i < input.split("\\s|[.,!?]\\s").length - 1; i++)
            if (input.split("\\s|[.,!?]\\s")[i].charAt(input.split("\\s|[.,!?]\\s")[i].length() - 1) == input.split("\\s|[.,!?]\\s")[i + 1].charAt(0))
                System.out.println(input.split("\\s|[.,!?]\\s")[i]);
    }
}
