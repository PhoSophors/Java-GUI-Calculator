
/**
 * Storage Converter calculate
 * date : wed, 10 Aug 2022
 * name : Pho SoPhors
 */

/**
 *
 * +====== Description ======+
 * | 1. 1 KB = 1024 Bytes |
 * | 2. 1 MB = 1024 KB |
 * | 3. 1 GB = 1024 MB |
 * | 4. 1 TB = 1024 GB |
 * | 5. 1 PB = 1024 TB |
 * +========================+
 *
 */
public class StorageConverterCalculate {

    /**
     * OPTION 1 Byte to (KB, MB, GB, TB, PB)
     *
     * @return
     */

    // * 1. Byte to Kilobyte
    public static float byte2KB(long numByte) {

        // 1 Bytes = 0.000977 Kilobytes
        // 1 Bytes = 9.77E-4 Kilobytes
        float KB = (float) (9.77 * (Math.pow(10, -4)));
        System.out.print("\n\t\t" + numByte + " Byte = ");
        return numByte * KB;
    }

    // * 2. Byte to Megabyte
    public static float byte2MB(long numByte) {

        // 1 Bytes = 9.537E-7 Megabytes
        float MB = (float) (9.53 * (Math.pow(10, -7)));
        System.out.print("\n\t\t" + numByte + " Byte = ");
        return (float) numByte * MB;
    }

    // * 3. Byte to Gigabyte
    public static float byte2GB(long numByte) {

        // 1 Byte = 9.31e-10
        float GB = (float) (9.31 * (Math.pow(10, -10)));
        System.out.print("\n\t\t" + numByte + " Byte = ");
        return numByte * GB;
    }

    // * 4. Byte to Terabyte
    public static float byte2TB(long numByte) {

        // 1 Byte = 1.0e-12
        float TB = (float) (1.0 * (Math.pow(10, -12)));
        System.out.print("\n\t\t" + numByte + " Byte = ");
        return numByte * TB;
    }

    // * 5. Byte to Petabyte
    public static float byte2PB(long numByte) {

        // 1000 Byte = 1.0e-12
        float PB = (float) (1.0 * (Math.pow(10, -12)));
        System.out.print("\n\t\t" + numByte + " Byte = ");
        return numByte * PB;
    }

    /**
     * OPTION 2. Kilobyte to (B, MB, GB, TB, PB)
     *
     * @param kilobyte
     * @return
     */

    // 6. kb2Byte(long kilobyte) to convert from kilobyte to byte
    public static float KB2B(long kilobyte) {

        // 1 Kilobytes = 1024 Bytes
        float Byte = (float) 1024;
        System.out.print("\n\t\t" + kilobyte + " KB = ");
        return kilobyte * Byte;
    }

    // 7. kb2MB(long kilobyte) to convert from kilobyte to megabyte
    public static float KB2MB(long kilobyte) {

        // 1 Kilobytes = 9.7e-4 Megabytes
        float MB = (float) (9.7 * (Math.pow(10, -4)));
        System.out.print("\n\t\t" + kilobyte + " KB = ");
        return kilobyte * MB;
    }

    // 8. kb2GB(long kilobyte) to convert from kilobyte to gigabyte
    public static float KB2GB(long kilobyte) {

        // 1 Kilobytes = 9.537e-7 gigabyte
        float GB = (float) (9.537 * (Math.pow(10, -7)));
        System.out.print("\n\t\t" + kilobyte + " KB = ");
        return kilobyte * GB;
    }

    // 9. kb2TB(long kilobyte) to convert from kilobyte to terabyte
    public static float KB2TB(long kilobyte) {

        // 1 Kilobytes = 9.31e-10 Terabytes
        float TB = (float) (9.31 * (Math.pow(10, -10)));
        System.out.print("\n\t\t" + kilobyte + " KB = ");
        return kilobyte * TB;
    }

    // 10. kb2PB(long kilobyte) to convert from kilobyte to petabyte
    public static float KB2PB(long kilobyte) {

        // 1 Kilobyte = 1.0e-12
        float PB = (float) (1.0 * (Math.pow(10, -12)));
        System.out.print("\n\t\t" + kilobyte + " KB = ");
        return kilobyte * PB;
    }

    /**
     * option 3  Megabyte to (B, KB, GB, TB, PB)
     *
     * @param megabyte
     * @return
     */

    // 11. mb2Byte(long megabyte) to convert from megabyte to byte
    public static float MB2B(long megabyte) {

        // 1 Megabytes = 1048576 Bytes
        long Byte = 1048576L;
        System.out.print("\n\t\t" + megabyte + " MB = ");
        return megabyte * Byte;
    }

    // 12. mb2KB(long megabyte) to convert from megabyte to kilobyte
    public static float MB2KB(long megabyte) {

        // 1 Megabytes = 1024 Kilobytes
        float KB = (float) 1024;
        System.out.print("\n\t\t" + megabyte + " MB = ");
        return megabyte * KB;
    }

    // 13. mb2GB(long megabyte) to convert from megabyte to gigabyte
    public static float MB2GB(long megabyte) {

        // 1 Megabytes = 9.76E-4 Gigabytes
        float GB = (float) (976 * (Math.pow(10, -5)));
        System.out.print("\n\t\t" + megabyte + " MB = ");
        return megabyte * GB;
    }

    // 14. mb2TB(long megabyte) to convert from megabyte to terabyte
    public static float MB2TB(long megabyte) {

        // 1 Megabytes = 9.537E-7 Terabytes
        float TB = (float) (9.537 * (Math.pow(10, -7)));
        System.out.print("\n\t\t" + megabyte + " MB = ");
        return megabyte * TB;
    }

    // 15. mb2PB(long megabyte) to convert from megabyte to petabyte
    public static float MB2PB(long megabyte) {

        // 1 Megabytes = 9.31E-10 Petabytes
        float PB = (float) (9.31 * (Math.pow(10, -10)));
        System.out.print("\n\t\t" + megabyte + " MB = ");
        return megabyte * PB;
    }

    /**
     * option 4 Gigabyte to (B, KB, MB, TB, PB)
     *
     * @param gigabyte
     * @return
     */

    // 16. gb2Byte(long gigabyte) to convert from gigabyte to byte
    public static float GB2B(long gigabyte) {

        // 1 Gigabytes = 1073741824 Bytes
        long Byte = 1073741824L;
        System.out.print("\n\t\t" + gigabyte + " GB = ");
        return gigabyte * Byte;
    }

    // 17. gb2KB(long gigabyte) to convert from gigabyte to kilobyte
    public static float GB2KB(long gigabyte) {

        // 1 Gigabytes = 1048576 Kilobytes
        long KB = 1048576L;
        System.out.print("\n\t\t" + gigabyte + " GB = ");
        return gigabyte * KB;
    }

    // 18. gb2MB(long gigabyte) to convert from gigabyte to megabyte
    public static float GB2MB(long gigabyte) {

        // 1 Gigabytes = 1024 Megabytes
        float MB = (float) 1024;
        System.out.print("\n\t\t" + gigabyte + " GB = ");
        return gigabyte * MB;
    }

    // 19. gb2TB(long gigabyte) to convert from gigabyte to terabyte
    public static float GB2TB(long gigabyte) {

        // 1 Gigabytes = 976e-6 Terabytes
        float TB = (float) (976 * (Math.pow(10, -6)));
        System.out.print("\n\t\t" + gigabyte + " GB = ");
        return gigabyte * TB;
    }

    // 20. gb2PB(long gigabyte) to convert from gigabyte to petabyte
    public static float GB2PB(long gigabyte) {

        // 1 Gigabytes = 9.537e-7 Petabytes
        float PB = (float) (9.537 * (Math.pow(10, -7)));
        System.out.print("\n\t\t" + gigabyte + " GB = ");
        return gigabyte * PB;
    }

    /**
     * option 5 Terabyte to (B, KB, MB, GB, PB)
     *
     * @param terabyte
     * @return
     */

    // 21. tb2Byte(long terabyte) to convert from terabyte to byte
    public static float TB2B(long terabyte) {

        // 1 Terabytes = 1099511627776 Bytes
        long Byte = 1099511627776L;
        System.out.print("\n\t\t" + terabyte + " TB = ");
        return terabyte * Byte;
    }

    // 22. tb2KB(long terabyte) to convert from terabyte to kilobyte
    public static float TB2KB(long terabyte) {

        // 1 Terabytes = 1073741824 Kilobytes
        long KB = 1073741824L;
        System.out.print("\n\t\t" + terabyte + " TB = ");
        return terabyte * KB;
    }

    // 23. tb2MB(long terabyte) to convert from terabyte to megabyte

    public static float TB2MB(long terabyte) {

        // 1 Terabytes = 1048576 Megabytes
        long MB = 1048576L;
        System.out.print("\n\t\t" + terabyte + " TB = ");
        return terabyte * MB;
    }

    // 24. tb2GB(long terabyte) to convert from terabyte to gigabyte
    public static float TB2GB(long terabyte) {

        // 1 Terabytes = 1024 Gigabytes
        long GB = 1024L;
        System.out.print("\n\t\t" + terabyte + " TB = ");
        return terabyte * GB;
    }

    // 25. tb2PB(long terabyte) to convert from terabyte to petabyte
    public static float TB2PB(long terabyte) {

        // 1 Terabytes = 977e-6 Petabytes
        float PB = (float) (9.77 * (Math.pow(10, -4)));
        System.out.print("\n\t\t" + terabyte + " TB = ");
        return terabyte * PB;
    }

    /**
     * option 6 Perabyte to (B, KB, MB, GB, TB)
     *
     * @param petabyte
     * @return
     */

    // 26. pb2Byte(long petabyte) to convert from petabyte to byte
    public static float PB2B(long petabyte) {

        // 1 Petabytes = 1125899906842624 Bytes
        long Byte = 1125899906842624L;
        System.out.print("\n\t\t" + petabyte + " PB = ");
        return petabyte * Byte;
    }

    // 27. pb2KB(long petabyte) to convert from petabyte to kilobyte
    public static float PB2KB(long petabyte) {

        // 1 Petabytes = 1099511627776 Kilobytes
        long KB = 1099511627776L;
        System.out.print("\n\t\t" + petabyte + " PB = ");
        return petabyte * KB;
    }

    // 28. pb2MB(long petabyte) to convert from petabyte to megabyte
    public static float PB2MB(long petabyte) {

        // 1 Petabytes = 1073741824 Megabytes
        long MB = 1073741824L;
        System.out.print("\n\t\t" + petabyte + " PB = ");
        return petabyte * MB;
    }

    // 29. pb2GB(long petabyte) to convert from petabyte to gigabyte
    public static float PB2GB(long petabyte) {

        // 1 Petabytes = 1048576 Gigabytes
        long GB = 1048576L;
        System.out.print("\n\t\t" + petabyte + " PB = ");
        return petabyte * GB;
    }

    // 30. pb2TB(long petabyte) to convert from petabyte to terabyte
    public static float PB2TB(long petabyte) {

        // 1 Petabytes = 1024 Terabytes
        long TB = 1024L;
        System.out.print("\n\t\t" + petabyte + " PB = ");
        return petabyte * TB;
    }
}
