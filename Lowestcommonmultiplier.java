/*  4=4,8,12,16
16=16,32
lcm=16
*/

public class Lowestcommonmultiplier{
        public static void main(String[] args) {
int n=4;

int n1=18;
int larg=0;
int small=0;
if(n>n1){
    larg =n;
    small=n1;
}
else{
    larg=n1;
    small=n;
}
int lcm=0;
while (true) {
lcm=lcm+larg; 
   if(lcm%small==0){
    System.out.println("lcm : "+lcm);
    break;
   }
}

}
}
/*output:
lcm : 36
*/