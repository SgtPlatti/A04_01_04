import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A04_01_04 {

    public static void main(String[] args) throws IOException {

        var reader = new BufferedReader(new InputStreamReader(System.in));

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

    }
}
