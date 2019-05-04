package factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.print("Select your Engine(1,2 or 3)\n");
        System.out.print("1: BMW Engine\n");
        System.out.print("2: Audi Engine\n");
        System.out.print("3: Mercedes Engine\n");
        System.out.print("Select your engine from the above three : ");

        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        int engineType = Integer.parseInt(bufferedReader.readLine());

        if (engineType == 1 || engineType == 2 || engineType == 3) {
            new Driver().startCar(engineType);
        } else {
            System.out.println("Not a proper engine");
        }

    }
}
