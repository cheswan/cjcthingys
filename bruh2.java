
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
import java.util.ArrayList;
import java.util.List;

public class bruh2 {
   public static void testFloatInRange() {
    List<Float> list = new ArrayList<>();
    for (int i = 0; i < 2000; i++) {
        //float rand = nextFloatBetween(2.0f, 4.0f);
        //float rand = nextFloatBetween2(2.0f, 4.0f);
        //float rand = nextFloatBetween3(2.0f, 4.0f);
        float rand = nextFloatBetween4(2.0f, 4.0f);
        list.add(rand);
    }
    list.sort(Float::compareTo);

    // print 2000 sorted floats in asc order
    list.forEach(System.out::println);
}

public static void main(String[] args) {
    testFloatInRange();
}

