package Lessons.Geekbrains.Algorithms.Lesson6;

public class Node {

    Person person;
    public Node leftChild;
    public  Node rightChild;

    void display() {
        System.out.println(String.format("Name %s age %d", person.name, person.age));
    }
}

