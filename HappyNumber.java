public class HappyNumber {
    public static void main(String []args){
        int num=25;
        int numcopy=num;
        int sum=0;
        while (num>9||sum>9){
            if (num==0){
                num=sum;
                sum=0;
            }
            while (num>0){
                int r=num%10;
                sum+=r*r;
                num=num/10;

            }
            System.out.println(sum);

        }
        if (sum==1){
            System.out.println(numcopy+"is happy number ");
        }
        else{
            System.out.println(numcopy+"is not happy number");

        }
        }
    }
    /*compile time = sucess 
     * run time = sucess
     * 29
     * 85
     * 145
     * 42
     * 20
     * 4
     * 25 is not happy number 
     */

