package Lessons.Geekbrains.Algorithms.Lesson7;

public class Lesson7 {


    public static void RunLesson7(){
        Graph graph = new Graph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('F');
        graph.addVertex('G');
        graph.addVertex('H');
        graph.addVertex('I');
        graph.addVertex('J');

        graph.addEdge(0, 1); //AB
        graph.addEdge(1, 4); //BE
        graph.addEdge(4, 7); //EH

        graph.addEdge(0, 2); //АC
        graph.addEdge(2, 5); //СF
        graph.addEdge(5, 8); //FI
        graph.addEdge(8, 9); //IJ

        graph.addEdge(0, 3); //АD
        graph.addEdge(3, 6); //DG
        graph.addEdge(6, 9); //GJ

        graph.ShortPath_bfs('J');
        //graph.bfs();
    }
}
