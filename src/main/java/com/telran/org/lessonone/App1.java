//полный путь до нашего класса(файла
package com.telran.org.lessonone;
//UpperCamelCase - правило названия классов
// myApp // myapp _my // !!!! incorrect
// BookStorage // correct

//public - модификатор доступа
//class - определяет что это (class, interface, enum etc)
//MyApp - имя класса, совпадающее с именем файла на диске
//Файл на диске будет называться MyApp.java
public class App1 { // тело класса

    //Точка входа в приложение
    //public- модификатор доступа, доступен всем
    //static - не требует создания объекта
    //void - данный метод ничего не возвращает
    //Параметры пример:
    //to javac.exe App1.java --> App1.class(bite code) --> JVM RUN App.class
    //(App1.class ~~ App1.exe) java App1.class "Hello"
    public static void main(String[] args) { // {Тело метода}
        System.out.println("Hello Java!");
        System.out.println("Hello QA");
        System.out.println("Hello FE");
    }

    // Приложение состоит из классов,
}

