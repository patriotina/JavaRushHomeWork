package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию.
Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: маму, папу, сына, дочь, бабушку(мамина мама) и дедушку(папин папа).
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grFaName = reader.readLine();
        Cat catGrFa = new Cat(grFaName);

        String grMaName = reader.readLine();
        Cat catGrMa = new Cat(grMaName);

        String dadName = reader.readLine();
        Cat catDad = new Cat(dadName, catGrFa, null);

        String momName = reader.readLine();
        Cat catMom = new Cat(momName, null, catGrMa);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catDad, catMom);

        String doName = reader.readLine();
        Cat catDo = new Cat(doName, catDad, catMom);

        System.out.println(catGrFa);
        System.out.println(catGrMa);
        System.out.println(catDad);
        System.out.println(catMom);
        System.out.println(catSon);
        System.out.println(catDo);


     /*   String motherName = reader.readLine();
        Cat catMother = new Cat(motherName);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother);

        System.out.println(catMother);
        System.out.println(catDaughter);
     */



    }

    public static class Cat
    {
        private String name;
        private Cat mparent = null;
        private Cat pparent = null;

        Cat(String name)
        {
            this.name = name;
        }

        Cat(String name, Cat mparent)
        {
            this.name = name;
            this.mparent = mparent;
        }

        Cat (String name, Cat pparent, Cat mparent) {
            this.name = name;
            this.mparent = mparent;
            this.pparent = pparent;
        }

        @Override
        public String toString()
        {
            if (mparent == null && pparent == null)
                return "Cat name is " + name + ", no mother" + ", no father";
            else if (mparent == null) {
                return "Cat name is " + name + ", no mother, father is " + pparent.name;
            } else if (pparent == null) {
                return "Cat name is " + name + ", mother is " + mparent.name + ", no father";
            } else {
                return "Cat name is " + name + ", mother is " + mparent.name + ", father is " + pparent.name;
            }
        }
    }

}
