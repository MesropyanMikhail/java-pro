package ua.ithillel.homeworks.hw3;

public class Task1 {
    public static void main(String[] args) {
        int[] firstSequence = {1, 2, 3, 4, 5, 7, 8, 9, 3, 4, 5, 6, 10};
        int[] secondSequence = {3, 4, 5, 6};
        boolean included = false;

        for (int i = 0; i < firstSequence.length; i++) {
            for (int j = 0; j < secondSequence.length; j++) {
                if ((i + j) >= firstSequence.length) {
                    break;
                }
                if (firstSequence[i + j] == secondSequence[j]) {
                    included = true;
                } else {
                    included = false;
                    break;
                }
            }
            if (included) {
                System.out.println("the second sequence is included in the first.");
                break;
            }
        }
        if (!included) {
            System.out.println("the second sequence is not included in the first");
        }
    }
}
