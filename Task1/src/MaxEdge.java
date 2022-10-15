public class MaxEdge {
    public static void main(String[] args) {
        // Задаем переменные
        int a = 8;
        int b = 10;
        // Вывод функции
        System.out.print(nextEdge(a, b));
    }
    /* Т.к. по свойству треугольника, мы знаем, что
    3-яя сторона не может быть больше суммы 2-ух других сторон, то
    3-яя сторона является суммой этой сторон - 1

     */
    public static int nextEdge(int a, int b){
        return a + b - 1;
    }
}
