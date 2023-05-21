package generic;

public class WildcardDemo {
    public static void main(String[] args) {
        Integer[] innums = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<>(innums);
        double v = iob.average();
        System.out.println("iob average is: " + v);
        
        Double[] dnums = {1.1, 1.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<Double>(dnums);
        double w = dob.average();
        System.out.println("dob average is: " + w);
        
        Float[] fnums = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats<Float> fod = new Stats<>(fnums);
        double x = fod.average();
        System.out.println("fob average is: " + x);
        
        //Which array have the same average.

        System.out.println("Averages of iob and dob ");
        if (iob.sameAvg(dob))
            System.out.println("Are the same");
        else
            System.out.println("Differ");

        System.out.println("Averages of iob and fob ");
        if (iob.sameAvg(fod))
            System.out.println("Are the same");
        else
            System.out.println("Differ");
    }
}
