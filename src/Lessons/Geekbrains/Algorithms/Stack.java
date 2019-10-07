package Lessons.Geekbrains.Algorithms;

public class Stack implements  IStack{

    int[] data; //массив для хранения стека
    private int MaxSize;//макс. размер стека
    private int top; //индекс верхнего эл. стека

    public Stack(int _Size){
       this.MaxSize = _Size;
       data = new int[MaxSize];
       this.top = -1;
    }

    @Override
    public boolean IsFull() {
        return top == MaxSize-1;
    }

    @Override
    public boolean IsEmty() {
        return top == -1;
    }

    @Override
    public void AddElement(int _el) {
        if (top < MaxSize){
            top++;
        }
        else {
            top=-1;
        }
        data[++top] = _el;
    }

    @Override
    public void RemoveElement() {
        top--;
    }

    @Override
    public int GetCurrent() throws Exception {
        if (top>=0){
            return data[top];
        }
        else {
            throw new Exception("Обращение к пустому стеку");
        }
    }

}
