import java.util.Scanner;

public class soal_02 {
    public static void main(String[] args) {
        Scanner raw_input = new Scanner(System.in);
        String nama, usia;

        System.out.print("What is your name? ");
        nama = raw_input.nextLine();

        System.out.print("How old are you? ");
        usia = raw_input.nextLine();

        System.out.printf("Halo, %1s\nTernyata usiamu baru %2s tahun ya!", nama, usia);

        raw_input.close();

    }
}
