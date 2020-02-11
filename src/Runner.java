public class Runner {

    public static void main(String[] args) {
        Car myCar = new Car(1934, "Deusenberg", "Model J");
        System.out.println(myCar.toString());
        myCar.drive(23);
        System.out.println(myCar.toString());

        Rectangle newBoyyo = new Rectangle(10, 12);
        System.out.println(newBoyyo.toString());
        double diagonal = newBoyyo.getDiagonal();
        boolean square = newBoyyo.isSquare();
        System.out.println("The diagonal = " + diagonal);
        System.out.println("This is a square: " + square);
    }

}
