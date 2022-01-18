package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String state = "introductory exercises";
        Integer Failure = 0;
        Integer win = 0;
        System.out.println(("> Current State: " + state));


        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter Status:");
            String userInput = in.nextLine();
            if (state.equals("introductory exercises")) {
                if (userInput.equals("Complete")) {
                    state = "Project";
                    System.out.println(("> Current State: " + state));
                }
                else {
                    System.out.println(("> Error: Invalid Transition"));
                    System.out.println(("> Current State: " + state));
                }
            }
            else if (state.equals("Project")) {
                if (userInput.equals("Complete")) {
                    state = "Benchmark";
                    System.out.println(("> Current State: " + state));
                }
                else {
                    System.out.println(("> Error: Invalid Transition"));
                    System.out.println(("> Current State: " + state));
                }
            }
            else if (state.equals("Benchmark")) {
                if (userInput.equals("Pass")) {
                    state = "Module Complete";
                    System.out.println(("> Current State: " + state));
                    break;
                }
                else if (userInput.equals("Fail")) {
                    Failure++;
                    if (Failure < 3) {
                        state = "Project";
                        System.out.println(("> Current State: " + state));
                    }
                    else {
                        state = "Fail";
                        System.out.println(("> Current State: " + state));
                        break;

                    }
                }
                else {
                    System.out.println(("> Error: Invalid Transition"));
                    System.out.println(("> Current State: " + state));
                }
            }
        }

    }
}
