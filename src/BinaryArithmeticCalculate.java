
public class BinaryArithmeticCalculate {

    public static final String bd = null;

    // =========================================================== //
    // Addition Binary
    public static int binaryAdd(int a1, long a2) {

        int i = 0, carry = 0;
        // This is to hold the output binary number
        int[] sum = new int[10];

        while (a1 != 0 || a2 != 0) {
            sum[i++] = (int) ((a1 % 10 + a2 % 10 + carry) % 2);
            carry = (int) ((a1 % 10 + a2 % 10 + carry) / 2);
            a1 /= 10;
            a2 /= 10;
        }
        if (carry != 0) {
            sum[i++] = carry;
        }
        ++i;

        System.out.print("\n\t\tFir_Bin + Sec_Bin = ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");

        return 0;
    } // end BinaryAdd

    // =========================================================== //
    // multiply Binary
    public static int multiplyBinary(long a1, long a2) {
        long multiply = 0;
        int digit, factor = 1;

        while (a2 != 0) {
            digit = (int) (a2 % 10);
            if (digit == 1) {
                a1 = a1 * factor;
                multiply = binaryProduct((int) a1, (int) multiply);
            } else {
                a1 = a1 * factor;
            }
            a2 = a2 / 10;
            factor = 10;
        }
        System.out.print("\t\tFir_Bin x Sec_Bin = " + multiply + "\n");
        return 0;
    }

    static int binaryProduct(long a1, int a2) {
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        int bin_prod_result = 0;

        // actual multiplying process-heart of this program
        while (a1 != 0 || a2 != 0) {
            sum[i++] = (int) ((a1 % 10 + a2 % 10 + remainder) % 2);
            remainder = (int) ((a1 % 10 + a2 % 10 + remainder) / 2);
            a1 = a1 / 10;
            a2 = a2 / 10;
        }
        if (remainder != 0) {
            sum[i++] = remainder;
        }
        --i;
        // forming the result
        while (i >= 0) {
            bin_prod_result = bin_prod_result * 10 + sum[i--];
        }
        return bin_prod_result;
    }

    // =========================================================== //
    // Binary Division
    public static double divideBinary(double a1, double a2) {
        // handle divisibility by 0
        if (a2 == 0) {
            return Double.MAX_VALUE; // return INFINITY
        }

        // Set range for result [left, right].
        double left = 0.0, right = Double.MAX_VALUE;
        // set accuracy of the result
        double precision = 0.001;
        // store sign of the result
        int sign = 1;

        if (a1 * a2 < 0) {
            sign = -1;
        }
        // make both input numbers positive
        a1 = Math.abs(a1);
        a2 = Math.abs(a2);

        System.out.print("\t\tFir_Bin / Sec_Bin = ");
        while (true) {
            // calculate mid
            double mid = left + ((right - left) / 2);

            if (Math.abs(a2 * mid - a1) <= precision) {
                return mid * sign;
            }
            if (a2 * mid < a1) {
                left = mid;
            } else {
                right = mid;
            }
        } // end while

    } // end binary disvision

    // =========================================================== //
    // Method to find One's complement
    public static String findOnescomplement(StringBuffer str) {

        StringBuffer sbuf = new StringBuffer();
        for (int n = 0; n < str.length(); n++) {

            char c = str.charAt(n) == '1' ? '0' : '1';
            sbuf.append(c);
        }
        return str.toString();
    }
    // =========================================================== //

    // Method to find two's complement
    public static String findTwoscomplement(StringBuffer str) {
        int n = str.length();

        // Traverse the string to get first '1' from
        // the last of string
        int i;
        for (i = n - 1; i >= 0; i--)
            if (str.charAt(i) == '1')
                break;

        // If there exists no '1' concat 1 at the
        // starting of string
        if (i == -1)
            return "1" + str;

        // Continue traversal after the position of
        // first '1'
        for (int k = i - 1; k >= 0; k--) {
            // Just flip the values
            if (str.charAt(k) == '1')
                str.replace(k, k + 1, "0");
            else
                str.replace(k, k + 1, "1");
        }

        System.out.print("\tTwo's Complement is = ");
        // return the modified string
        return str.toString();
    }// end indTwoscomplement

    public static int binaryAdd() {
        return 0;
    }

    public static int multiplyBinary() {
        return 0;
    }
}
