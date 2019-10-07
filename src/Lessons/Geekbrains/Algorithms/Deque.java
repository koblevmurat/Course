package Lessons.Geekbrains.Algorithms;

public class Deque extends Queue {

    public Deque(int _MaxSize) {
        super(_MaxSize);
    }

    public void AddFirst(int _el){
        if (last<MaxSize-1){
            last++;
            for (int i = first; i < last; i++) {
                data[i+1] = data[i];
            }
            data[first] = _el;
        }
    }

    public void AddLast(int _el){
        super.AddElement(_el);
    }


}
