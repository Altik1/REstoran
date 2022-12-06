import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int a= scanner.nextInt();
        System.out.println("Для заказа: Меню");
        while (true) {
            String b = scanner.nextLine();
            switch (b) {
                case "Меню":
                    System.out.println("У нас в меню есть: блюда, напитки, салат, дисерт");
                    System.out.println("Что вы хитите у нас заказать?");
                    break;


//                      БЛЮДА

                case "блюда":
                    System.out.println("Чымчыма, Вареники, Лагман, Куурдак");
                    break;

                case "Чымчыма":
                    System.out.println("Чымчыма стоят: 250с. Объем 500гр. ");
                    break;
                case "скорость подачи Чымчыма":
                    System.out.println("Чымчыма будут у вас через: 10 минут");
                    break;

                case "Вареников":
                    System.out.println("Вареники стоят: 190с. Объем 500гр");
                    break;
                case "скорость подачи Вареников":
                    System.out.println("Вареники будут у вас через 12 минут");
                    break;

                case "Лагман":
                    System.out.println("Лагман стоит: 400с. Объем 600гр");
                    break;
                case "скорость подачи Лагмана":
                    System.out.println("Лагман будет у вас через  12 минут");
                    break;

                case "Куурдак":
                    System.out.println("Куурдак стоит: 300с. Объем 400гр");
                    break;
                case "скорость подачи Куурдак":
                    System.out.println("Куурдак будет у вас через 15 минут");
                    break;


//                      НАПИТКИ


                case "напитки":
                    System.out.println("кока-кола, спрайт, фанта, вода");
                    break;
                case "кока-кола":
                    System.out.println("Кока-кола стоит 75с. Объем 1л");
                    break;
                case "скорость подачи колы":
                    System.out.println(" будет у вас через 3 минуты");
                    break;

                case "спрайт":
                    System.out.println("Спрайт стоит 75с. Объем 1л");
                    break;
                case "скорость подачи спрайта":
                    System.out.println(" будет у вас через 3 минуты");
                    break;

                case "фанта":
                    System.out.println("Фанта стоит 75с. Объем 1л");
                    break;
                case "скорость подачи фанты":
                    System.out.println(" будет у вас через 3 минуты");
                    break;

                case "вода":
                    System.out.println("Вода стоит 50с. Объем 1л");
                    break;
                case "скорость подачи воды":
                    System.out.println(" будет у вас через 3 минуты");
                    break;


//                      САЛАТЫ


                case "салат":
                    System.out.println("цезарь, гнездо, оливье, мимоза");
                    break;

                case "цезарь":
                    System.out.println("Цезарь стоит 100с. Объем 100гр ");
                    break;
                case "скорость подачи цезаря":
                    System.out.println(" будет у вас через 7 минут");
                    break;

                case "гнездо":
                    System.out.println(" Гнездо стоит 120с. Объем ");
                    break;
                case "скорость подачи гнезда":
                    System.out.println(" будет у вас через 7 минут");
                    break;

                case "оливье":
                    System.out.println("Оливье стоит 150с. Объем 130гр");
                    break;
                case "скорость подачи оливье":
                    System.out.println(" будет у вас через 7 минут");
                    break;case "мимоза":
                    System.out.println("Мимоза стоит 150с. Объем 120гр ");
                    break;
                case "скорость подачи мимозы":
                    System.out.println(" будет у вас через 7 минуты");
                    break;


//                      ДИСЕРТЫ


                case "дисерт":
                    System.out.println("чак-чак, пахлава, чискейк, сырники");
                    break;

                case "чак-чак":
                    System.out.println("Чак-чак стоит 150с. Объем 100гр");
                    break;
                case "скорость подачи чак-чака":
                    System.out.println(" будет у вас через 10 минуты");
                    break;

                case "пахлава":
                    System.out.println("Пахлава стоит 170с. Объем 120гр ");
                    break;
                case "скорость подачи пахлавы":
                    System.out.println(" будет у вас через 7 минуты");
                    break;

                case "чискейк":
                    System.out.println("Чискейк стоит 140с. Объем 80гр ");
                    break;
                case "скорость подачи чискейка":
                    System.out.println(" будет у вас через 7 минуты");
                    break;

                case "сырник":
                    System.out.println("сырник стоит 100с. Объем 200гр ");
                    break;
                case "скорость подачи сырников  ":
                    System.out.println(" будет у вас через 7 минуты");
                    break;


                default:
                    System.out.println("Этого продукта нет в наличии!");

            }
        }


    }
}