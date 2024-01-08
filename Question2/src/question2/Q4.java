/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question2;

import static java.lang.System.out;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers = sc.nextInt();
        int[] array = new int[numbers];
        int sum = 0;
        for (int i = 0; i < numbers; i++) {
            array[i] = sc.nextInt();
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }

        System.out.println(sum);
    }
}
