package Lessons.Geekbrains.Algorithms;

public interface IStack {
    public boolean IsFull();
    public boolean IsEmty();
    public void AddElement(int _el)  throws Exception;
    public void RemoveElement();
    public int GetCurrent() throws Exception;
}
