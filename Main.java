package com.company;



import java.util.Scanner;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

        int deleted;
        int[] newarray = null;

        System.out.print("Введите размерность массива: ");
        int n = in.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Введите целое число: ");
            array[i] = in.nextInt();
        }

        System.out.print("Введите число, которое требуется удалить: ");
        deleted = in.nextInt();

        for (int i = 0; i < array.length-1; i++) {
            if(array[i] == deleted){
                newarray = new int[array.length-1];
                for (int index = 0; index < i; index++){
                    newarray[index] = array[index];
                }
                for (int j = i; j < array.length-1; j++){
                    newarray[j] = array[j+1];
                }
                break;}}
        System.out.println("Первоначальный массив: " + Arrays.toString(array));
        System.out.println("Новый массив: " + Arrays.toString(newarray));
    }
}
