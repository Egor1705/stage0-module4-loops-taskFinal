package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int temp = 0;
        for(int i = 1;i<power;i++){
            temp = (int) (numberToPrint*Math.pow(numberToPrint,i));
        }
        System.out.println(temp);

    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
