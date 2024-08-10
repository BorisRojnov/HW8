import java.util.Random;
public class Main {
    public static void main(String[] args) {
        //todo код программы писать тут
        System.out.println("Вес 10 человек от 40 до 100 кг: ");
        double[] people = new double[10];
        for(int i = 0; i < people.length; i++){
            people[i] = new Random().nextInt(39, 99) + 1;
            System.out.println(people[i]);
        }


        System.out.println("Количество людей у которых вес находится в промежутке" +
                " от 60 до 80 кг включительно: ");
        int numberOfPeople = 0;
        for (int i = 0; i < people.length; i++) {
            if(people[i] >= 60.0 && people[i] <= 80.0){
               numberOfPeople = numberOfPeople + 1;
            }
        }
        System.out.println(numberOfPeople);

        System.out.println("Срений вес: ");
        double averageWeight = 0;
        for(int i = 0; i < people.length; i++){
            averageWeight = averageWeight + people[i];
        }
        System.out.println(averageWeight / 2);

    }
}
