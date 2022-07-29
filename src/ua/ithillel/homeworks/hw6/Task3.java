package ua.ithillel.homeworks.hw6;

public class Task3 {
    static int sum = 0;
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        task3.numberSum(1210);
        System.out.println(sum);
    }

    int numberSum(int actualNumber){
        if (actualNumber != 0) {
            sum += actualNumber % 10;
            return numberSum(actualNumber /= 10);
        }
        return actualNumber;
    }
}
