package ua.ithillel.homeworks.hw17;

public class App {

    public static void main(String[] args) {
        String string = "Neque Neque Neque porrop porrop quisquam este est qui doloremd ipsum quia dolor sit amet, consectetur, adipisci velit...";

        WordsUtils wordsUtils = new WordsUtils();
        System.out.println(wordsUtils.countWordRepeat(string));
        System.out.println(wordsUtils.firstLastLetterSame(string));
        System.out.println(wordsUtils.punctuationMarks(string));
        System.out.println(wordsUtils.replaceLatter(string, 3, "M"));
    }

}
