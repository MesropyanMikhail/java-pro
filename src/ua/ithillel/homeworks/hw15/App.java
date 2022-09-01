package ua.ithillel.homeworks.hw15;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class App {
    final static int CHARSWIFT = 48;

    public static void main(String[] args) {

        //String infixexpr = "2+2*2+2";
        String infixexpr = "2-2";
        System.out.println(infixexpr);
        //String infixexpr = "(A+B)*C-(D-E)*(F+G)";
        // System.out.println(infixToPostfix(infixexpr));
        System.out.println(postfixEval(infixToPostfix(infixexpr)));

    }

    public static List infixToPostfix(String infixexpr) {
        List<Character> result = new ArrayList<Character>();
        ArrayDeque<Character> stack = new ArrayDeque<Character>();

        for (Character simbol : infixexpr.toCharArray()) {
            if (Character.isAlphabetic(simbol) || Character.isDigit(simbol)) {
                result.add(simbol);
            } else if (simbol == '(') {
                stack.push(simbol);
            } else if (simbol == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.add(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && (precedence(simbol) <= precedence(stack.peek()))) {
                    result.add(stack.pop());
                }
                stack.push(simbol);
            }
        }
        while (!stack.isEmpty()) {
            result.add(stack.pop());

        }
        return result;
    }

    public static int postfixEval(List<Character> postfixExpr) {
        ArrayDeque<Character> stack = new ArrayDeque<Character>();

        for (Character simbol : postfixExpr) {
            if (Character.isDigit(simbol)) {
                stack.push(simbol);
            } else {
                stack.push(calculate(stack.pop(), stack.pop(), simbol));
            }
        }
        return stack.pop() - CHARSWIFT;
    }

    private static Character calculate(Character operandSecond, Character operandFirst, Character operator) {
        int result = 0;

        switch (operator) {
            case '*':
                result = convertCharToInt(operandFirst) * convertCharToInt(operandSecond);
                break;
            case '/':
                if (convertCharToInt(operandSecond) != 0) {
                    result = convertCharToInt(operandFirst) / convertCharToInt(operandSecond);
                } else {
                    result = 0;
                }
                break;
            case '+':
                result = convertCharToInt(operandFirst) + convertCharToInt(operandSecond);
                break;
            case '-':
                result = convertCharToInt(operandFirst) - convertCharToInt(operandSecond);
                break;
        }
        return (char) (result + CHARSWIFT);
    }

    private static int precedence(Character operator) {
        if ((operator == '*') || (operator == '/')) {
            return 3;
        } else if ((operator == '+') || (operator == '-')) {
            return 2;
        } else {
            return 1;
        }
    }

    private static int convertCharToInt(Character character) {
        return character - CHARSWIFT;
    }
}
