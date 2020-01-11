package com.example;

public class Main {
    public static void main(String[] args) {
        // String[] args in main function is used to get values in String from command line.
        // Integer.parseInt() function is used to convert string values into integer.
        int l1 = Integer.parseInt(args[0]);
        int l2 = Integer.parseInt(args[1]);

        // computeDistance is a simple function to calculate distance between both points
        CommandController cc = new CommandController();
        int distance = cc.computeDistance(l1, l2);

        // Compute distance only if both points are positive
        if (distance != -1) {
            System.out.println("Distance between " + l1 + " & " + l2 + ": " + distance);
        } else {
            System.out.println("Both distances must be positive");
        }
    }
}
