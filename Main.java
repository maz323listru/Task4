package com.company;

public class Main {
    public static class Bankomat {
        int banknote_20;
        int banknote_50;
        int banknote_100;


        void addMoney(int add20, int add50, int add100) {
            banknote_20 += add20;
            banknote_50 += add50;
            banknote_100 += add100;
            System.out.println("В банкомате следующее количество купюр: \nбанкнот 20 рублей: " + banknote_20 + "\nбанкнот 50 рублей: " + banknote_50 + "\nбанкнот 100 рублей:" + banknote_100);
        }

        Bankomat(int ban_20, int ban_50, int ban_100) {
            banknote_20 = ban_20;
            banknote_50 = ban_50;
            banknote_100 = ban_100;
        }

        int sumGivingOutMoney() {
            return banknote_20 * 20 + banknote_50 * 50 + banknote_100 * 100;
        }

        boolean checkGivingOut(int x) {
            int sum = sumGivingOutMoney();
            if (sum >= x) {
                return true;
            } else {
                return false;
            }
        }
        void calculation_1(int sumCash){
            sumCash = sumCash - 50;
                int x100 = sumCash / 100;
                int x50=0;
                int x20 = ((sumCash - x100 * 100) / 20);
                if (x100 <= banknote_100) {
                    System.out.println("Количество банкнот номиналом 100 рублей: " + x100);
                }
                else {
                    x50=sumCash/50;
                    x20=(sumCash-x50*50)/20;
                }
                if (x50 <= banknote_50) {
                    System.out.println("Количество банкнот номиналом 50 рублей: " + (x50+1));
                }
                if (x20 <= banknote_20) {
                    System.out.println("Количество банкот номиналом 20 рублей: " + x20);
                }
        }


        void calculation(int sumCash) {
            int x100 = sumCash / 100;
            int x50 = (sumCash - x100 * 100) / 50;
            int conX50=(sumCash - x100 * 100) - (x50 * 50);
            int x20 = conX50 / 20;
            int check=conX50 % 20;
            boolean val = checkGivingOut(sumCash);
            if (val && sumCash/10%2!=0 && sumCash%10==0 && sumCash!=30){
                calculation_1(sumCash);
            }
            else if (val && check==10 ){
                x50=0;
                if (x100 <= banknote_100) {
                    System.out.println("Количество банкнот номиналом 100 рублей: " + x100);
                    x20=(sumCash-x100*100)/20;
                    System.out.println("Количество банкнот номиналом 50 рублей: " + x50);
                    System.out.println("Количество банкот номиналом 20 рублей: " + x20);
                }
                else {
                    if (x50<= banknote_50){
                        System.out.println("Количество банкнот номиналом 100 рублей: 0");
                        x50=x100*2;
                        x20=(sumCash-x50*50)/20;
                        System.out.println("Количество банкнот номиналом 50 рублей: " + x50);
                        System.out.println("Количество банкот номиналом 20 рублей: " + x20);
                    }
                    else {
                        x20=sumCash/20;
                        System.out.println("Количество банкот номиналом 20 рублей: "+x20);
                    }
                }

            }
            else if (val && (sumCash % 20 == 0 || sumCash % 50 == 0 || sumCash % 100 == 0 )) {

                if (x100 <= banknote_100) {
                    System.out.println("Количество банкнот номиналом 100 рублей: " + x100);
                }
                else {
                    x50=sumCash/50;
                    x20=(sumCash-x50*50)/20;
                }
                if (x50 <= banknote_50) {
                    System.out.println("Количество банкнот номиналом 50 рублей: " + x50);
                }
                else {
                    x20=sumCash/20;
                }
                if (x20 <= banknote_20) {
                    System.out.println("Количество банкот номиналом 20 рублей: " + x20);
                }
            } else {
                System.out.println("Данную операцию невозможно выполнить");
            }
        }
    }


    public static void main(String[] args) {
        Bankomat gom = new Bankomat(200, 400, 500);
        gom.calculation(280);
        gom.calculation(185);
        gom.addMoney(56, 89, 47);

    }
}
