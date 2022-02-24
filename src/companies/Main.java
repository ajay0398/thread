package companies;

public class Main {
    public static void main(String[] args) {
        company comp = new company();
        Producer p = new Producer(comp);
        Consumer c = new Consumer(comp);
        p.start();
        c.start();
    }
}
