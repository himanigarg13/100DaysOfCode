import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

public static String findDay(int month, int day, int year) {
        Calendar c = Calendar.getInstance();
        c.set(year, month-1, day);
        int Day = c.get(Calendar.DAY_OF_WEEK);
        String d = c.getTime().toString().substring(0, 3);
        String result = "";
        if (d.equals("Mon")){
            result = "MONDAY";   
        } else if (d.equals("Tue")) {
            result = "TUESDAY";
        } else if (d.equals("Wed") ) {
            result = "WEDNESDAY";
        } else if (d.equals("Thu")) {
            result = "THURSDAY";
        } else if (d.equals("Fri")) {
            result = "FRIDAY";
        } else if (d.equals("Sat")) {
            result = "SATURDAY";
        } else if (d.equals("Sun")) {
            result = "SUNDAY";
        }
        return result;
    }


}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
