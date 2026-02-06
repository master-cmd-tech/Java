package lesson7LanguageFeatures;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("Almaty");
        list.add("Astana");
        list.add("Shymkent");
        list.add("London");

        System.out.println(list.get(1));

        String removed = list.remove(1);

        System.out.println("\"" + removed + "\" was removed");

        System.out.println(list.get(1));

        System.out.println("===============");

        for (String s : list ) {
            System.out.println(s);
        }
        System.out.println("===============");
        list.forEach(s -> System.out.println(s));
    }

}
