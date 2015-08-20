package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
…
я 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for(int i=0;i<32;i++)
        {
            alphabet.add( (char) ('а'+i));
        }
        alphabet.add(6,'ё');

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0;i<10;i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        //Напишите тут ваш код
        //ArrayList counter = new ArrayList();
//        String s = "";
        int count = 0;
        //Создать одну общую строку
//        for (int i=0; i<list.size(); i++)
//        {
//            //System.out.println(alphabet.get(i));
//            s = s + list.get(i);
//            //System.out.println(s);
//        }

        for (int i = 0; i<alphabet.size(); i++) {
            for (int l=0; l<list.size(); l++)
            {
                for (int j = 0; j < list.get(l).length(); j++)
                {
                    if (alphabet.get(i) == list.get(l).charAt(j))
                    {
                        count++;
                    }
                }
            }
            System.out.println(alphabet.get(i) + " " + count);
            count = 0;
        }
    }

}
