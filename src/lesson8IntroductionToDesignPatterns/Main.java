package lesson8IntroductionToDesignPatterns;

public class Main {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        instance1.setName("Almaty");
        instance2.setName("Astana");

        System.out.println(instance1.getName());
        System.out.println(instance2.getName());
    }
}
