public public class number {
    
    public static void main(String[] args){


        rev_no(123456);

    }

    public static void rev_no(int n){
       int r,rev=0, temp;
        while(n!=0){
             r=n%10;
            rev= rev*10 + r;
            n=n/10;
                }
        System.out.println(rev);

        
    }
}
 
    

