public class Main {
    public static void main(String[] args) {
        HashTable<String, Product> onlineStore = new HashTable<>();
        onlineStore.put("pen0", new Product("pen", "drawing stick",
                10, 150));
        onlineStore.put("mouse1", new Product("mouse",
                "pointing device for cursor control", 1000, 230));
        onlineStore.put("rubik2", new Product("rubik's cube",
                "puzzle cube", 450, 34));
        System.out.println(onlineStore.get("pen0").getDescription());
        onlineStore.remove("pen0");
        System.out.println(onlineStore.get("pen0"));
        System.out.println(onlineStore.get("mouse1").getDescription());
    }
}