public class MathABC {
    public static void main(String[] args) {
        // Задаем массив
        int a = 1;
        int b = 2;
        int c = 3;
        // Вывод функции
        System.out.print(abcMath(a, b, c));

    }

    /*
    Логика работы метода abcMath
    С помощью цикла for идет перебор сколько раз мы будем добавлять A саму к себе
    Потом проверяем делится ли это число на C, если да, то выводим true, иначе false
     */
    public static boolean abcMath(int a, int b, int c) {
        for (int i = 0; i < b; i++) {
            a += a;
        }
        if (a % c == 0) {
            return true;
        } else return false;
    }
}
