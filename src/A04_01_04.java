import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A04_01_04 {

    public static void main(String[] args) throws IOException {

        var reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Zahl eingeben:");
        int zahl = Integer.parseInt(reader.readLine());
        //String[] led = {"O", "O", "O", "O", "O", "O", "O", "O"};
        String led = "";
        if (zahl > 255 || zahl < 0) System.out.println("Nee Mann, mach nomma");

        else {
          for (int j = 0; j < zahl; zahl++) {
              for (int i = 128; i >= 1; i /= 2) {
                  if (zahl >= i) {
                      zahl -= i;
                      led += "0";
                  } else {
                      led += "o";
                  }

              }// for int i = 128
              System.out.println(led);
          }
        }
    }
}
