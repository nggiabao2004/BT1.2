package pop;

public class CalculatorApp {

    public static void main(String[] args)  //Begin
    {
        int c= multiply();
        System.out.println("Ket Qua: "+ c);
        return; //Return: Tra quyen dieu khien cho he dieu hanh
    }    //End

    static int multiply()  //Begin ham
    {
        int a= 2;
        int b= 2;
        int c= a*b;
        return c;   //Tra lai gia tri c ve ban dau
    }   //End ham
}
