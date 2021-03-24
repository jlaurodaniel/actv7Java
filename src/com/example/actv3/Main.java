package com.example.actv3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int numero=100;
    public static void main(String[] args) {
        System.out.println("Actividad 7 de la materia Computacíòn en Java");
        /*Numero primos */
        List<Integer> Primos = numPrimos(numero);
        List<Long> fibonacci=fibonacci((long) numero);
        System.out.println("********----------  Primeros "+numero+" numeros primos   ----------***********");
        for  (int k=0;k<Primos.size();k++){
            System.out.print("["+Primos.get(k)+"] ");
        }
        System.out.println();
        System.out.println("********----------  Primeros "+numero+" numeros de la Sucesión de Fibonacci  ----------***********");
        for  (int k=0;k<fibonacci.size();k++){
            System.out.print("["+fibonacci.get(k)+"] ");
        }
        /*Sucesión de Fibonacci*/
    }
    /*Metodo que retorna la cantidad de numeros primos puestos en parametro*/
    public static List<Integer> numPrimos (int a){
        List<Integer> Numeros = new ArrayList<>();
        /*Empiezo desde 2 porque por convencion el 1 no cuenta como primo o compuesto*/
       for (int b=2;Numeros.size()<=a;b++){
           int numDivisores=0;
           for (int c=1;c<=b;c++){
               if (b%c==0){
                   numDivisores+=1;
               }
           }
           if (numDivisores==2){
               Numeros.add(b);
           }
       }
        return Numeros;
    }
    public static List <Long> fibonacci(long n){
        List<Long> fibonacci = new ArrayList<>();
        long a=0,b=1,r;
        while (fibonacci.size()!=n){
            r=a+b;
            fibonacci.add(r);
            a=b;
            b=r;
        }
        return fibonacci;
    }
}
