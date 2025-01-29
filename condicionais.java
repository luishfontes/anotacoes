public class condicionais {
    public static void main(String[] args) {
        byte b = 12;
        byte b2 = 10;
        byte b3 = 7;
        byte b4 = 9;

        if (b > b2) {
            System.out.printf("O número %d é maior que %d%n", b, b2);
        } else {
            System.out.printf("O número %d é maior que %d%n", b2, b);
        }

        if (b3 < b4) {
            System.out.printf("O número %d é menor que %d", b3, b4);
        } else {
            System.out.printf("O número %d é maior que %d", b3, b4);
        }
    }
}
