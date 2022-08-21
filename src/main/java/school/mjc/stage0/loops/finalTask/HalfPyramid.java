package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {

        for(int i=0; i<cathetusLength; i++)
        {

            // inner loop to handle number spaces
            // values changing acc. to requirement
            for(int j=(cathetusLength-i-2); j>=0; j--)
            {
                // printing spaces
                System.out.print(" ");
            }

            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for(int j=0; j<=i; j++)
            {
                // printing stars
                System.out.print("*");
            }

            // ending line after each row
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
