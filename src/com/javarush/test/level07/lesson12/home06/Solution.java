package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и
заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код
        //ded 1
        Human grdad1 = new Human();
        grdad1.name = "Vasya";
        grdad1.sex = true;
        grdad1.age = 80;
        System.out.println(grdad1.toString());

        //ded 2
        Human grdad2 = new Human();
        grdad2.name = "Igor";
        grdad2.sex = true;
        grdad2.age = 78;
        System.out.println(grdad2.toString());

        //bab 1
        Human grmom1 = new Human();
        grmom1.name = "Mariya";
        grmom1.sex = false;
        grmom1.age = 83;
        System.out.println(grmom1.toString());

        //bab 2
        Human grmom2 = new Human();
        grmom2.name = "Vera";
        grmom2.sex = false;
        grmom2.age = 81;
        System.out.println(grmom2.toString());

        //dad
        Human dad = new Human();
        dad.name = "Alexandr";
        dad.sex = true;
        dad.age = 60;
        dad.father = grdad1;
        dad.mother = grmom1;
        System.out.println(dad.toString());

        //mom
        Human mom = new Human();
        mom.name = "Nata";
        mom.sex = false;
        mom.age = 54;
        mom.father = grdad2;
        mom.mother = grmom2;
        System.out.println(mom.toString());

        //son1
        Human son1 = new Human();
        son1.name = "Zhenya";
        son1.sex = true;
        son1.age = 33;
        son1.father = dad;
        son1.mother = mom;
        System.out.println(son1.toString());

        Human son2 = new Human();
        son2.name = "Andr";
        son2.sex = true;
        son2.age = 30;
        son2.father = dad;
        son2.mother = mom;
        System.out.println(son2.toString());

        Human dot1 = new Human();
        dot1.name = "Polina";
        dot1.sex = true;
        dot1.age = 25;
        dot1.father = dad;
        dot1.mother = mom;
        System.out.println(dot1.toString());

    }

    public static class Human
    {
        //Написать тут ваш код
        String name;
        Boolean sex;
        int age;
        Human father;
        Human mother;

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
