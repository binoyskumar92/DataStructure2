/*
A happy number is a number defined by the following process:
        Starting with any positive integer, replace the number by the sum of the squares of its digits,
        and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include
        1. Those numbers for which this process ends in 1 are happy numbers.*/

import java.util.HashSet;

public class HappyNumber {
    HashSet<Integer> set;

    public static void main(String[] args) {
        int num=7;
        HappyNumber obj=new HappyNumber();
        obj.set=new HashSet<>();
        System.out.println(obj.checkHappy(num));
    }

    private boolean isHappyNumber(int num) {
        int sum = 0;
        if (num != 0) {
            StringBuffer buf = new StringBuffer("");
            while (num != 0) {
                sum += Math.pow(num % 10, 2);
                num = num / 10;
            }
            if (sum == 1) {
                System.out.println("happy number");
                return true;
            } else {
                while (sum != 0) {
                    buf.append(sum % 10);
                    sum = sum / 10;
                }
                int squaredSum = Integer.parseInt(buf.reverse().toString());

                if (!set.contains(squaredSum)) {
                    set.add(squaredSum);
                    return isHappyNumber(Integer.parseInt(buf.reverse().toString()));
                }
            }

        }
        return false;
    }
    private boolean checkHappy(int num){
        HashSet<Integer> numberSet= new HashSet<>();
        int sum=0,n=num;
        while(set.add(n)){
            sum=0;
            while(n!=0){
                sum+=Math.pow(n%10,2);
                n=n/10;
            }
            if(sum==1){
                return true;
            }else{
                n=sum;
            }

        }
        return false;

    }

}
