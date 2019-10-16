package Lessons.Geekbrains.Algorithms.Lesson4;

import javax.print.attribute.standard.MediaSize;

public class MyLinkedList {

    LLElement Fist;
    LLElement Current;

    public MyLinkedList(){
        this.Fist = null;
        this.Current = null;
    }

    public boolean IsEmpty(){
        return this.Fist == null;
    }

    public void Insert(int _Value){
        if (this.Fist == null) {
            Current = new LLElement(_Value);
            Fist = Current;
        }
        else
        {
            LLElement newEl  = new LLElement(_Value);
            Current.setNext(newEl);
            Current = newEl;
        }
    }

    public LLElement GetLast(){
        return this.Current;
    }

    public LLElement Delete(){
        LLElement tmp = Fist;
        if (!IsEmpty()){
            this.Fist = this.Fist.getNext();
        }
        return tmp;
    }

    public void Display(){
        if (!IsEmpty()){
            LLElement disp = this.Fist;
            while (disp != null){
                System.out.println(disp.getValue());
                disp = disp.getNext();
            }
        }
    }

    public LLElement Find(int _Value) {

        if (IsEmpty())
            return null;

        LLElement fnd = this.Fist;
        do {
            if (fnd.getValue() == _Value)
                return fnd;
            else {
                fnd = fnd.getNext();
            }
        } while (fnd!=null);

        return null;
    }

    public LLElement Delete(int _Value) {

        if (IsEmpty())
            return null;

        LLElement fnd = this.Fist;
        LLElement prev = this.Fist;

        do {
            if (fnd.getValue() == _Value) {
                if (fnd.getNext()!=null)
                    prev.setNext(fnd.getNext());

                return fnd;
            }
            else {
                prev = fnd;
                fnd = fnd.getNext();
            }
        } while (fnd!=null);

        return null;
    }
}
