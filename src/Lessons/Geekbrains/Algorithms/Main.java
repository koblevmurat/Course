package Lessons.Geekbrains.Algorithms;

public class Main {


    private static void testQueue() throws Exception {

        Queue queue = new Queue(5);
        queue.AddElement(1);
        queue.AddElement(2);
        queue.AddElement(3);
        queue.AddElement(4);
        queue.AddElement(5);
        queue.RemoveElement();
        queue.RemoveElement();
        System.out.println( queue.GetCurrent());
        queue.RemoveElement();
        queue.RemoveElement();

        queue.RemoveElement();
        queue.RemoveElement();
        queue.AddElement(6);

        System.out.println( queue.GetCurrent());


    }

    private static void testStack() throws Exception {
        Stack stack = new Stack(5);
        stack.AddElement(1);
        stack.AddElement(2);
        stack.AddElement(3);
        stack.AddElement(4);
        stack.AddElement(5);
        stack.RemoveElement();
        System.out.println(stack.GetCurrent());
        stack.RemoveElement();
        stack.RemoveElement();
        stack.RemoveElement();
        stack.RemoveElement();
        stack.AddElement(6);
        stack.AddElement(7);
        System.out.println(stack.GetCurrent());

    }

    private static void testDeque()throws Exception{
        Deque deque = new Deque(5);
        deque.AddFirst(2);
        deque.AddFirst(1);
        deque.AddLast(3);
        deque.AddLast(4);

        System.out.println(deque.GetFirst());
        System.out.println(deque.GetLast());

        deque.RemoveFirst();
        deque.RemoveLast();

        System.out.println(deque.GetFirst());
        System.out.println(deque.GetLast());

    }
    public static void main(String[] args) {

        try {
            System.out.println("Тестирование стека");
            testStack();
            System.out.println("Тестирование очереди");
            testQueue();
            System.out.println("Тестирование дека");
            testDeque();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
