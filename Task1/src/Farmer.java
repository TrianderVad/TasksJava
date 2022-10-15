public class Farmer {
    public static void main(String[] args)
    {
        int chicken = 2; // курицы
        int cow = 3; // коровы
        int pigs = 5; // свиньи
        System.out.print(triArenas(chicken, cow, pigs)); // вывод кол-ва ног
    }


    public static int triArenas(int chicken, int cow, int pig)
    {
        // Задаем кол-во ног у животных
        int chlegs = 2;
        int cwlegs = 4;
        int pglegs = 4;
        return chicken * chlegs + cwlegs * cow + pglegs * pig; // считаем ноги
    }
}


