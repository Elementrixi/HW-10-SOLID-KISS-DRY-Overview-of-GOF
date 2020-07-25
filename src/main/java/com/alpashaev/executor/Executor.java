package main.java.com.alpashaev.executor;

import main.java.com.alpashaev.builder.Parcel;
import main.java.com.alpashaev.singleton.Singleton;

public class Executor {
    public static void solvingHomework() {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton.equals(singleton1));
        Parcel.Builder parcel = new Parcel.Builder()
                .sender("Vasya")
                .recipient("Katya")
                .identity(12425251)
                .weight(12.46);
        System.out.println("\n" + parcel);
    }
}
