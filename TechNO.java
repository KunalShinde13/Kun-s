class TechNO{
    public static void main (String []args){
        int n=123345;
        int t=n;
        int result1=0;
        int count=0;
        while (n>0){
            count++;
            n=n/10;
        }
        if (count%2==0){
            int div=1;
            for(int i=1; i<=count/2;i++){
                div=div*10;
            }
            int f_number= t/div;
            int s_number=t%div;
            System.out .println(f_number);
            System.out.println(s_number);
            int result=f_number+s_number;
            result1=result*result;
            System.out.println(result1);
            if (t==result1){
                System.out .println("tech number ");

            }
            else{
                System.out.println("not tech number");

            }
        }
        else{
            System.out.println ("odd number ");
            
        }

    }
}