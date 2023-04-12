package Modul3.Tugas3;

public class Refactor {
    //refactor dengan method extract variabel
    /*static boolean isCube(long input){
        double cbrt = Math.cbrt(input);
        long round = Math.round(cbrt);
        return (round*round*round) == input;
    }*/
    //modul
    static boolean isCube(long input){
        double cbrt = Math.cbrt(input);
        long round = Math.round(cbrt);
        return(round*round*round) == input;
    }
}