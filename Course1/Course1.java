package Course1;
public class Course1 {

    public static int larger(int x, int y){
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello");
        // 印出0~9
        int x = 0;
        while (x < 10) {
            System.out.println(x);
            x++;
        }

        // use larger function
        System.out.println(larger(-5, 10));
    }
} 