package lc476;

public class lc476 {

    public static void main(String[] args) {
        System.out.println(new lc476().findComplement(1));
    }

    public int findComplement(int num) {
        int tmp = num;
        int c = 0;
        while (tmp != 0) {
            tmp >>= 1;
            c = (c << 1) + 1;
        }
        return num ^ c;
    }
}
