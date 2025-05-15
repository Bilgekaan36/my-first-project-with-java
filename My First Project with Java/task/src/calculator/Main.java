package calculator;

import java.sql.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> products = new HashMap<>();

        products.put("Bubblegum", 202);
        products.put("Toffee", 118);
        products.put("Ice cream", 2250);
        products.put("Milk chocolate", 1680);
        products.put("Doughnut", 1075);
        products.put("Pancake", 80);

        int totalIncome = 0;
        System.out.println("Earned amount:");
        for (Map.Entry<String, Integer> product : products.entrySet()) {
            String productName = product.getKey();
            int productPrice = product.getValue();
            totalIncome += productPrice;

            System.out.printf("%s: $%d %n", productName, productPrice);
        }
        System.out.println();
        System.out.printf("Income: $%d", totalIncome);
        System.out.println();

        System.out.println("Staff expenses:");
        int staffExpense = scanner.nextInt();
        totalIncome -= staffExpense;

        System.out.println("Other expenses:");
        int otherExpense = scanner.nextInt();
        totalIncome -= otherExpense;
        System.out.printf("Net income: $%d", totalIncome);
    }
}