public class ArrayWorking {

    public static void main(String[] args) {
        int[] arr = new int[10];          // Создаем массив с 10 элементами

        for (int i = 0; i < arr.length; i++) {            // Цикл с проходом по массиву
            arr[i] = (int)(Math.random() * 50) + 1;   // Заполняем случайными числами
            System.out.println(arr[i]);         // Выводим на консоль
        }

        System.out.println("Массив после обработки");

        for (int i = 0; i < arr.length; i++) {         // Цикл по массиву
            if(i%2 == 0){                        // Проверяем остаток от деления на 2, если он равен 0
                arr[i] = -5;                      // Устанавливаем -5
            }
            System.out.println(arr[i] + " Индекс: " + i);  // Выводим значение элемента массива и   его индекс
        }


        System.out.println("Массив после обработки");

        for (int i = 0; i < arr.length; i++) {          // Цикл по массиву
            if(i%2 == 1){                       // Проверяем остаток от деления, если индекс нечетный
                arr[i] = 0;                     // Присваиваем элементу 0
            }
            System.out.println(arr[i] + " Индекс: " + i);  // Выводим каждый элемент и его индекс
        }

        double[][] mtx = new double[10][10];  // Создаем матрицу

        for (int i = 0; i < mtx.length; i++) {   // Первый цикл. Он перебирает строки
            for (int j = 0; j < mtx[i].length; j++) {  // Второй цик. Он перебирает столбцы
                mtx[i][j] = Math.random()* 50;       // Заполняем элемент массива случайным числом
                System.out.printf("  %5.2f", mtx[i][j]);    // Выводи число в формате
            }
            System.out.println();      // Переводим вывод на новую строку. После завершения втнутреннего цикла
        }

    }




}
