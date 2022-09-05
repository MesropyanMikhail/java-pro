package ua.ithillel.homeworks.hw17;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsUtils {

    static Map countWordRepeat(String text) {
        Map<String, Integer> words = new HashMap<>();

        Pattern pattern = Pattern.compile("\\b(\\w+)\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find())
            if (words.containsKey(matcher.group())) {
                words.put(matcher.group(), words.get(matcher.group()) + 1);
            } else {
                words.put(matcher.group(), 1);
            }
        return words;
    }

    static Set firstLastLetterSame(String text) {
        Set<String> words = new HashSet<String>();

        Pattern pattern = Pattern.compile("\\s(\\w)(\\w+)(\\w\\1)\\s");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            words.add(matcher.group());
        }
        return words;
    }

    static int punctuationMarks(String text) {
        int counter = 0;

        Pattern pattern = Pattern.compile("[.,!?&_-]");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            counter++;
        }
        return counter;
    }


    static String replaceLatter(String text, int indexLetter, String replacement) {

        StringBuilder text1 = new StringBuilder(text);
        Matcher m = Pattern.compile("\\b(\\w{" + indexLetter + "})(\\w)(\\w*)\\b").matcher(text1);
        while (m.find()) {

            //System.out.println(m.start(2) + " -- " + m.end(2));
            text1.replace(m.start(2), m.end(2), replacement);
        }
        System.out.println(text1);
        return text1.toString();
    }

}
