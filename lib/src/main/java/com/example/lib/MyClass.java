package com.example.lib;

import java.util.Arrays;

public class MyClass {
    public static void main(String[] args) {
        String arraynya="[[-0.123455,0.987654]]";
        String[] rowWithoutSplit = arraynya.replace("[","").split("]");
        int width = rowWithoutSplit.length;
        String cells[] = rowWithoutSplit[0].split(",");
        int height = cells.length;
        float[][] output = new float[width][height];

        for (int i=0; i<width; i++) {
            String cells2[] = rowWithoutSplit[i].split(",");
            for(int j=0; j<height; j++) {
                output[i][j] = Float.parseFloat(cells2[j]);
            }
        }


        System.out.println(Arrays.deepToString(output));
    }
}