package Lessons.Geekbrains.Algorithms;

public class Queue implements IQueue {

    protected int[] data; //массив для хранения стека
    protected int MaxSize;//макс. размер стека
    protected int last; //индекс верхнего эл. стека
    protected int first; //индекс верхнего эл. стека

    public Queue(int _MaxSize){
        this.MaxSize = _MaxSize;
        data = new int[MaxSize];
        this.first = -1;
        this.last = 0;
    }

    @Override
    public boolean IsFull() {
        return last == MaxSize - 1;
    }

    @Override
    public boolean IsEmty() {
        return last == MaxSize -1;
    }

    @Override
    public void AddElement(int _el) {
        if (last < MaxSize){
            data[++last] = _el;
        }
    }

    @Override
    public void RemoveElement() {
        for (int i = last; i > first; i--){
            if (i ==0 ){
                break;
            }
           data[i-1] = data[i];
        }
        last --;
    }

    @Override
    public int GetCurrent() throws Exception {
        return data[first];
    }
}
