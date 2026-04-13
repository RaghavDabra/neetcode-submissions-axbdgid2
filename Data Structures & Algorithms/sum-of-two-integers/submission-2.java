class Solution {
    public int getSum(int a, int b) {
    int sum = 0;
    int carry = 0;

    while(b!=0)
    {

carry = (a&b) <<1;
   sum = (a^b);
    
    a = sum;
    b = carry;
    }
    
     return a;
    }
   
}
