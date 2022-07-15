public class Main {
    public static void main(String[] args) {
        Car audi=new Car("saport","A6","GREEN",150);

        audi.decreaseSpeed(10);
        audi.printSpeed();
        audi.carPrint();

        Car mercedes=new Car("Sedan","C180","gray",220);
        mercedes.carPrint();
        mercedes.decreaseSpeed(25);
        mercedes.printSpeed();


        audi.increaseSpeed(100);
        audi.printSpeed();






    }
}