package singletonpattern;

public class Main {

    public static void main(String[] args) {
        MySingletonClass msc1 = MySingletonClass.getInstance();
        MySingletonClass msc2 = MySingletonClass.getInstance();

        // true means both are pointing to same object in memory
        System.out.println(msc1 == msc2);
    }
}
