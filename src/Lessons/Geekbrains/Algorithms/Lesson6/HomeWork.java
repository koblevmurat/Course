package Lessons.Geekbrains.Algorithms.Lesson6;

import java.util.Random;

public class HomeWork {


    private static int MaxLenght(Tree tree, Node Current){
        int lenght = 1;

        if (Current == null)
            return 0;

        if (Current.leftChild!=null)
            lenght+=MaxLenght(tree, Current.leftChild);

        if(Current.rightChild!=null)
            lenght+=MaxLenght(tree, Current.rightChild);


        return lenght;
    }

    private static boolean IsBalanced(Tree tree){
        if (tree.root == null){
            return true;
        }
        else {
            return MaxLenght(tree, tree.root.leftChild) == MaxLenght(tree, tree.root.rightChild);
        }
    }

    public static void RunTest(){
        Random rnd = new Random();
        Tree[] trees = new Tree[20];
        for (int i = 0; i < trees.length; i ++){
            trees[i] = new Tree();
            for (int j = 0; j<6; j++){
                int NewID = rnd.nextInt(200) - 100;
                Person person = new Person("name"+NewID, NewID, i+j);
                trees[i].insert(person);
            }
        }

        int Balanced = 0;

        for (int i = 0; i < trees.length; i ++){
           if (IsBalanced (trees[i]))
               Balanced ++;
        }

        System.out.println(String.format("Из 20 деревьев, сбалансированных, %d", Balanced));
    }
}
