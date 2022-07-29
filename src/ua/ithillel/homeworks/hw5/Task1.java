package ua.ithillel.homeworks.hw5;

public class Task1 {

    public boolean sequenceIncluded(int[] firstSequence, int[] secondSequence) {
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
                return true;
            }
        }
        return false;
    }
}
