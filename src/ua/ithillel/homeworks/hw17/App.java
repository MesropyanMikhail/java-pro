package ua.ithillel.homeworks.hw17;

import java.util.Map;

public class App {

    public static void main(String[] args) {

        String string = "Edit Edit the Expression & Text to see matches. Roll over matches or the expression for details. PCRE & JavaScript flavors of RegEx are supported. Validate your expression with Tests mode.";
        Map<String, Integer> result = WordsUtils.countWordRepeat(string);
        System.out.println(result);

        String string1 = "Edit Edit the Expression & text to see matches. Roll overo overo matches or the expression forf details. PCRE & JavaScript flavors of RegEx are supported. Validate your expression with Tests mode.";
        System.out.println(WordsUtils.firstLastLetterSame(string1));

        String string2 = "Edit Edit the Expression & Tex-t to see matches. Roll over matches or the expression for details. PCRE & JavaScript flavors of RegEx are supported. Validate your expression with Tests mode.";
        System.out.println(WordsUtils.punctuationMarks(string2));

        String string3 = "Edit Edit the Expression & Tex-t to see matches. Roll over matches or the expression for details. PCRE & JavaScript flavors of RegEx are supported. Validate your expression with Tests mode.";
        System.out.println(WordsUtils.replaceLatter(string3, 2, "M"));

    }
}
