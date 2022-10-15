public class Cubes {
    public static void main(String[] args) {
        // Задаем массив
        Integer[] cubes = new Integer[] {3,4,5};
        // Вывод функции
        System.out.print(sumOfCubes(cubes));

    }
    /*
    Логика работы метода sumOfCubes
    Создается переменная sum_cub = 0
    Перебирается масси cubes
    Каждое значение этого массива возводится в куб и складывается с sum_cub
    Возвращается сумма кубов
     */
    public static int sumOfCubes(Integer[] cubes){
        int sum_cub = 0;
        for (int i = 0; i < cubes.length; i++){
            sum_cub += Math.pow(cubes[i], 3);
        }
    return sum_cub;
    }
}
