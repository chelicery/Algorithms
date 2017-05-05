public class Fibonacci {
    public int fibonacciRekurencja(int n) {
        return n<2? n : fibonacciRekurencja(n - 1) + fibonacciRekurencja(n - 2);
    }
    public int recurent(int n){
        return n<1 ? n : n-1;
    }

    public static void main(String[] args) {
        Fibonacci foo = new Fibonacci();

        System.out.println(foo.fibonacciRekurencja(2));
        
        System.out.println(foo.recurent(5));
    }
}
