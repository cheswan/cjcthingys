
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Niko
 */
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class bruh2 {

    public static float search(float owo[], float uwu) {

        for (int i = 0; i < owo.length; i++) {
            if (owo[i] == uwu) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        float owo[] = new float[20];
        float uwu;
        System.out.println("Displaying numbers from 5 to 8");
        for (int k = 0; k < owo.length; k++) {
            float rand = nextFloatBetween(5.0f, 8.0f);
            uwu = rand;
            float result = search(owo, uwu);
            while (result != -1) {
                uwu = (float) (Math.random() * 20);
                result = search(owo, uwu);
            }
            owo[k] = uwu;
            System.out.println(owo[k]);
        }
    }

    public static float nextFloatBetween(float min, float max) {
        return (ThreadLocalRandom.current().nextFloat() * (max - min)) + min;
    }
}
