package exam_12Xb_21062025;


public class exam15_primeNumbersfrom1to100 {

    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= 100; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                System.out.print(i + " ");
        }
    }
}
