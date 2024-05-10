package programas

public class countUp {
    private int num;

    public countUp(int num) {
        this.num = num;
    }

    public void displayCountUp() {
        do {
            System.out.println(num);
            num++;
        } while (num - 1 < 10);
    }
}