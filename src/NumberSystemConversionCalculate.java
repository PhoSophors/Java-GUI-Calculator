
/**
 * Number System Conversion
 *
 * 1 -> 3 @param binary / @return
 * 1. binary to decimal
 * 2. binary to octal
 * 3. binary to hexadecimal
 *
 * 4 -> 6 @param octal / @return
 * 4. octal to decimal
 * 5. pctal to binary
 * 6. octal to hexadecimal
 *
 * 7 -> 9 @param decimal / @return
 * 7. decimal to binary
 * 8. decimal to octal
 * 8. binary to hexadecimal
 */
// ====================================================//

public class NumberSystemConversionCalculate { // number system class

    /**
     * binary convert to other number
     *
     * @return
     *         1. binary to decimal
     *         2. binary to octal
     *         3. binary to hexadecimal
     */

    // 1 binary to decimal number
    public static int binary2Decimal(int binary) {

        int decimal = 0;
        int base = 1;

        int temp = binary;

        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;
            decimal += last_digit * base;
            base = base * 2;
        } // end while loop

        System.out.print("\n\tDecimal value is : ");
        // returning the final result
        return decimal;
    } // end 1 biary to decimal

    // =================================================//

    // 2 Binary number convert to Octal number
    public static int binary2Octal(int binary) {

        int octal = 0, decimal = 0, i = 0;

        while (binary != 0) {
            decimal += (binary % 10) * Math.pow(2, i);
            ++i;
            binary /= 10;
        } // end binary while loop
        i = 1;

        while (decimal != 0) {
            octal += (decimal % 8) * i;
            decimal /= 8;
            i *= 10;
        } // end decimal while loop

        System.out.print("\tOctal value is : ");
        // returning the final result
        return octal;
    }// end 2 binary to octal

    // =================================================//

    // 3 binary to hexadecimal
    public static int binary2Hex(int binary) {

        int[] hex = new int[1000];
        int i = 1, j, rem, decimal = 0;

        // process
        while (binary > 0) {
            rem = binary % 2;
            decimal = decimal + rem * i;
            i = i * 2;
            binary = binary / 10;
        } // end while loop binary

        i = 0;

        while (decimal != 0) {
            hex[i] = decimal % 16;
            decimal = decimal / 16;
            i++;
        } // end decimal while loop

        // output to user
        System.out.print("\tHexDecimal value is : ");
        for (j = i - 1; j >= 0; j--) {
            if (hex[j] > 9) {
                System.out.print((char) (hex[j] + 55));
            } // end if of j
            else {
                System.out.print(hex[j]);
            } // end else
        } // end for loop of j
        return binary;
    } // end 3 binary to hexadecimal

    // =================================================//

    /**
     * octal convert to other number
     *
     * @return
     *         4. octal to decimal
     *         5. pctal to binary
     *         6. octal to hexadecimal
     */

    // 4 Octal to decimal number
    public static int octal2Decimal(int octal) {

        int num = octal;
        int decimal = 0;
        int base = 1;

        // let temp = num
        int temp = num;

        // process
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;
            decimal += last_digit * base;
            base = base * 8;
        } // end temp while loop

        System.out.print("\n\tDecimal value is : ");
        // returning the final result
        return decimal;
    } // end 4 octal to Decimal

    // =================================================//

    // 5 octal to binary
    public static int octal2Binary(int octal) {

        int i = 0;
        int decimal = 0;
        int binary = 0;

        while (octal != 0) {
            decimal += (octal % 10) * Math.pow(8, i);
            ++i;
            octal /= 10;
        }

        i = 1;
        while (decimal != 0) {
            binary += (decimal % 2) * i;
            decimal /= 2;
            i *= 10;
        }
        System.out.print("\tBinary value is : ");
        // returning the final result
        return binary;
    } // end 5 octal to binary

    // =================================================//

    // 6 octal to hexDecimal
    public static int octal2Hex(int octal) {

        int decimal = 0, i = 0, rem;
        char[] hexadecimal = new char[20];

        // converting octal to decimal
        while (octal != 0) {
            rem = octal % 10;
            decimal = (int) (decimal + (rem * Math.pow(8, i)));
            i++;
            octal = octal / 10;
        }

        // converting decimal to hexadecimal
        while (decimal != 0) {
            rem = decimal % 16;
            if (rem < 10)
                rem = rem + 48;
            else
                rem = rem + 55;
            hexadecimal[i] = (char) rem;
            i++;
            decimal = decimal / 16;
        }

        // output the hexadecimal value
        System.out.print("\tHexadecimal Value is = ");
        for (i = (i - 1); i >= 0; i--)
            System.out.print(hexadecimal[i]);
        return 0;
    }

    // =================================================//

    /**
     * Deciaml convert to other number
     *
     * @param decimal
     * @return
     *         7. decimal to binary
     *         8. decimal to octal
     *         8. binary to hexadecimal
     */

    // 7 decimal to binary
    public static int decimal2Binary(int decimal) {

        // array to store binary number
        int[] binary = new int[1000];

        // counter for binary array
        int i = 0;
        while (decimal > 0) {
            // storing remainder in binary array
            binary[i] = decimal % 2;
            decimal = decimal / 2;
            i++;
        }

        // printing binary array in reverse order
        System.out.print("\n\tBinary Value is : ");
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binary[j]);

        return 0;

    } // end decimal to binary

    // =================================================//

    // 8 decimal to octal
    public static int decimal2Octal(int decimal) {

        int octal = 0, i = 1;

        // process
        while (decimal != 0) {
            octal += (decimal % 8) * i;
            decimal /= 8;
            i *= 10;
        } // end while loop

        // output to user
        System.out.print("\tOctal value is : ");
        return octal;
    } // end decimal to octal

    // =================================================//

    // 9 decimal to hexadecimal
    public static int decimal2Hex(int decimal) {

        char ch[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        int rem;
        String hexadecimal = "\n";

        // process
        while (decimal != 0) {
            rem = decimal % 16;
            hexadecimal = ch[rem] + hexadecimal;
            decimal = decimal / 16;
        } // end decimal while loop

        // output to user
        System.out.print("\tHexadecimal value is : " + hexadecimal);
        return 0;
    } // end 9 decimal to hexadecimal

    // =================================================//

    /**
     * Hexadecimal number to other number
     *
     * @param hex
     *            10. hexadecimal to Binary
     *            11. hexadecimal to Octal
     *            12. hexadecimal to Decimal
     */

    // 10 hexadecimal to Binary
    public static String hex2Binary(String hex) {
        return hex;

    }

    // =================================================//

    // 11 hexadecimal to Octal
    public static int hex2Octal(String hex) {

        int decimal = 0, rem = 0, i = 0;
        int[] octal = new int[20];
        int len = hex.length();

        for (len = (len - 1); len >= 0; len--) {
            /**
             * The charAt() method returns the character at the specified index in a string.
             * The index of the first character is 0, the second character is 1, and so on.
             */
            rem = hex.charAt(len);

            if (rem >= '0' && rem <= '9')
                rem = rem - 48;

                // if character lies in 'A'-'F' ,
                // converting it to integral 10 - 15 by
                // subtracting 55 from ASCII value. (A = 65)
            else if (rem >= 'A' && rem <= 'F')
                rem = rem - 55;

                // if character lies in 'a'-'f' ,
                // converting it to integral 10 - 15 by
                // subtracting 87 from ASCII value. (a = 97)
            else if (rem >= 'a' && rem <= 'f')
                rem = rem - 87;

            int m = 1;
            // process
            for (int j = 1; j <= i; j++)
                m *= 16;

            decimal = (int) (decimal + (rem * m));
            i++;
        }
        for (i = 0; decimal != 0; decimal /= 8)
            octal[i++] = decimal % 8;

        // output octal value to user
        System.out.print("\n\tOctal Value is = ");
        for (i = (i - 1); i >= 0; i--)
            System.out.print(octal[i]);

        System.out.println("");
        return 0;
    }

    // =================================================//

    // 12 hexadecimal to decimal
    public static int hex2Decimal(String hex) {

        int len = hex.length();
        int base = 1;
        int dec = 0;

        for (int i = len - 1; i >= 0; i--) {
            /**
             * The charAt() method returns the character at the specified index in a string.
             * The index of the first character is 0, the second character is 1, and so on.
             */
            if (hex.charAt(i) >= '0' && hex.charAt(i) <= '9') {
                dec += (hex.charAt(i) - 48) * base;

                // Incrementing base by power
                base = base * 16;
            }
            // if character lies in 'A'-'F' ,
            // converting it to integral 10 - 15 by
            // subtracting 55 from ASCII value. (A = 65)
            else if (hex.charAt(i) >= 'A' && hex.charAt(i) <= 'F') {
                dec += (hex.charAt(i) - 55) * base;

                // Incrementing base by power
                base = base * 16;
            }
            // if character lies in 'a'-'f' ,
            // converting it to integral 10 - 15 by
            // subtracting 87 from ASCII value. (a = 97)
            else if (hex.charAt(i) >= 'a' && hex.charAt(i) <= 'f') {
                dec += (hex.charAt(i) - 87) * base;

                // Incrementing base by power
                base = base * 16;
            }
        }
        // output decimal value
        System.out.print("\tDecimal value is : ");
        // Returning the decimal value
        return dec;
    }

}// end class
