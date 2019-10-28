package Lessons.Geekbrains.Algorithms.Lesson7;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {

    private final int MAX_VERTS = 32;
    private Vertex[] vertexList;
    private int[][] adjMat;
    private int size;
    private Stack stack;

    public Graph(){
        stack = new Stack(MAX_VERTS);
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        size = 0;
        for (int i = 0; i < MAX_VERTS; i++) {
            for (int j = 0; j < MAX_VERTS; j++) {
                adjMat[i][j] = 0;
            }

        }

    }

    private int getAdjUnvisitedVertex(int ver){
        for (int i = 0; i < size; i++) {
            if(adjMat[ver][i] == 1 && vertexList[i].wasVisited == false){
                return i;
            }
        }

        return -1;
    }

    public void bfs(){
        LinkedList<Integer> queue = new LinkedList<>();
        vertexList[0].wasVisited = true;
        //displayVertex(0);
        queue.addLast(0); // Вставка в конец очереди
        int v2;
        while(!queue.isEmpty()){
            int v1 = queue.remove();
            displayVertex(v1);
            while((v2=getAdjUnvisitedVertex(v1)) != -1){
                vertexList[v2].wasVisited = true; // Пометка
                displayLinkedVertex(v1, v2);System.out.print(", ");// Вывод
                queue.addLast(v2);
            }
            System.out.println();
        }
        for(int i=0; i<size; i++) // Сброс флагов
            vertexList[i].wasVisited = false;
    }

    public void ShortPath_bfs(char label){
        int v0 = 0;
        if (vertexList[v0].label == label){

            displayVertex(v0);
            return;
        }
        LinkedList<Integer> queue = new LinkedList<>();
        LinkedList<Integer> MyPath = new LinkedList<>();
        MyPath.addLast(v0);
        vertexList[0].wasVisited = true;
        //displayVertex(0);
        queue.addLast(0); // Вставка в конец очереди
        int v2;
        while(!queue.isEmpty()){
               int v1 = queue.remove();
            displayVertex(v1);
            while((v2=getAdjUnvisitedVertex(v1)) != -1){
                vertexList[v2].wasVisited = true; // Пометка
                if (label == vertexList[v2].label) {
                    System.out.print("Точка пути найдена: ");
                    displayLinkedVertex(v1, v2);System.out.print(" ");// Вывод
                    return;
                }

                displayLinkedVertex(v1, v2);System.out.print(", ");// Вывод
                queue.addLast(v2);
            }
            System.out.println();
        }
        for(int i=0; i<size; i++) // Сброс флагов
            vertexList[i].wasVisited = false;
    }

    public void dfs(){
        vertexList[0].wasVisited = true;
        displayVertex(0);
        stack.push(0);
        while (!stack.isEmpty()) {
            int v = getAdjUnvisitedVertex(stack.peek());
            if (v == -1){
                stack.pop();
            } else {
                vertexList[v].wasVisited = true;
                displayVertex(v);
                stack.push(v);
            }
        }

        for (int i = 0; i < size; i++) {
            vertexList[i].wasVisited = false;
        }
    }

    public void addVertex(char label){
        vertexList[size++] = new Vertex(label);
    }

    public void addEdge(int start, int end){
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public void displayVertex(int vertex){
        System.out.println(vertexList[vertex].label);
    }

    public void displayLinkedVertex(int vertex1, int vertex2){
        System.out.print(vertexList[vertex1].label +" -> "+ vertexList[vertex2].label);
    }

}
