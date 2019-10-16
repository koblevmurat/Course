package Lessons.Geekbrains.Algorithms.Lesson4;

public class LLElement {


    private int Value;
    private LLElement next;

    public LLElement(int _val){
        this.Value = _val;
    }

    public int getValue() {
        return Value;
    }

    public void setValue(int value) {
        Value = value;
    }

    public LLElement getNext() {
        return next;
    }

    public void setNext(LLElement next) {
        this.next = next;
    }
}
