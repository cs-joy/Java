public class Wise {
    public static void main(String[] args){
        int a = 5;
        a &= 3;
        System.out.println("a= " + a);
        /* 
         * Bitwise AND Operator
           a	b	a & b
           0	0	0
           0	1	0
           1	0	0
           1	1	1
        */

        int b = 5;
        b |= 3;
        System.out.println("b= " + b);
        /* 
         * Bitwise OR Operator
           a	b	a | b
           0	0	0
           0	1	1
           1	0	1
           1	1	1
        */

        int c = 5;
        c ^= 3;
        System.out.println("c= " + c);
        /* 
         * Bitwise XOR(exclusive) Operator
           a	b	a ^ b
           0	0	0
           0	1	1
           1	0	1
           1	1	0
        */

        int right_shift = 106;
        right_shift >>= 2;
        System.out.println("right shift= " + right_shift);

        int left_shift = 54;
        left_shift <<= 3;
        System.out.println("left shift= " + left_shift);

    }
}