public class ProGamble {
    public static void main(String[] args) {
        // Задаем переменные
        double prob = 0.2;
        int prize = 50;
        int pay = 9;
        // Вывод функций
        System.out.print(profitableGamble(prob, prize, pay));
    }
    /* Логика метода profitableGamble:
    Если prob * prize больше pay, то возращаем true иначе false
     */
    public static boolean profitableGamble(double prob, int prize, int pay){
        if (prob * prize > pay){
            return true;
        } else return false;
    }
}
