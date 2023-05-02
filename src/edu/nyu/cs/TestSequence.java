package edu.nyu.cs;

import java.util.ArrayList;

public class TestSequence{

    public static void main(String[] args) {
        
        Sentence sentence1 = new Sentence("this is the first new sentence");
        System.out.println("This is the first " + sentence1.getFirst());
        System.out.println("This is the last " + sentence1.getLast());
        System.out.println("This is the sequence " + sentence1.getSequence());

        String wrd = "wrd";
        
        Word word1 = new Word(wrd, 0);
        System.out.println("This is the first " + word1.getFirst());
        System.out.println("This is the last " + word1.getLast());
        System.out.println("This is the sequence " + word1.getSequence());

    }
}