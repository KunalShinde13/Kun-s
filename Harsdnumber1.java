/*sum of all digits of number
calculate square of sum
if number is completely divide by sum then number is harsd number
 */
public class Harsdnumber1 {

   public static void main(String[] args) {

int n=21;
int copy=n;
int r=0;
while(n>0){
    int rem=n%10;
    r=r+rem;

    n=n/10;
}
if(copy%r==0){
System.out.println("Harsd number");
}
else{
    System.out.println("not harsd number");
}
}
}
/*output:
Harsd number
*/