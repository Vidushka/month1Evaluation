import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Vidushka on 9/29/16.
 */
public class Question1 {
    public static void main(String[] args) {
        sortNumber();
    }

    /**
     * Method get input numbers from user and sort them
     */
    public static void sortNumber() {
        for (; ; ) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter numbers seperated by a space. ");
            String numberToSort = input.nextLine();

            /**
             * Controll the input format
             */
            String inputFormat = "^([+-]?\\d+ )+([+-]?\\d+)$";
            Pattern pt = Pattern.compile(inputFormat);
            Matcher mtch = pt.matcher(numberToSort);
            if (mtch.find()) {
                String[] numberArray = numberToSort.split("\\s+");

                /**
                 * convert the string array to int array
                 */
                int[] arr = new int[numberArray.length];
                for (int i = 0; i < numberArray.length; i++) {
                    arr[i] = Integer.parseInt(numberArray[i]);
                }

                Scanner order = new Scanner(System.in);
                System.out.println("How do you want to show sorted numbers Assending(a)/ Dissending(d)?");
                String outputOrder = order.nextLine();
                if (outputOrder.equals("a")) {
                    Scanner output = new Scanner(System.in);
                    System.out.println("How do you want to show sorted numbers horizontally(h)/ vertically(v)?");
                    String outputFormat = output.nextLine();

                    if (outputFormat.equals("h")) {
                        Arrays.sort(arr);
                        for (int j = 0; j < arr.length; j++) {
                            System.out.println(arr[j]);
                        }
                    } else if (outputFormat.equals("v")) {
                        Arrays.sort(arr);
                        for (int k = 0; k < arr.length; k++) {
                            if (k != arr.length - 1)
                                System.out.print(arr[k] + ", ");
                            else
                                System.out.print(arr[k]);
                        }
                    } else {
                        System.out.println("Please enter v or h.");
                    }
                    Scanner terminate = new Scanner(System.in);
                    System.out.println("\nType x to exit or press any key to continue");
                    String endProcess = terminate.nextLine();
                    if (endProcess.equals("x"))
                        break;
                    else
                        continue;
                } else if (outputOrder.equals("d")) {
                    Scanner output = new Scanner(System.in);
                    System.out.println("How do you want to show sorted numbers horizontally(h)/ vertically(v)?");
                    String outputFormat = output.nextLine();

                    if (outputFormat.equals("h")) {
                        Arrays.sort(arr);
                        int q = arr.length - 1;
                        for (int j = q; j >= 0; j--) {
                            System.out.println(arr[j]);
                        }
                    } else if (outputFormat.equals("v")) {
                        Arrays.sort(arr);
                        for (int k = arr.length - 1; k >= 0; k--) {
                            if (k != 0)
                                System.out.print(arr[k] + ", ");
                            else
                                System.out.print(arr[k]);
                        }
                    } else {
                        System.out.println("Please enter v or h.");
                    }
                    Scanner terminate = new Scanner(System.in);
                    System.out.println("\nType x to exit or press any key to continue");
                    String endProcess = terminate.nextLine();
                    if (endProcess.equals("x"))
                        break;
                    else
                        continue;
                } else
                    System.out.println("Type 'a' or 'd'.");
            }
            else
                System.out.println("Your input dosn't seperated by spaces.Follow this pattern (2 6 34)");
        }
    }
}
