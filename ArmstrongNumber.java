class ArmstrongNumber{
    public static void main (String []args){
        int number=153;
        int numcopy=number;
        int numcopy1=number;
        int c=0;
        while(number>0)
        {
            c++;
            number =number/10;
        }
        int result=0;
        while (numcopy>0)
        {
            int base= numcopy%10;
            int product=1;
            for (int i=1;i<=c;i++)
            {
                product= product*base;
            }
            numcopy=numcopy/10;
            result=result+product;
        
        }
        if (numcopy1==result)
        {
            System.out.println("the number is armstrong number");

        }
        else {
            System.out.println("the number is not an armstrong number");
            
        }
    }
}