import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество денег:");
        double money = sc.nextDouble();
        System.out.println("В какой валюте у Вас деньги? Введите вариант:\n 1) Рубль\n 2) Евро\n 3) Доллар ");
        int currentCurrency = sc.nextInt();
        while ((currentCurrency > 3) || (currentCurrency < 1)) {
            System.out.println("Нет такой валюты!!!");
            System.out.println("В какой валюте у Вас деньги? Введите вариант:\n 1) Рубль\n 2) Евро\n 3) Доллар ");
            currentCurrency = sc.nextInt();
        }

        if (currentCurrency == 1) {
            double euro = 0;
            euro = (money / 104.26);
            NumberFormat numberFormat1;
            numberFormat1 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
            System.out.println("Деньги в Евро = " +
                    numberFormat1.format(euro));

            double dollar = 0;
            dollar = (money / 99.41);
            NumberFormat numberFormat2;
            numberFormat2 = NumberFormat.getCurrencyInstance(Locale.US);
            System.out.println("Деньги в Долларах = " +
                    numberFormat2.format(dollar));
        }
        if (currentCurrency == 2) {
            double rub = 0;
            rub = (money * 104.26);
            NumberFormat numberFormat3;
            numberFormat3 = NumberFormat.getCurrencyInstance();
            System.out.println("Деньги в Рублях = " +
                    numberFormat3.format(rub));

            double dollar = 0;
            dollar = (money *104.26/99.41);
            NumberFormat numberFormat2;
            numberFormat2 = NumberFormat.getCurrencyInstance(Locale.US);
            System.out.println("Деньги в Долларах = " +
                    numberFormat2.format(dollar));
        }
        if (currentCurrency == 3) {
            double rus = 0;
            rus = (money * 99.41);
            NumberFormat numberFormat3;
            numberFormat3 = NumberFormat.getCurrencyInstance();
            System.out.println("Деньги в Рублях = " +
                    numberFormat3.format(rus));

            double euro = 0;
            euro = (money /99.41*104.26);
            NumberFormat numberFormat1;
            numberFormat1 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
            System.out.println("Деньги в Евро = " +
                    numberFormat1.format(euro));
        }

    }
}
