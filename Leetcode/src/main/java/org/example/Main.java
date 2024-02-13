package org.example;

import java.util.Collections;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.OptionalInt;

public class Main {
    public int reverse(int x) {
        if (x == 0) return 0;
        try {
            String str = String.valueOf(x);
            OptionalInt indexOfDash = OptionalInt.of(str.chars()
                    .mapToObj(c -> (char) c)
                    .filter(c -> c == '-')
                    .mapToInt(c -> str.indexOf(c)).findFirst().orElse(-1));
            String reverse = str.substring(indexOfDash.getAsInt() + 1)
                    .chars()
                    .mapToObj(c -> (char) c).reduce("", (s, c) -> c + s, String::concat);
            String result = (reverse.charAt(0) == '0') ?
                    (indexOfDash.getAsInt() == 0 ? "-" + reverse.substring(1) :
                            reverse.substring(1)) : (indexOfDash.getAsInt() == 0 ? "-" + reverse : reverse);

            return Integer.parseInt(result);
        } catch (Exception e) {
            return 0;
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.reverse(125));
    }
}