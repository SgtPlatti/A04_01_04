import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A04_01_04 {

    public static void main(String[] args) throws IOException {

        var reader = new BufferedReader(new InputStreamReader(System.in));
        /*
        //Aufgabe 7
        String bin = "";
        String bin1 = "";
        String[] led = {"○", "○", "○", "○", "○", "○", "○", "○"};
        int zahl = 0;
        boolean valid = false;
        while (valid == false) {
            System.out.println("Zahl eingeben:");
            zahl = Integer.parseInt(reader.readLine());
            if (zahl > 255 || zahl < 0) System.out.println("Nee Mann, mach nomma");
            else valid = true;
        }

        for (int i = 0; i <= zahl; i++) {
            bin = Integer.toBinaryString(zahl - (zahl - i));
            bin1 = String.format("%8s", bin);
            for (int j = 0; j < led.length; j++) {
                if (bin1.charAt(j) == '1') led[j] = "⏺";
                else led[j] = "○";
            }
            System.out.println(i + ": " + Arrays.toString(led));
        }
    */
/*
        //Aufgabe 8
        int[] counts = new int[6];
        int roll = 0;
        for (int i = 0; i < 5000; i++){
            roll = (int) (Math.random() * 6 + 1);
            switch (roll) {
                case 1 : counts[0]++; break;
                case 2 : counts[1]++; break;
                case 3 : counts[2]++; break;
                case 4 : counts[3]++; break;
                case 5 : counts[4]++; break;
                case 6 : counts[5]++; break;
                default : System.out.println("Da stimmt wat nich..."); break;
            }
        }
        for (int j = 0; j < 6; j++){
            System.out.println("Die " + (j + 1) + " wurde " + counts[j] + " Mal gewürfelt.");
        }
        */

        //Aufgabe 9
        System.out.println("Obergrenze eingeben:");
        int obergrenze = Integer.parseInt(reader.readLine());
        int[] zahlen = new int[obergrenze - 1];

        for (int i = 0; i < obergrenze - 1; i++) {
            zahlen[i] = i + 2;
        }

        for (int j = 0; j < obergrenze - 1; j++) {
            for (int z = 2; z < Math.sqrt(obergrenze); z++) {
                if (zahlen[j] != 0 && zahlen[j] != z) {
                    if (zahlen[j] % z == 0) {
                        zahlen[j] = 0;
                    }
                }
            }
        }
        System.out.println("Alle Primzahlen bis " + obergrenze + " sind:");
        for (int o = 0; o < zahlen.length; o++) {
          if (zahlen[o] != 0)
            System.out.println(zahlen[o]);
        }
    }
}
//⏺○