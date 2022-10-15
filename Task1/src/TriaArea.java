public class TriaArea {
    public static void main(String[] args)
    {
        int a = 3; // основание
        int h = 3; // высота
        System.out.print(triArenas(a,h)); // вывод формулы
    }


    public static double triArenas(int a, int h){
        return 0.5 * a * h; // формула площади
    }
}
