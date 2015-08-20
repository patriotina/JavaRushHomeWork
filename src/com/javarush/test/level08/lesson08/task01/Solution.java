package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static void main(String[] args)
    {
        //main
    }

    public static HashSet<String> createSet()
    {
        //Напишите тут ваш код
        Set<String> set = new HashSet<String>();
        //for (int i=0; i<20; i++) {
        set.add("Лапа");
        set.add("Лампа");
        set.add("Лама");
        set.add("Лом");
        set.add("Линия");
        set.add("Логин");
        set.add("Лол");
        set.add("Лулз");
        set.add("Луза");
        set.add("Лоза");
        set.add("Леприкон");
        set.add("Лабиринт");
        set.add("Левый");
        set.add("Лифт");
        set.add("Лестница");
        set.add("Лактоза");
        set.add("Лошадь");
        set.add("Ленин");
        set.add("Луч");
        set.add("Лаборатория");
        //}
        return (HashSet)set;

    }
}
