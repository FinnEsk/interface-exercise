package edu.nyu.cs;

import java.util.ArrayList;

import javax.xml.stream.events.Characters;

public class Word extends OrderedThing implements SequentiallyOrdered{

    private ArrayList<Characters> characters;
    private int position;



    public Word(String newChar, int position){
        
        
        for(char c : newChar.toCharArray()){
            this.characters.add(new Character(c));
        }

        this.position = position;
    }

    public OrderedThing getFirst(){
        return this.characters.get(0);
    }

    public OrderedThing getLast(){
        return this.characters.get(-1);
    }

    public ArrayList<OrderedThing> asOrderedThing(ArrayList<Character> characters){
        ArrayList<OrderedThing> ot;
        for(Character c : characters){
            ot.add(c);
        }
    }

    public ArrayList<OrderedThing> getSequence(){

        ArrayList<OrderedThing> ot;
        for()
        //convert to ordered thing from characters by looping through??
        return this.characters;
    }
    
    public int getPosition(Word word){
        return this.characters.indexOf(word);
    }
}
