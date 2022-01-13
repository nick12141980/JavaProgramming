package day32_Constructor;

public class Carpet {

    public double width, length, unitPrice;
    public boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
        double totalCost = width*length*unitPrice;
        if(isPersian){
            totalCost += 200;
        }
        return totalCost;
    }

    public String toString() {
        return "Carpet{" +
                "width is " + width +
                ", length is " + length +
                ", unitPrice is $" + unitPrice +
                ", isPersian: " + isPersian +
                ", Total price is $" + calcCost() +
                '}';
    }
}
