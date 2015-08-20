package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sn;
        int s = 0;
        int n = 0;
        Boolean isExit = false;
        while (!isExit) {
            sn = reader.readLine();
            if (isExit = sn.equals("сумма")) {
                break;
            }
            n = Integer.parseInt(sn);
            s = s + n;
        }
        System.out.println(s);
    }
}
