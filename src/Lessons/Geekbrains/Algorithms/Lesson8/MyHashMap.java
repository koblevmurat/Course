package Lessons.Geekbrains.Algorithms.Lesson8;

public class MyHashMap {

    char [] Map;
    int Size;

    public MyHashMap(int _Size){
        this.Size = _Size;
        this.Map = new char[Size];
    }

    public void AddValue(int _key, char _val){
        int ix = _key%Size;
        Map[ix] = _val;
    }

    public char GetVal(int _key){
        int ix = _key%Size;
        return Map[ix];
    }

}
