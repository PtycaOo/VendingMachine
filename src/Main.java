public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(111);
        Product product = new Product("Твикс",100);
        Product product2 = new Product("Сникерс",112);


        System.out.println(product.toString());

    }
}