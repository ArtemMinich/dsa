package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myElements = {2, 56, 9, 12, 4, 10, 5, 91, 7, 8};
        Arrays.sort(myElements);
        System.out.println("Array: " + Arrays.toString(myElements));
        System.out.println("Enter target: ");
        int target;
        while (true) {
            String inputData = scanner.next();
            if(isConvertibleToInt(inputData)){
                target = Integer.parseInt(inputData);
                break;
            }
            else {
                System.out.println("Error!!! Enter number:");
            }
        }
        System.out.println("Index of target: " + binarySearch(myElements, target, 0, myElements.length - 1));
    }

    public static boolean isConvertibleToInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static int binarySearch(int[] elements, int target, int low, int high) {
        int mid = -1;
        if (high >= low) {
            mid = low + (high - low) / 2;
            if (elements[mid] > target) {
                return binarySearch(elements, target, low, mid - 1);
            } else if (elements[mid] < target) {
                return binarySearch(elements, target, mid + 1, high);
            }
        }
        return mid;
    }
}