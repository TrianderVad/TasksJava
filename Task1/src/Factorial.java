public class Factorial {
    public static void main(String[] args) {
        // Задаем переменную
        int a = 10;
        // Выводим функцию
        System.out.print(addUpTo(a));
    }
    /* Считаем факториал, используя цикл for
    В каждой итерации прибавляем значение i к значению fact,
    после увеличивая значение i */
    public static int addUpTo(int a){
        int fact = 0;
        for (int i = 1; i < a+1; i++){
            fact+= i;
        }
        return fact;
    }
}
