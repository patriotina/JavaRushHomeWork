package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static void main(String[] args)
    {
        //main
        HashMap<String, Date> bmap = createMap();
        removeAllSummerPeople(bmap);
        System.out.println(bmap);

    }

    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));
        map.put("Pupkin", new Date("MAY 10 1987"));
        map.put("Ivanov", new Date("AUGUST 10 1985"));
        map.put("Petrov", new Date("SEPTEMBER 10 1982"));
        map.put("Sidorov", new Date("JUNE 10 1976"));
        map.put("Pashkov", new Date("APRIL 10 1989"));
        map.put("Koshkin", new Date("JULY 10 1991"));
        map.put("Myshkin", new Date("JANUARY 10 1981"));
        map.put("Vasechkin", new Date("JULY 10 1985"));
        map.put("Muhin", new Date("MARCH 10 1983"));

        return map;
        //Напишите тут ваш код

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //Напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            int smonth = pair.getValue().getMonth();
            if (smonth > 4 && smonth < 8) {
                iterator.remove();
            }
        }

    }
}
