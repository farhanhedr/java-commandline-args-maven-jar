package com.example;

public class CommandController {
    public int computeDistance(int l1, int l2) {
        boolean verified = verifyDistance(l1, l2);
        if (verified) {
            // Math.abs() converts negative number to positive
            return Math.abs(l1 - l2);
        } else {
            return -1;
        }
    }

    private boolean verifyDistance(int l1, int l2) {
        if (l1 < 0 || l2 < 0)
            return false;
        else
            return true;
    }
}
