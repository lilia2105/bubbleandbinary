import java.util.Scanner;

public class binarnyi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину списка: ");
        int length = scanner.nextInt();

        int[] value = new int[length];

        System.out.println("Введите элементы списка в отсортированном порядке:");
        for (int i = 0; i < length; i++) {
            value[i] = scanner.nextInt();
        }

        System.out.print("Введите значение, которое нужно найти(а точнее число, индекс которого мы должны найти): ");
        int valueToFind = scanner.nextInt();

        System.out.println(binarySearch(value, valueToFind));
    }

    private static int binarySearch(int[] values, int valueToFind) {
        int index = -1;
        int low = 0;
        int high = values.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (values[mid] < valueToFind) {
                low = mid + 1;
            } else if (values[mid] > valueToFind) {
                high = mid - 1;
            } else if (values[mid] == valueToFind) {
                index = mid;
                break;
            }
        }

        return index;
    }
}