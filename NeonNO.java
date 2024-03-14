class NeonNO{
    public static void main (String []args){
        int num= 9;
        int square=num*num;//9*9=81
        int copy1=num;
        int result=0;
        while(square>0){
            int rem=square%10;
            result=result+rem;
            square=square/10;

        }
        System.out.println(result);
        if(result==copy1){
            System.out.println("neon number");
        }
        else{
            System.out.println("not neon number");
        }
    }
}
/*output
 * 9
 * neon number
 */