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
        this.last = -1;
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
        if (last < MaxSize -1){
            data[++last] = _el;
            if (first<0){
                first=0;
            }
        }
    }

    @Override
    public void RemoveElement() {
        if (last > first) {
            for (int i = first; i < last; i++) {
                data[i] = data[i + 1];
            }
            last--;
        } else {
            first = -1;
            last = -1;
        }
    }

    @Override
    public int GetCurrent() throws Exception {
        if (first<0){
            throw new Exception("Стек не создан");
        }
          return data[first];
    }
}
