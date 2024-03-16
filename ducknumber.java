/*Duck number is number which contain atlist one 0 */

public class ducknumber {
     public static void main(String[] args) {
        
int n=2108;
while(n>0){
    int rem=n%10;
    if(rem==0){
        System.out.println("duck number");
        break;
    }
n=n/10;
}
if(n==0){
    System.out.println("not duck number");
}

}
}
/*output:
duck number
*/