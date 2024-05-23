package oop;

public class CalculatorAppPlus
{
    public static void main(String[] args) 
    {
        Calculator CalculatorRemote = new Calculator();
            //B1. Khai bao bien co ten la CalculatorRemote voi kieu du lieu la Calculator
            //B2. Khoi tao doi tuong Calculator voi trang thai a=2, b=2 va hanh vi multiply() trong vung nho Heap
            //B3. Gan doi tuong Calculator trong Heap cho bien CalculatorRemote 
        int result= CalculatorRemote.multiply(); //message
        System.out.println("Ket Qua: "+ result);
    }
}
