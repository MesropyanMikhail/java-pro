package ua.ithillel.homeworks.hw14.task1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

public class App {

    public static void main(String[] args) {
        byte[] allBytes;
        HashMap words = new HashMap<String, Integer>();

        try (FileInputStream fileInputStream = new FileInputStream("C:\\Lerning\\Hillel\\java-pro-mesopyan\\src\\ua\\ithillel\\homeworks\\hw14\\task1\\inputFile.txt")) {
            allBytes = fileInputStream.readAllBytes();
            for (String word : new String(allBytes).split(" ")) {
                //System.out.println(word);
                if (words.containsKey(word)) {
                    words.put(word, (Integer) words.get(word) + 1);
                } else {
                    words.put(word, 1);
                }
            }
            System.out.println(words);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
