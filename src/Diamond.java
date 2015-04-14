/**
 * Created by watsonarw on 14/04/15.
 */
public class Diamond {

    public static void isoscelesTriangle(int n) {
        StringBuilder sb = new StringBuilder();
        for( int i = 1 ; i <= n ; i++) {
            sb.append(new String(new char[n-i]).replace("\0", " "))
              .append(new String(new char[(2*i)-1]).replace("\0", "*"))
              .append("\n");
        }
        System.out.println(sb.toString());
    }


    public static void diamond(int n) {
        StringBuilder sb = new StringBuilder();
        for( int i = 1 ; i <= n ; i++) {
            sb.append(new String(new char[n-i]).replace("\0", " "))
                    .append(new String(new char[(2*i)-1]).replace("\0", "*"))
                    .append("\n");
        }
        for ( int i = n-1 ; i > 0 ; i-- ) {
            sb.append(new String(new char[n-i]).replace("\0", " "))
                    .append(new String(new char[(2 * i) - 1]).replace("\0", "*"))
                    .append("\n");
        }
        System.out.println(sb.toString());
    }

    public static void diamondWithName(int n) {
        StringBuilder sb = new StringBuilder();
        for( int i = 1 ; i <= n-1 ; i++) {
            sb.append(new String(new char[n-i]).replace("\0", " "))
                    .append(new String(new char[(2 * i) - 1]).replace("\0", "*"))
                    .append("\n");
        }
        sb.append("Andrew\n");
        for ( int i = n-1 ; i > 0 ; i-- ) {
            sb.append(new String(new char[n-i]).replace("\0", " "))
                    .append(new String(new char[(2 * i) - 1]).replace("\0", "*"))
                    .append("\n");
        }
        System.out.println(sb.toString());
    }
}
