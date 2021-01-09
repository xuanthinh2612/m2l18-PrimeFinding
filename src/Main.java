public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization(100);
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization(100);

        Thread stupid = new Thread(lazyPrimeFactorization);
        Thread smart = new Thread(optimizedPrimeFactorization);

        stupid.start();
        smart.start();
    }
}
