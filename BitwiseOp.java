public class BitwiseOp {

    // 1 check odd even
    public static void oddOrEven(int n){
        int bitmask = 1;
        if((n & bitmask) == 1){
            System.out.println("odd number");
        } else{
            System.out.println("even number");
        }
    }

    // 2 get ith bit
    public static int getIthBit(int n, int i){
        int bitmask = 1<<i;
        if((n & bitmask) == 0){
            return 0;
        } else{
            return 1;
        }
    }

    // 3 set ith bit - convert ith bit into 1
    public static int setIthBit(int n,int i){
        int bitmask = 1<<i;
        return n|bitmask;
    }

    // 4 clear ith bit - make 0 
    public static int clearIthBit(int n,int i){
        int bitmask = ~(1<<i);
        return n&bitmask;
    }

    // 5 update ith bit 
    public static int updateIthBit(int n, int i, int newBit){
        n = clearIthBit(n, i);
        int bitmask = newBit<<i;
        return n|bitmask;
    }

    // 6 clear ith bit
    public static int clearIBits(int n, int i){
        int bitmask = (~0)<<i;   // or (-1)<<i
        return n & bitmask;
    }

    // 7 clear range of bits
    public static int clearRange(int n, int i, int j){
        int a = (~0) << (j+1);
        int b = (1<<i)-1;
        int bitmask = a|b;
        return n & bitmask;
    }

    // 8 check no.if it is power of 2 or not
    public static boolean isPowerOfTwo(int n) {
        return (n & (n-1)) == 0;
    }

    // 9 count set (bits set bits=1)
    public static int countSetBits(int n) {
        int count = 0;
        while(n > 0){
            if((n & 1) == 1){ // check LSB 
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    // fast Exponentiation 
    public static int fastExpo(int a, int n){
        int ans = 1;
        while(n >0){
            if((n & 1) == 1){
                ans = ans * a;
            }
        a = a*a;
        n = n >> 1;
        }
        return ans; 
    }

    public static void main(String...arg){
        
        // 1
        // oddOrEven(4);
        // oddOrEven(999);
        // oddOrEven(90);
        
        // 2
        // System.out.println(getIthBit(7, 2));
        // 3
        // System.out.println(setIthBit(10, 2));
        // 4
        // System.out.println(clearIthBit(10, 1));
        // 5
        //System.out.println(updateIthBit(10, 2, 1));
        // 6 
        //System.out.println(clearIBits(15, 2));
        // 7
        //System.out.println(clearRange(10, 2, 4));
        // 8
        //System.out.println(isPowerOfTwo(32));
        // 9
        //System.out.println(countSetBits(10));
        // 10
        //System.out.println(fastExpo(3, 5));

        // Uppercase --> lower case
        // for(char ch='A'; ch<='Z'; ch++){
        //     System.out.print((char)(ch | ' ')); // (ch ^ ' ')
        // }
        
    }
    
}
