import java.util.Scanner;

public class Loader
{
    public static void main(String[] args)
    {
        Cat Люцепюр = new Cat();
        Cat Марципан = new Cat();
        Cat Анфиса = new Cat();
        Cat Инокентий = new Cat();
        Cat Маркиза = new Cat();
        while (true) {
            Scanner scan1 = new Scanner(System.in);
            System.out.println("\n Что вы хотите сделать: Покормить или Мяукнуть");
            String action = scan1.nextLine();
            if (action.equals("Покормить"))
            {
                System.out.println("Какого кота вы хотите покормить ? - Люцепюр, Марципан, Анфиса, Инокентий, Маркиза");
            Scanner scan2 = new Scanner(System.in);
            String catName1 = scan2.nextLine();
                switch (catName1) {
                    case "Люцепюр":
                        System.out.println("\n************************************************");
                        System.out.format("Вес Люцепюра %.2f%s%n", Люцепюр.getWeight()," г.");
                        Люцепюр.feed();
                        System.out.println("Люцепюр сейчас " + Люцепюр.getStatus());
                        System.out.println(Люцепюр.countEaten());
                        System.out.println(Люцепюр.toilet());
                        System.out.println("************************************************");
                        break;
                    case "Марципан":
                        System.out.println("\n************************************************");
                        System.out.format("Вес Марципан %.2f%s%n", Марципан.getWeight()," г.");
                        Марципан.feed();
                        System.out.println("Марципан сейчас " + Марципан.getStatus());
                        System.out.println(Марципан.countEaten());
                        System.out.println(Марципан.toilet());
                        System.out.println("************************************************");
                        break;
                    case "Анфиса":
                        System.out.println("\n************************************************");
                        System.out.format("Вес Анфиса %.2f%s%n", Анфиса.getWeight()," г.");
                        Анфиса.feed();
                        System.out.println("Анфиса сейчас " + Анфиса.getStatus());
                        System.out.println(Анфиса.countEaten());
                        System.out.println(Анфиса.toilet());
                        System.out.println("************************************************");
                        break;
                    case "Инокентий":
                        System.out.println("\n************************************************");
                        System.out.format("Вес Инокентий %.2f%s%n", Инокентий.getWeight()," г.");
                        Инокентий.feed();
                        System.out.println("catName1 сейчас " + Инокентий.getStatus());
                        System.out.println(Инокентий.countEaten());
                        System.out.println(Инокентий.toilet());
                        System.out.println("************************************************");
                        break;
                    case "Маркиза":
                        System.out.println("\n************************************************");
                        System.out.format("Вес Маркиза %.2f%s%n", Маркиза.getWeight()," г.");
                        Маркиза.feed();
                        System.out.println("Маркиза сейчас " + Маркиза.getStatus());
                        System.out.println(Маркиза.countEaten());
                        System.out.println(Маркиза.toilet());
                        System.out.println("************************************************");
                        break;
                    default:
                        System.out.println("Вы ввели не правельное имя кота. Ничего страшного попробуйте ещё раз");
                        break;
                }

            }else if (action.equals("Мяукнуть"))
            {
                System.out.println("Выберите кота чтобы он мяукнул ? - Люцепюр, Марципан, Анфиса, Инокентий, Маркиза");
                Scanner scan3 = new Scanner(System.in);
                String catName2 = scan3.nextLine();
                switch (catName2) {
                    case "Люцепюр":
                        System.out.println("\n************");
                        Люцепюр.meow((double) 100);
                        System.out.format("Вес Люцепюра %.2f%n", Люцепюр.getWeight());
                        System.out.println("Люцепюр сейчас " + Люцепюр.getStatus());
                        System.out.println("************");
                        break;
                    case "Марципан":
                        System.out.println("\n************");
                        Марципан.meow((double) 100);
                        System.out.format("Вес Марципана %.2f%n", Марципан.getWeight());
                        System.out.println("Марципан сейчас " + Марципан.getStatus());
                        System.out.println("************");
                        break;
                    case "Анфиса":
                        System.out.println("\n************");
                        Анфиса.meow((double) 100);
                        System.out.format("Вес Анфисы %.2f%n", Анфиса.getWeight());
                        System.out.println("Анфиса сейчас " + Анфиса.getStatus());
                        System.out.println("************");
                        break;
                    case "Инокентий":
                        System.out.println("\n************");
                        Инокентий.meow((double) 100);
                        System.out.format("Вес Инокентия %.2f%n", Инокентий.getWeight());
                        System.out.println("Инокентий сейчас " + Инокентий.getStatus());
                        System.out.println("************");
                        break;
                    case "Маркиза":
                        System.out.println("\n************");
                        Маркиза.meow((double) 100);
                        System.out.format("Вес Маркизы %.2f%n", Маркиза.getWeight());
                        System.out.println("Маркиза сейчас " + Маркиза.getStatus());
                        System.out.println("************");
                        break;
                    default:
                        System.out.println("Вы ввели не правельное имя кота. Ничего страшного попробуйте ещё раз");
                        break;
                }
            }
            else System.out.println("Вы что-то сделали не так");
        }
    }
}