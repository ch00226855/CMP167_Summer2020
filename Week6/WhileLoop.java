public class WhileLoop {

    public static void main(String[] args) {

        // print powers of 2 up to 1024
        // 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024
        int num = 1;
        while (num <= 1024) { // the expression should become false after num=1024
            System.out.println(num);
            num = num * 2; // 1 becomes 2
                            // 2 becomes 4
                            // 4 becomes 8,...
        }
    }
}
