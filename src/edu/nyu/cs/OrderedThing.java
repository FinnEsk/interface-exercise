package edu.nyu.cs;

import java.util.ArrayList;

public abstract class OrderedThing {
    
    public abstract Character getFirst(Word word);
    public abstract Character getLast(Word word);
    public abstract ArrayList<OrderedThing> getSequence(Word word);
    
}
