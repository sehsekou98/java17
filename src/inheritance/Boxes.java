package inheritance;

 class Boxes {
     double width;
     double height;
     double depth;

     Boxes(Boxes ob) {
         width = ob.width;
         height = ob.height;
         depth = ob.depth;
     }

     Boxes(double w, double h, double d) {
         width = w;
         height = h;
         depth = d;
     }

     Boxes() {
         width = 4;
         height = 5;
         depth = 2;
     }

     Boxes(double len) {
         width = height = depth = len;
     }

     double volume() {
         return width * height * depth;
     }
 }

 //Box-weight is inherited from Box
     class BoxWeights extends Boxes {
     double weight;

     BoxWeights(BoxWeights ob) {
         super(ob);
         weight = ob.weight;
     }

     BoxWeights(double w, double h, double d, double n) {
         super(w, h, d);
         weight = n;
     }

     //default constructor
     BoxWeights() {
         super();
         weight = -2;
     }

     BoxWeights(double len, double n) {
         super(len);
         weight = n;
     }

 }

 class Shipment extends BoxWeights {
     double cost;

     Shipment(Shipment ob){
         super(ob);
         cost = ob.cost;
     }

     Shipment(double w, double h, double d, double n, double c){
         super(w, h, d, n);
         cost = c;

     }

     //default constructor
     Shipment(){
         super();
         cost = -2;
     }

     Shipment(double len, double n, double c){
         super(len, n);
         cost = c;
     }
 }

     class ShipmentDemo{
         public static void main(String[] args) {
             Shipment  shipment = new Shipment(10, 20, 14, 15, 16);
             Shipment shipment1 = new Shipment(2, 4, 8, 6, 9);
             double vol;

             vol = shipment.volume();
             System.out.println("Volume of shipment is: " + vol);
             System.out.println("Cost of shipment is: " + shipment.cost);
             System.out.println("Weight of shipment is: " + shipment1.width);
             System.out.println("Weight of shipment is: " + shipment1.depth);


             System.out.println();


             vol = shipment1.volume();
             System.out.println("Volume of shipment1 is: " + vol);
             System.out.println("Cost of shipment is: " + shipment1.cost);
             System.out.println("Weight of shipment is: " + shipment1.width);
             System.out.println("Height of shipment is: " + shipment1.height);


         }
     }


