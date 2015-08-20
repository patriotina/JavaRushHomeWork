package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов
длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        //Написать тут ваш код
        int[] arr1 = {1,2,3,4,5}; //new int[5];
        int[] arr2 = {1,2}; //new int[2];
        int[] arr3 = {1,2,3,4}; //new int[4];
        int[] arr4 = {1,2,3,4,5,6,7}; //new int[7];
        int[] arr5 = new int[0];
        ArrayList<int[]> listc = new ArrayList<int[]>();
        listc.add(arr1);
        listc.add(arr2);
        listc.add(arr3);
        listc.add(arr4);
        listc.add(arr5);
        return listc;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
