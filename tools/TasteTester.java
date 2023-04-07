package tools;
//inheritance


public class TasteTester {

    public static void main(String[] args) {
        Cake cake = new Cake();
        cake.setPrice(19.99);
        System.out.println("Cake flavor: " + cake.getFlavor());
        System.out.println("Cake price: " + cake.getPrice());

        Birthday birthday = new Birthday();
        System.out.println("Birthday cake flavor: " + birthday.getFlavor());
        System.out.println("Birthday cake price " + birthday.getPrice());

        Wedding wedding = new Wedding();
        wedding.setFlavor("pina colada");
        wedding.setPrice(399.99);
        System.out.println("Wedding cake flavor: " + wedding.getFlavor());
        System.out.println("Wedding cake price: " + wedding.getPrice());
    }
}
