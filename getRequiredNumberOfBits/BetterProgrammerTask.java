package getRequiredNumberOfBits;


public class BetterProgrammerTask {

    public static int getRequiredNumberOfBits(int N) {
        /*
          Please implement this method to
          return the number of bits which is just enough to store any integer from 0 to N-1 inclusively
          for any int N > 0
          Example: to store 5 integers from 0 to 4 you need 3 bits: 000, 001, 010, 011, 100 and 101
        */
        int numberOfBits = Integer.toBinaryString(N).length();
        return numberOfBits;
    }
}

