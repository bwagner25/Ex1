// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String city = "Columbus";
        int zipCode = 43228;
        int dailyHighs[] = {45,36,37,29,40};
        float total = 0;
        for(int i=0; i < dailyHighs.length; i++) {
            total += dailyHighs[i];
        }
        float avgTemp = total/dailyHighs.length;
        System.out.println("City: " + city);
        System.out.println("Zip Code: " + zipCode);
        System.out.println("Average High Temperature: " + avgTemp);
    }
}