public class Farmer {
    public static void main(String[] args)
    {
        int chicken = 1; // курицы
        int cow = 2; // коровы
        int pigs = 3; // свиньи
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


