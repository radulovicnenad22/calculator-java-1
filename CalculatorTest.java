import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalculatorTest {

    // Testiramo matematicku funkciju sabiranja brojeva sa prvim izrazom 1+1

    public void testCalculate() {

        String prviizraz = "1+1";
        String ocekivanirezultat = "2.0";
        String izracunatrezultat = Calculator.Run(prviizraz);
        AssertEquals(ocekivanirezultat, izracunatrezultat);

        if (ocekivanirezultat() == izracunatrezultat()) {
            loger.log("Ocekivani rezultat: "+ocekivanirezultat+" Izracunat rezultat: "+izracunatrezultat+" TEST=Bravo majstore!");
        }
        else {
            loger.log("Ocekivani rezultat: "+ocekivanirezultat+" Izracunat rezultat: "+izracunatrezultat+" TEST=Majstore nije dobro!");
        }
    }
  
}
