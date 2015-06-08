package annalinewyork.c4q.nyc.funfacts;

import java.util.Random;

/**
 * Created by c4q-nali on 6/8/15.
 */
public class FactBook {
    //member variable, must declare public or private.
    public String[] mFacts ={
            "Norman will transit to daycare tomorrow.",
            "I wish he will like there, or at least not dislike very much.",
            "We will have a long way to go there.",
            "I will study Android very hard working way.",
            "Practise makes perfect.",
            "If one button is not enough, let's make 20.",
            "Let's buy some similac at Target.",
            "I am gonna join office hour today? am I?",
            "Norman has very good habit for sleeping",
            "We have to face the fact.",};

    public String getFact(){
        //the button was clicked, so update the fact label with a new fact.
        String fact = "";
        //randomly select a fact.
        Random randomGenerator = new Random();//construct a new random number generator.
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];
        return fact;
    }
}
