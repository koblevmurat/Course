package Lessons.Geekbrains.Algorithms.Lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson8 {

    public static void RunMyGashMapTest(){
        MyHashMap MyHash = new MyHashMap(1000);

        MyHash.AddValue(1200, 'A');
        MyHash.AddValue(1300, 'B');
        MyHash.AddValue(1500, 'C');

        System.out.println(MyHash.GetVal(1500));
        System.out.println(MyHash.GetVal(1300));
        System.out.println(MyHash.GetVal(1200));
    }

    public static void TestLesson8 () throws IOException{
        Item aDataItem;
        int aKey, size, n, keysPerCell;
        // Ввод размеров
        System.out.print("Введите размер хеш-таблицы: ");
        size = getInt();
        System.out.print("Введите начальное количество значений: ");
        n = getInt();
        keysPerCell = 10;
        // Создание таблицы
        HashTable theHashTable = new HashTable(size);
        for(int j=0; j<n; j++){
            aKey = (int)(java.lang.Math.random() * keysPerCell * size);
            aDataItem = new Item(aKey);
            theHashTable.insert(aDataItem);
        }
        while(true){
            System.out.print("Введите первую букву операции");
            System.out.print(" s-показать, i-вставить, d-удалить, or f-найти: ");
            char choice = getChar();
            switch(choice){
                case 's':
                    theHashTable.display();
                    break;
                case 'i':
                    System.out.print("Введите ключевое значение для добавления: ");
                    aKey = getInt();
                    aDataItem = new Item(aKey);
                    theHashTable.insert(aDataItem);
                    break;
                case 'd':
                    System.out.print("Введите ключевое значения для удаления: ");
                    aKey = getInt();
                    theHashTable.delete(aKey);
                    break;
                case 'f':
                    System.out.print("Введите значение для поиска: ");
                    aKey = getInt();
                    aDataItem = theHashTable.find(aKey);
                    if(aDataItem != null){
                        System.out.println("Найдено " + aKey);
                    }else
                        System.out.println("Не удалось найти " + aKey);
                    break;
                default:
                    System.out.print("Не правильный ввод\n");
            }
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    public static char getChar() throws IOException{
        String s = getString();
        return s.charAt(0);
    }
    public static int getInt() throws IOException{
        String s = getString();
        return Integer.parseInt(s);
    }

}
