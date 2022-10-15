public class Calcul {
    public static void main(String[] args) {
        // Задаем переменные
        int n = 24;
        int a = 26;
        int b = 2;
        // Вывод функции
        System.out.print(operation(n, a, b));
    }
    /*
    Логика метода operation
    Задаем условия на все 4 задачи и возращаем соответствующие значения
     */
    public static String operation(int n, int a, int b){
        if (a + b == n ){
            return "added";
        } else if (a - b == n) {
            return "subtracted";
        } else if (a * b == n) {
            return "multiplied";
        } else if (a / b == n) {
            return "divided";
        } else return "none";
    }
}
