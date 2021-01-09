public class OptimizedPrimeFactorization implements Runnable {
    private int num;

    public OptimizedPrimeFactorization(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = 0; i <= num; i++) {
            if (isPrime(i)) System.out.println("smart " + i);
        }
    }

    private boolean isPrime(int number) {
        if (number < 2) return false;
        if (number == 2 || number == 3) return true;
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
