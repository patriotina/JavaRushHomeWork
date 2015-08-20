package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static void main(String[] args)
    {
        //main

        System.out.println(getCountTheSameFirstName(createMap(), "Иван"));
        System.out.println(getCountTheSameLastName(createMap(), "Пупкин"));

    }

    public static HashMap<String, String> createMap()
    {
        //Напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Петров", "Иван");
        map.put("Петренко", "Петр");
        map.put("Петрович", "Николай");
        map.put("Сидоров", "Иван");
        map.put("Иванов", "Петр");
        map.put("Пупкин", "Иван");
        map.put("Васечкин", "Николай");
        map.put("Мышкин", "Иван");
        map.put("Кошкин", "Александр");
        map.put("Столов", "Иван");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //Напишите тут ваш код
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        String chname;
        int count = 0;
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            chname = pair.getValue();
            if (chname.equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        //Напишите тут ваш код
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        String chname;
        int count = 0;
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            chname = pair.getKey();
            if (chname.equals(familiya)) {
                count++;
            }
        }
        return count;

    }
}
