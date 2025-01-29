public class tipos_de_dados {

    public static void main(String[] args) {
        byte b = 100;
        short s = 1000;
        int i = 100000;
        long l = 100000000L;
        float f = 12.22f;
        double d = 12.222222;
        char c = 'A';
        String str = "Luís";
        boolean bool = true;

        if (bool) {
            System.out.println("Verdadeiro");
            System.out.printf("%d %d %d %d %f %f %c %s %b\n", b, s, i, l, f, d, c, str, bool);
            System.out.println("\nTipo byte: " + b + "\nTipo short: " + s + "\nTipo int: " + i + "\nTipo long: " + l + "\nTipo float: " + f + "\nTipo double: " + d + "\nTipo char: " + c + "\nTipo String: " + str + "\nTipo booleano: " + bool);
        } else {
            System.out.println("Falso");
        }
    }
}