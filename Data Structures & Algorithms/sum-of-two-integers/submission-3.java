class Solution {
    public int getSum(int a, int b) {
    int sum =0;
    int carry = 0;

while(b!=0)
{ 
    //The AND operator (a & b) ide
    carry = (a&b)<<1; //  It shifts the carry bits one 
    //position to the left so they can be added to the next
    // significant bit in the next iteration of the while loop.
   sum = a^b; // The XOR operator (a ^ b) a

    a = sum;
    b = carry;
}
return a;
    }
}
