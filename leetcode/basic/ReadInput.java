package basic;

import java.util.ArrayList;
import java.util.Scanner;

public class ReadInput {

    // 不知道有多少行输入(或者多测试用例）。如果是先获取所有输入，再集中处理，使用ctrl+D结束输入。
    public void read1() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        while (sc.hasNext()) {
            arrayList.add(sc.next()); //nextLine()/next()看情况使用
        }
    }

    // 一行输入
    public void read2() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
    }

    // 输入为0结束输入
    public void read3() {
        Scanner sc = new Scanner(System.in);
        while (sc.nextInt() != 0) {
        }
    }

    // 空行结束输入
    public void read4() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            if (s.equals(""))
                break;

        }
    }

    // 已知有几行输入，将输入转换为List
    public void read5() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();//n表示下面的输入行数
        ArrayList<String> arr = new ArrayList<>();
        while (n-- > 0) {
            arr.add(in.next());
        }
    }

    // 已知有几行输入，将输入转换为Array
    public void read6() {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] array = new int[len];
        for(int i = 0; i < len; i++){
            array[i] = in.nextInt();
        }
    }

    // 输入数据有多组，每组占2行，第一行为一个整数N，指示第二行包含N个实数。
    public void read7() {
        Scanner sc =new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            for(int i=0;i<n;i++){
                int a = sc.nextInt();
            }
        }
    }
}

