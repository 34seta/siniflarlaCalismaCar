public class Car {

    String type;
    String model;
    String color;
    int speed;
    private String Car;

    public  Car(String type, String model, String color, int speed) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    void carPrint() {
        System.out.println("Sectiğiniz Arac tipi : " + this.type);
        System.out.println("Sectiğiniz Arac modeli : " + this.model);
        System.out.println("Sectiğiniz Arac rengi : " + this.color);
        System.out.println("Sectiğiniz Arac Başlangiç hizi : " + this.speed);
        System.out.println("------------------------------------------------");

    }

    int increaseSpeed(int increment) {
        speed += increment;
        return speed;
    }

    int decreaseSpeed(int dcerease) {
        speed -= dcerease;
        return speed;

    }

    void printSpeed() {
        System.out.println("Aracicinizin Hizi : " + speed);
    }
}