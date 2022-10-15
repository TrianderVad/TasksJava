public class Remainder {

    public static void main(String[] args)
    {
        int x = 3; // первое число
        int y = 4; // второе число
        System.out.print(remaind(x,y)); // вывод остатка
    }

    // Вычисляется Остаток и возращается
    public static int remaind(int x, int y){
        return x % y;
    }
}
