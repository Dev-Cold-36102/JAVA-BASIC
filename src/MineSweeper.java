import java.util.Scanner;

public class MineSweeper {
    static String[][] map = {
            {"*", ".", "*", ".", "."},
            {"*", ".", "*", ".", "."},
            {"*", ".", "*", ".", "."},
            {"*", ".", "*", ".", "."},
            {"*", ".", "*", ".", "."},
    };
    public static void main(String[] args) {

        System.out.println("result:");

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                String element = map[i][j];
                int count=0;
                if (element == "*") {
                    System.out.print("* ");
                }
                if (i==0) {

                }
            }
        }
    }

    public static void goctrai(int i,int j,int count) {
        if (map[i][j+1]=="*") {
            count++;
        }
        if (map[i+1][j]=="*") {
            count++;
        }
        if (map[i+1][j+1]=="*") {
            count++;
        }
    }
    public static void gocphai(int i,int j,int count) {
        if (map[i][j-1]=="*") {
            count++;
        }
        if (map[i+1][j]=="*") {
            count++;
        }
        if (map[i+1][j-1]=="*") {
            count++;
        }
    }
}
