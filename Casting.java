class Casting {
    public static void main(String args[]) {
        // byte had max value 127
        // byte is smaller data
        // int is bigger data
        // can't assign int value to byte (whatever the int value may be, datatype
        // matters)
        // but byte value can be assigned to int
        // In one way int can be converted to byte by casting (explicit)

        byte b = 122;
        int a = 34;
        System.out.println(b = (byte) a);

        // also float can be converted to int, unless explicit casting data conversion
        // happens
        // when float is convered to int explicitly, it rounded off automatically
        // (eg.5.6 to 5)

        float f = 5.6f;
        int s = 4;
        System.out.println(s = (int) f);
    }
}
