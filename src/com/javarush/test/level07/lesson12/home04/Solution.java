package com.javarush.test.level07.lesson12.home04;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Вводить с клавиатуры строки, пока пользователь не введёт строку 'end'
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введёт строку "end".  "end" не учитывать.
Вывести строки на экран, каждую с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Напишите тут ваш код
        ArrayList<String> slist = new ArrayList<String>();
        Boolean isEnd = true;

        while (isEnd) {
            slist.add(reader.readLine());
            if (slist.get(slist.size()-1).equals("end")) {
                slist.remove(slist.size()-1);
                isEnd = false;
            }
        }
        for (int i=0; i < slist.size(); i++) {
            System.out.println(slist.get(i));
        }
    }
}
