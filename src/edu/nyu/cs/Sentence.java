package edu.nyu.cs;

import java.util.ArrayList;

public class Sentence implements SequentiallyOrdered {



    private ArrayList<OrderedThing> words;
    
    public Sentence(String newSentence){
        String[] newWords = newSentence.split("[^\\w']+");

       for(int i = 0; i < newWords.length; i++){
        int position = i;
        Word wrd = new Word(newWords[i], position);
        words.add(wrd);
       }
    }


    public OrderedThing getFirst(){
        return this.words.get(0);
    }
    
    public OrderedThing getLast(){
        return this.words.get(-1);
    }

    public ArrayList<OrderedThing> getSequence(){
        return this.words;
    } 

}
