package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //Напишите тут ваш код
        //HashMap<String, String>
       // ArrayList duplist = ArrayList();
        //duplist = Collections.frequency(map, )


    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
