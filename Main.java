package com.company;

public class Main {
    public static class GivingOutMoney{
        int banknote_20;
        int banknote_50;
        int banknote_100;
        boolean flag=true;
        void addMoney(int add20, int add50, int add100){
            banknote_20+=add20;
            banknote_50+=add50;
            banknote_100+=add100;
          System.out.println("В банкомате следующее количество купюр: \nбанкнот 20 рублей: "+banknote_20+"\nбанкнот 50 рублей: "+banknote_50+"\nбанкнот 100 рублей:"+banknote_100);
        }

        GivingOutMoney (int ban_20, int ban_50, int ban_100){
         banknote_20=ban_20;
         banknote_50=ban_50;
         banknote_100=ban_100;
     }
     int sumGivingOutMoney(){
     return this.banknote_20*20+this.banknote_50*50+this.banknote_100*100;
     }
       boolean checkGivingOut(int x){
            int sum=sumGivingOutMoney();
         if (sum>=x) {
             return true;
         }
         else {
             return false;
         }
         }

        void calculation(int sumCash){
            int x100=sumCash/100;
            int x50=(sumCash-x100*100)/50;
            int x20=(sumCash-x50*50)/20;
            boolean val=checkGivingOut(sumCash);
            if (val && (sumCash%20==0||sumCash%20==10)) {
                if (x100<=banknote_100){
                    System.out.println("Количество банкнот номиналом 100 рублей: "+x100);
                }
                if(x50<=banknote_50){
                    System.out.println("Количество банкнот номиналом 50 рублей: "+x50);
                }
                if (sumCash%20==0 ){
                    System.out.println("Количество банкот номиналом 20 рублей: "+x20);
                }
            }
            else {
                System.out.println("Данную операцию невозможно выполнить");
            }

        }


       }


    public static void main(String[] args) {
	GivingOutMoney gom = new GivingOutMoney(200,100,100);
	gom.calculation(1050);
	gom.calculation(956);
	gom.addMoney(56,89,47);
    }
}
