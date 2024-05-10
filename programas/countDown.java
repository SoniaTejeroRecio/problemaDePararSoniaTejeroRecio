package programas;

public class countDown {
    private int num;

    public countDown(int num) {
        this.num = num;
    }

    public void displayCountDown() {
        while (num > 0) {
            System.out.println(num);
            num--;
        }
    }
}