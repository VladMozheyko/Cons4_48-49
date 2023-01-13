public class Car {
    private int speed;        // Поля класса
    private String brand;
    private double price;

    public Car() {
    }

    public Car(int speed, String brand) {      // Конструкторы. Методы, которые создают объекты
        this.speed = speed;
        this.brand = brand;
    }

    public Car(int speed, String brand, double price) {
        this.speed = speed;
        this.brand = brand;
        this.price = price;
    }

    public int getSpeed() {         // Аксессоры: геттеры и сеттеры. Методы для доступа к переменным класса
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {             // Метод для преобразования значений переменных в строчную форму
        return "Car{" +
                "speed=" + speed +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
