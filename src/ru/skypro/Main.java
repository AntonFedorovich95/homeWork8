package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным!");
        } else {
            System.out.println(year + " год не является високосным!");
        }
    }

    public static void currentYear (int ClientOS, int clientDeviceYear){
            if (ClientOS == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                if (ClientOS == 1 && clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите приложение по ссылке");
                }
            }
        }

        public static void delivery ( int deliveryDistance){
            if (deliveryDistance < 20) {
                System.out.println("Потребуется дней: 1 день!");
            } else if (deliveryDistance < 60) {
                System.out.println("Потребуется дней: 2 дня!");
            } else if (deliveryDistance <= 100) {
                System.out.println("Потребуется дней: 3 дня!");
            } else if (deliveryDistance > 100) {
                System.out.println("Потребуется больше 3 дней доставки!");
            }
        }

        public static void str (String str){
            char[] arr = str.toCharArray();
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] == arr[i - 1]) {
                    System.out.println(arr[i]);
                    return;
                }
            }
            System.out.println("Дублей не обнаружено!");
        }

        public static int[] reverseArray ( int[] rev){
            int[] copyArray = Arrays.copyOf(rev, rev.length);
            int leftIndex = 0;
            int rightIndex = rev.length - 1;
            while (leftIndex < rightIndex) {
                int temp = copyArray[leftIndex];
                copyArray[leftIndex] = copyArray[rightIndex];
                copyArray[rightIndex] = temp;
                leftIndex++;
                rightIndex--;
            }
            return copyArray;
        }
        public static void main (String[]args){
            leapYear(1995);
            currentYear(1, 2000);
            delivery(100);
            str("adfghjk");
            int[] rev = new int[]{2, 3, 5, 4, 6, 7, 3};
            int[] reverseArray = reverseArray(rev);
            System.out.print(Arrays.toString(reverseArray));
        }
    }