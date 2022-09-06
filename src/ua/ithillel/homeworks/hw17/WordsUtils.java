package ua.ithillel.homeworks.hw17;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsUtils {

    public Map countWordRepeat(String text) {
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

    public Set firstLastLetterSame(String text) {
        Set<String> words = new HashSet<String>();
        Pattern pattern = Pattern.compile("\\s(\\w)(\\w+)(\\w\\1)\\s");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            words.add(matcher.group());
        }
        return words;
    }

    public int punctuationMarks(String text) {
        int counter = 0;
        Pattern pattern = Pattern.compile("[.,!?&_-]");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            counter++;
        }
        return counter;
    }

    public String replaceLatter(String text, int indexLetter, String replacement) {
        StringBuilder result = new StringBuilder(text);

        Matcher matcher = Pattern.compile("\\b(\\w{" + indexLetter + "})(\\w)(\\w*)\\b").matcher(result);
        while (matcher.find()) {
            result.replace(matcher.start(2), matcher.end(2), replacement);
        }
        return result.toString();
    }

}
