package Lessons.Geekbrains.Algorithms.Lesson8;

import java.util.LinkedList;
import java.util.List;

//изменены элементы хеш таблицы для реализации метода цепочек
public class HashTable {
        private List<Item>[] hashArr;
        private int arrSize;
        private Item nonItem;

        public HashTable(int size){
            this.arrSize = size;
            hashArr = new List[arrSize];//new Item[arrSize];
            nonItem = new Item(-1);
        }

        public void display(){
            for(int i=0;i<arrSize;i++){
                if(hashArr[i] !=null){
                    System.out.println();
                    System.out.println("Значения с хеш-ключом "+i );
                    for (Item itm :
                            hashArr[i]) {
                        if (itm != null && itm.getKey() != -1) {  //&& hashArr[hashVal].getKey() != -1)
                            System.out.print(itm.getKey()+", ");
                        }
                    }

                } else {
                    System.out.println("***");
                }
            }
            System.out.println();
        }

        public int hashFunc(int key){
            return key % arrSize;
        }
        public int hashFuncDouble(int key){
            return 5 - key % 5;
        }

        public void insert(Item item){
            int key = item.getKey();
            int hashVal = hashFunc(key);
            int stepSize = hashFuncDouble(key);
            if (hashArr[hashVal]!=null){
                for (Item itm :
                        hashArr[hashVal]) {
                    if (item.getKey()==itm.getKey()) //такое значение уже записано
                        return;

                    if (itm != null && itm.getKey() == -1) {  //если есть инициализированный элемент помеченный на удаление, то запишем в него
                        itm = item;
                        return;
                    }
                }
            }
            else
                hashArr[hashVal] = new LinkedList<Item>();

            //hashVal += stepSize;
            //hashVal %= arrSize;
/*
            if (hashArr[hashVal]==null)
                hashArr[hashVal] = new LinkedList<Item>();*/

            hashArr[hashVal].add(item);
        }

        public Item delete(int key){
            int hashVal = hashFunc(key);
            int stepSize = hashFuncDouble(key);
            while (hashArr[hashVal] != null) {
                for (Item itm :
                        hashArr[hashVal]) {
                    if (itm != null && itm.getKey() == key) {  //&& hashArr[hashVal].getKey() != -1)
                        Item temp = itm;
                        itm = nonItem;
                        return temp;
                    }
                }
            /*    if (hashArr[hashVal].getKey() == key){
                    Item temp = hashArr[hashVal];
                    hashArr[hashVal] = nonItem;
                    return temp;
                }*/
                hashVal+=stepSize;
                hashVal%=arrSize;
            }
            return null;
        }

        public Item find(int key){
            int hashVal = hashFunc(key);
            int stepSize = hashFuncDouble(key);
            while (hashArr[hashVal] != null) {
                for (Item itm :
                        hashArr[hashVal]) {
                    if (itm != null && itm.getKey() == key) {  //&& hashArr[hashVal].getKey() != -1)
                        return itm;
                    }
                }
               /* if (hashArr[hashVal].getKey() == key){
                    return hashArr[hashVal];
                }*/
                hashVal+=stepSize;
                hashVal%=arrSize;
            }
            return null;
        }

        private int getPrime(int min){
            for(int i = min+1; true; i++)
                if( isPrime(i))
                    return i;
        }
        private boolean isPrime(int n){
            for(int j=2; (j*j <= n); j++)
                if( n % j == 0)
                    return false;
            return true;
        }

    }

