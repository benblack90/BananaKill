public class Main {
    /*given a string of uppercase letters, how many times can you remove BANANA from them?*/

    //1 B, 2 N, 3 A

    private static final int NUM_A = 3;
    private static final int NUM_B = 1;
    private static final int NUM_N = 2;

    private static int countBanana(String input) {
        int aCount = 0;
        int bCount = 0;
        int nCount = 0;
        for(int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case 'A':
                    aCount++;
                    break;
                case 'B':
                    bCount++;
                    break;
                case 'N':
                    nCount++;
                    break;
                default:
                    break;
            }
        }
        return Math.min(aCount/NUM_A, Math.min(bCount/NUM_B, nCount/NUM_N));
    }

    public static void main(String[] args) {
        System.out.println(countBanana("NAABXXAN"));
        System.out.println(countBanana("NAANAAXNABABYNNBZ"));
        System.out.println(countBanana("QABAAAWOBL"));
    }
}
