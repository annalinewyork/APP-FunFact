package annalinewyork.c4q.nyc.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by c4q-nali on 6/8/15.
 */
public class ColorWheel {
    public String[] mColors ={
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7", };

    public int getColor(){
        String color = "";
        //randomly select a fact.
        Random randomGenerator = new Random();//construct a new random number generator.
        int randomNumber = randomGenerator.nextInt(mColors.length);

        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color); //parse: analyze.
        return colorAsInt;
    }
}
