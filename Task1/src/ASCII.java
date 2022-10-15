public class ASCII {
    public static void main(String[] args) {
        // Задаем переменную
        char asii = 'A';
        // Вывод функции
        System.out.print(ctoa(asii));
    }
    // Переводим char в int
    public static int ctoa(char asii){
        return ((int) asii);
    }
}
