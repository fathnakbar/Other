import java.util.Scanner;
import java.util.ArrayList;

/**
 * soal_03, dah dimerge sekarang :)
 */
public class soal_03 {
    public static void main(String[] args) {
        Scanner system = new Scanner(System.in);
        
        String raw_input = system.nextLine();
        system.close();
        ArrayList<Integer> input = new ArrayList<Integer>(2);

        input.add(Integer.parseInt(raw_input.split(" ")[0]));
        input.add(Integer.parseInt(raw_input.split(" ")[1]) + 1);

        System.out.println(input.get(0) / input.get(1));
        System.out.println(input.get(0) % input.get(1));
        
    }
}