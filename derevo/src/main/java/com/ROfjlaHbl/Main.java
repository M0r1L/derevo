package com.ROfjlaHbl;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
//будем резать этих телок
    }
}




































































































/*class Fraction{
    private int num;
    private int den;
    public  Fraction(){
        int num = 0;
        int den = 0;

    }
    public Fraction(int num, int den){
        this.num = num;
        this.den = den;
    }
    public int getNum(){
        return num;
    }
    public int getDen(){
        return den;
    }
    public boolean isInteger(){
        if (den == 1){
            return true;
        }
        else{return false;}
    }
    static{
        Fraction example = new Fraction(1,2);
        Fraction ex1 = new Fraction();
        Fraction ex2 = new Fraction(1,2);
        int numerator = example.getNum();
        int denominator = example.getDen();
    }
}
public class Main {

    public static void main(String[] args) {
//будем резать этих телок
    int den4ik=0;
    int makson = 0;
    int dima = 0;
        Scanner in = new Scanner(System.in);
        String str = "";
        String str2 = "";
        String str3 = "";
        str = in.next();
        str2 = in.next();
        str3 = in.next();
        System.out.println(calculate(str,str2,str3));
        ArrayList<Integer> numbers = new ArrayList<>();
        int index2 = str.indexOf("/");
        int index3 = str3.indexOf("/");
        if(index2 == -1)
        {
            numbers.add(Integer.parseInt(str));
        }
        else
        {
            String[] parts12 = str.split("/");
            int chis = Integer.parseInt(parts12[0]);
            int znamxD = Integer.parseInt(parts12[1]);
            numbers.add(chis);
            numbers.add(znamxD);
        }
        if(index3 == -1)
        {
            numbers.add(Integer.parseInt(str3));
        }
        else
        {
            String[] parts121 = str3.split("/");
            int chis1 = Integer.parseInt(parts121[0]);
            int znamxD1 = Integer.parseInt(parts121[1]);
            numbers.add(chis1);
            numbers.add(znamxD1);
        }

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i+1; j < numbers.size(); j++)
            {
                if(numbers.get(i)==numbers.get(j))
                {
                    den4ik++;
                }
                if(makson<den4ik)
                {
                    makson=den4ik;
                    dima=numbers.get(i);
                }
                den4ik=0;
            }
        }
        if(dima==0)
        {
            System.out.println("НЕТ одинаковых чисел");
        }
        else {
            System.out.println(dima);
        }
    }

    public static String calculate(String num1, String operation, String num2) {
        String res2;
        String str = num1 ;
        int index = str.indexOf("/");
        if (index == -1) {
            int num = Integer.parseInt(num1);

            String c = operation;
            int num11 = Integer.parseInt(num2);
            int res1;

            int celoe = 0;
            switch (c) {
                case "*":
                    res1 = num * num11;
                    res2 = String.valueOf(res1);
                    return res2;
                case "+":
                    res1 = num + num11;
                    res2 = String.valueOf(res1);
                    return res2;
                case "-":
                    res1 = num - num11;
                    res2 = String.valueOf(res1);
                    return res2;
                case "/":
                    if (num11 == 0) {
                        res2="na 0   ne deli";
                        return res2;
                    }
                    if (num > num11) {
                        celoe = num / num11;
                        num = num - (num11 * celoe);
                    }
                    if (celoe != 0 && num != 0) {
                        res2= celoe + " " + num1 + "/" + num11;
                        return res2;
                    } else if (num == 0) {
                        res2=String.valueOf(celoe);
                        return res2;
                    }
            }
        } else {
            String[] parts = str.split("/");
            int chis_num = Integer.parseInt(parts[0]);
            int znam_num = Integer.parseInt(parts[1]);

            String s = operation;

            String str1 = num2;
            int index1 = str1.indexOf("/");
            int chis_num1;
            int znam_num1;
            if (index1 != -1) {
                String[] parts1 = str1.split("/");
                chis_num1 = Integer.parseInt(parts1[0]);

                znam_num1 = Integer.parseInt(parts1[1]);
            } else {
                chis_num1 = Integer.parseInt(str1);
                znam_num1 = 1;
            }
            int chis_result;
            int znam_resuzlt;
            switch (s) {
                case "*":

                    chis_result = chis_num1 * chis_num;
                    znam_resuzlt = znam_num * znam_num1;
                    res2 = chis_result + "/" + znam_resuzlt;
                    return res2;
                case "+":
                    chis_result = chis_num * znam_num1 + chis_num1 * znam_num;
                    znam_resuzlt = znam_num * znam_num1;
                    res2 = chis_result + "/" + znam_resuzlt;
                    return res2;
                case "-":
                    chis_result = chis_num * znam_num1 - chis_num1 * znam_num;
                    znam_resuzlt = znam_num * znam_num1;
                    res2 = chis_result + "/" + znam_resuzlt;
                    return res2;
                case "/":
                    if (chis_num1 == 0) {
                        res2="na 0 ne deli";
                        return res2;
                    }
                    chis_result = chis_num * znam_num1;
                    znam_resuzlt = znam_num * chis_num1;
                    res2 = chis_result + "/" + znam_resuzlt;
                    return res2;
            }
        }
        return null;
    }

}*/


