package ua.ithillel.homeworks.hw6;

public class Task2 {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.calculateNumber( 5, 10 );
    }

    int calculateNumber (int actualNumber, int endNumber) {
        System.out.println(actualNumber);
        if ( actualNumber == endNumber ) {
            return endNumber;
        }
        return calculateNumber(actualNumber+1, endNumber);
    }
}
