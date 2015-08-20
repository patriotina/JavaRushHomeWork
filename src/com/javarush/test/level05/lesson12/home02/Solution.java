package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        // Создай по два объекта каждого класса тут
        Man John = new Man("John", 30, "Lenina st. 15");
        Man Mike = new Man("Mike", 25, "Pushkina st. 1");

        Woman Jassy = new Woman("Jassy", 27, "Kirova st. 2");
        Woman Nata = new Woman("Nata", 29, "Lenina st.10");

        // Выведи их на экран тут
        System.out.println(John.name+" "+John.age+" "+John.address);
        System.out.println(Mike.name+" "+Mike.age+" "+Mike.address);
        System.out.println(Jassy.name+" "+Jassy.age+" "+Jassy.address);
        System.out.println(Nata.name+" "+Nata.age+" "+Nata.address);
    }

    // Напиши тут свои классы
    public static class Man {
        private String name = null;
        private int age;
        private String address = null;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman {
        private String name = null;
        private int age;
        private String address = null;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
