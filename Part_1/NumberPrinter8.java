public class NumberPrinter8 {
    public static void main(String[] args) {
        NumberPrinter8 printer = new NumberPrinter8();
        printer.printEvenNumbers();
        printer.printOddNumbers();
    }

    public void printEvenNumbers() {
        System.out.println("Even numbers from 1 to 20:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }

    public void printOddNumbers() {
        System.out.println("Odd numbers from 1 to 20:");
        for (int i = 1; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}
