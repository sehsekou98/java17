class Box{
    double width;
    double height;
    double depth;

    public Box(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    double volume(){
        return width * height * depth;

    }

}