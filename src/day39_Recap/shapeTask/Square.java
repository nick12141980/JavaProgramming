package day39_Recap.shapeTask;

public class Square extends Shape{

    private double side;

    public Square(String name, double side) {
        super(name);
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<0){
            System.err.println("Invalid side "+side);
            System.exit(1);
        }
        this.side = side;
    }
}
