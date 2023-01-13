public class Main {

    public static void main(String[] args) {
        Car car = new Car(180, "Мерседес", 10000);    // Создаем объект с 3 переменными

        Car car1 = new Car();  // Создаем объект без переменных.
        car1.setSpeed(140);  // Присваиваем скорость объекту


        Car car2 = new Car(200, "BMW");      // Создаем объект с двумя параметрами

        System.out.println(car.getSpeed());      // Выводим при помощи геттера скорость
        car.setSpeed(200);               // Меняем скорость при помощи сеттера
        System.out.println(car.getSpeed()); // Выводим новую скорость

        System.out.println(car);       // Выводим в консоль свойства объекта при помощи метода toString

        for (int i = 0; i < 10; i++) {      // Выводим итератор(переменную цикла) в консоль
            System.out.println(i);
        }

        printHello();                // Вызываем процедуру(метод с void)
        double square = 2*10*pi();  // Вызываем функцию(типизированный метод) pi(), который что-то возвращает

        System.out.println(square);  // Выводим значение переменной

    }

    public static void printHello(){  // Создаем метод(процедуру), который выводит текст на консоль
        System.out.println("Hello");
    }

    public static double pi(){   // Создаем типизиованный метод(функцию), который возвращает значение при помощи слова return
        return 3.14;
    }

    private Integer getAge(){             // Создаем типизированный метод(функцию), который возвращает объект в точку вызова
        Integer integer = new Integer(5);  // Создаем объект типа Integer и передаем ему 5
        return integer;
    }
}
