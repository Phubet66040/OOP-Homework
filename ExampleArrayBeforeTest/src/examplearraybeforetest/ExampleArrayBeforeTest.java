/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examplearraybeforetest;

import java.util.ArrayList;

/**
 *
 * @author ASUS_Vivobook
 */
public class ExampleArrayBeforeTest {

    public static void main(String[] args) {
        int[][] i = new int[3][3];
        for (int o = 0; o < i.length; o++) {
            for (int j = 0; j < i.length; j++) {
                i[o][j] = o + j;

            }
        }
        for (int o = 0; o < i.length; o++) {
            for (int j = 0; j < i.length; j++) {
                System.out.print(" "+ i[o][j]);

            }
            System.out.println(" ");
        }

    }

}
