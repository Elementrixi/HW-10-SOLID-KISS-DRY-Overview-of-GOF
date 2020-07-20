package main.java.com.alpashaev.executor;

import main.java.com.alpashaev.builder.Parcel;
import main.java.com.alpashaev.singleton.Singleton;

public class Executor {
    public static void solvingHomework() {
        Singleton.getInstance(22);
        System.out.println(Singleton.value);
        Parcel.Builder parcel = new Parcel.Builder()
                .sender("Vasya")
                .recipient("Katya")
                .identity(325023501)
                .weight(12.34);
        System.out.println("\n" + parcel);
    }
}
