package com.company;

public class Main {
    public static class Time {
        int second;
        int minute;
        int hour;

        Time(int h, int m, int s) {
            hour = h;
            minute = m;
            second = s;
        }

        Time(int sec) {
            second = sec;
        }

        int fullSecond() {
            return (hour * 60 + minute) * 60 + second;
        }
        void returnFullTime(){
            int H;
            int M;
            int S;
            H=this.second/3600;
            M=(this.second%3600)/60;
            S=(this.second%3600)%60;
            System.out.println("Время Ч:М:С "+H+" "+M+" "+S);
        }
        void printTime(){
        System.out.println("Время ЧАС:МИН:СЕК "+hour+":"+minute+":"+second);
        }
    }

    public static void main(String[] args) {
        int s;
            Time time1 = new Time(5,56,45);
            Time time2 = new Time(24560);
            s=time1.fullSecond();

      time1.printTime();
      System.out.println("Общее количество секунд: "+s);
      time2.returnFullTime();

        }

    }
// write your code here


