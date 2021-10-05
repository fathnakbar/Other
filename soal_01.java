import java.util.ArrayList;
import java.util.Scanner;

/**
 * soal_01, program ini menghitung hasil dari tabungan jika setiap hari
 * Jumlah uang yang ditabung sama yaitu X sampai hari ke N
 */
public class soal_01 {
    public static void main(String[] args) {
        Scanner system = new Scanner(System.in);
        
        String raw_input = system.nextLine();
        system.close();
        ArrayList<Integer> input = new ArrayList<Integer>(2);

        input.add(Integer.parseInt(raw_input.split(" ")[0]));
        input.add(Integer.parseInt(raw_input.split(" ")[1]));

        System.out.println( input.get(0) * input.get(1) );

    }
    
}