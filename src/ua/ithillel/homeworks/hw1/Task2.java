package ua.ithillel.homeworks.hw1;

public class Task2 {
    public static void main(String[] args) {
        int argsIndex = args.length - 1;

        for (int i = 0; i <= argsIndex; i++) {
            System.out.println(args[argsIndex - i]);
        }
    }
}