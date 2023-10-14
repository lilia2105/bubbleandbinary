import java.util.Arrays;
import java.util.Scanner;

public class bubble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число элементов списка: ");
        int n = input.nextInt();
        int [] chisla = new int[n];
        System.out.print("Введите число(-а): ");
        for (int i = 0; i < n; i++) {
            chisla[i] = input.nextInt();
        }

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < chisla.length-1; i++) {
                if(chisla[i] > chisla[i+1]){
                    isSorted = false;

                    buf = chisla[i];
                    chisla[i] = chisla[i+1];
                    chisla[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(chisla));
    }
}

