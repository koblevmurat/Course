package Lessons.Geekbrains.Algorithms;

public class Deque extends Queue {

    public Deque(int _MaxSize) {
        super(_MaxSize);
    }

    public void AddFirst(int _el){
        if (last<MaxSize-1){

            for (int i = last; i >= first; i --) {
                if (first<0)
                    break;

                data[i+1] = data[i];
            }

            if (first<0) //если добавили самый 1ый эл. в дек, то индекс = 0
                first=0;

            data[first] = _el;
            last++;
        }
    }

    public void AddLast(int _el){
        super.AddElement(_el);
    }

    public int GetFirst() throws Exception{
        return super.GetCurrent();
    }

    public int GetLast() throws Exception{
        if (last>=0){
            return data[last];
        }
        else {
            throw new Exception("Дек пустой");
        }
    }

    public void RemoveLast(){
       if (last>=0)
           last--;

       if (last<0)
           first = -1;

    }

    public void RemoveFirst(){
        super.RemoveElement();
    }
}
