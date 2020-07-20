package main.java.com.alpashaev.singleton;

public class Singleton {
    public static int value;
    private static Singleton instance;

    private Singleton(int value) {
        this.value = value;
    }

    public static synchronized Singleton getInstance(int value) {
        if (instance == null) {
            instance = new Singleton(22);
        }

        return instance;
    }
}
