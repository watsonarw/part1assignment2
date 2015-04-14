/**
 * Created by watsonarw on 14/04/15.
 */
public class Triangle {
    public static void easiestExcersieEver() {
        System.out.println("*");
    }

    public static void horizontalLine(int n) {
        StringBuilder sb = new StringBuilder();
        for( int i = 1 ; i <= n ; i++) {
            sb.append("*");
        }
        System.out.println(sb.toString());
    }

    public static void verticalLine(int n) {
        StringBuilder sb = new StringBuilder();
        for( int i = 1 ; i <= n ; i++) {
            sb.append("*\n");
        }
        System.out.println(sb.toString());
    }

    public static void rightTriangle(int n) {
        StringBuilder sb = new StringBuilder();
        for( int i = 1 ; i <= n ; i++) {
            for( int j = 1 ; j <= i ; j++ ) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
