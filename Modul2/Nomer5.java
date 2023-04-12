package Modul2;

import java.util.Scanner;

public class Nomer5 {
    static Scanner input = new Scanner(System.in);

    static void Celcius_ke_Fahrenheit() {
        try {
            System.out.print("Masukkan suhu dalam Celcius : ");
            double celcius = input.nextDouble();
            double fahrenheit = (celcius * 9 / 5) + 32;
            System.out.println("Suhu dalam Fahrenheit : " + fahrenheit);
        } catch (Exception e) {
            System.out.println("Inputan tidak valid");
        } 
    }

    static void Celcius_ke_Reamur() {
        try {
            System.out.print("Masukkan suhu dalam Celcius : ");
            double celcius = input.nextDouble();
            double reamur = (celcius * 4 / 5);
            System.out.println("Suhu dalam Reamur : " + reamur);
        } catch (Exception e) {
            System.out.println("Inputan tidak valid");
        } 
    }

    static void Celcius_ke_Kelvin() {
        try {
            System.out.print("Masukkan suhu dalam Celcius : ");
            double celcius = input.nextDouble();
            double kelvin = (celcius + 273);
            System.out.println("Suhu dalam Kelvin : " + kelvin);
        } catch (Exception e) {
            System.out.println("Inputan tidak valid");
        }
    }

    static void Fahrenheit_ke_Celcius() {
        try {
            System.out.print("Masukkan suhu dalam Fahrenheit : ");
            double fahrenheit = input.nextDouble();
            double celcius = (fahrenheit - 32) * 5 / 9;
            System.out.println("Suhu dalam Celcius : " + celcius);
        } catch (Exception e) {
            System.out.println("Inputan tidak valid");
        }
    }

    static void Fahrenheit_ke_Reamur() {
        try {
            System.out.print("Masukkan suhu dalam Fahrenheit : ");
            double fahrenheit = input.nextDouble();
            double reamur = (fahrenheit - 32) * 4 / 9;
            System.out.println("Suhu dalam Reamur : " + reamur);
        } catch (Exception e) {
            System.out.println("Inputan tidak valid");
        }
    }

    static void Fahrenheit_ke_Kelvin() {
        try {
            System.out.print("Masukkan suhu dalam Fahrenheit : ");
            double fahrenheit = input.nextDouble();
            double kelvin = (fahrenheit - 32) * 5 / 9 + 273;
            System.out.println("Suhu dalam Kelvin : " + kelvin);
        } catch (Exception e) {
            System.out.println("Inputan tidak valid");
        }
    }

    static void Reamur_ke_Celcius() {
        try {
            System.out.print("Masukkan suhu dalam Reamur : ");
            double reamur = input.nextDouble();
            double celcius = (reamur * 5 / 4);
            System.out.println("Suhu dalam Celcius : " + celcius);
        } catch (Exception e) {
            System.out.println("Inputan tidak valid");
        }
    }

    static void Reamur_ke_Fahrenheit() {
        try {
            System.out.print("Masukkan suhu dalam Reamur : ");
            double reamur = input.nextDouble();
            double fahrenheit = (reamur * 9 / 4) + 32;
            System.out.println("Suhu dalam Fahrenheit : " + fahrenheit);
        } catch (Exception e) {
            System.out.println("Inputan tidak valid");
        }
    }

    static void Reamur_ke_Kelvin() {
        try {
            System.out.print("Masukkan suhu dalam Reamur : ");
            double reamur = input.nextDouble();
            double kelvin = (reamur * 5 / 4) + 273;
            System.out.println("Suhu dalam Kelvin : " + kelvin);
        } catch (Exception e) {
            System.out.println("Inputan tidak valid");
        }
    }

    static void Kelvin_ke_Celcius() {
        try {
            System.out.print("Masukkan suhu dalam Kelvin : ");
            double kelvin = input.nextDouble();
            double celcius = (kelvin - 273);
            System.out.println("Suhu dalam Celcius : " + celcius);
        } catch (Exception e) {
            System.out.println("Inputan tidak valid");
        }
    }

    static void Kelvin_ke_Fahrenheit() {
        try {
            System.out.print("Masukkan suhu dalam Kelvin : ");
            double kelvin = input.nextDouble();
            double fahrenheit = (kelvin - 273) * 9 / 5 + 32;
            System.out.println("Suhu dalam Fahrenheit : " + fahrenheit);
        } catch (Exception e) {
            System.out.println("Inputan tidak valid");
        }
    }

    static void Kelvin_ke_Reamur() {
        try {
            System.out.print("Masukkan suhu dalam Kelvin : ");
            double kelvin = input.nextDouble();
            double reamur = (kelvin - 273) * 4 / 5;
            System.out.println("Suhu dalam Reamur : " + reamur);
        } catch (Exception e) {
            System.out.println("Inputan tidak valid");
        }
    }

    static void Menu() {
        System.out.println("------------------------");
        System.out.println("1. Celcius ke Fahrenheit");
        System.out.println("2. Celcius ke Kelvin");
        System.out.println("3. Fahrenheit ke Celcius");
        System.out.println("4. Fahrenheit ke Kelvin");
        System.out.println("5. Kelvin ke Celcius");
        System.out.println("6. Kelvin ke Fahrenheit");
        System.out.println("7. Reamur ke Celcius");
        System.out.println("8. Celcius ke Reamur");
        System.out.println("9. Reamur ke Fahrenheit");
        System.out.println("10. Fahrenheit ke Reamur");
        System.out.println("11. Reamur ke Kelvin");
        System.out.println("12. Kelvin ke Reamur");
        System.out.println("13. Exit");
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Pilih :  ");
            try {
                switch (input.nextInt()) {
                    case 1:
                        Celcius_ke_Fahrenheit();
                        break;
                    case 2:
                        Celcius_ke_Kelvin();
                        break;
                    case 3:
                        Fahrenheit_ke_Celcius();
                        break;
                    case 4:
                        Fahrenheit_ke_Kelvin();
                        break;
                    case 5:
                        Kelvin_ke_Celcius();
                        break;
                    case 6:
                        Kelvin_ke_Fahrenheit();
                        break;
                    case 7:
                        Reamur_ke_Celcius();
                        break;
                    case 8:
                        Celcius_ke_Reamur();
                        break;
                    case 9:
                        Reamur_ke_Fahrenheit();
                        break;
                    case 10:
                        Fahrenheit_ke_Reamur();
                        break;
                    case 11:
                        Reamur_ke_Kelvin();
                        break;
                    case 12:
                        Kelvin_ke_Reamur();
                        break;
                    case 13:
                        System.exit(0);
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
                System.out.println("Inputan tidak valid");
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
            Nomer5.Menu();
        }
    }
}
