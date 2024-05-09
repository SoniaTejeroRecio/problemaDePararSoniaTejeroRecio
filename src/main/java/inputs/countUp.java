package inputs;

public class countUp {
    private int num;

    public countUp(int num) {
        this.num = num;
    }

    public void displayCountUp() {
        while (num <= 10) {
            System.out.println(num);
            num++;
        }
    }
}