class basic1{

    public static void main(String[] args){


        //fibbo(11);
        
       // prime_no p= new prime_no();
      //  prime_no(31);
        //palindrome(1331);
        factorial(5);
    }

    public static void fibbo(int n){

        int n1=0;
        int n2=1;
        int n3;

        System.out.println(n1);
        System.out.println(n2);

        for(int i=1; i<=n;i++){

            n3=n1+n2;

            n1=n2;
            n2=n3;

            System.out.println(n3);
        }


    }

    public static void prime_no(int b){

        int count=0;
        if(b>0){

            for(int i=2;i<b;i++){
                if(b%i==0){
                    count++;
                }
            }
           if(count==0){
            System.out.println("Prime");
           } 
           else{
            System.out.println("Non-Prime");
           }

        }

        }
    
    public static void palindrome(int n){
        //1221 2442

        int r, rev=0;

        int temp=n;
        while(n>0){

            r=n%10;
            rev= rev*10 + (r);
            n=n/10;
        }

        if(rev==temp){
            System.out.println("palindrome");
        }
        else{
            System.out.println("non-palindrome");
        }
    }
    

    public static void factorial(int n){

        int fact=1;

        for(int i=1; i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);

    }
    

    public static void armstrong(int n){


        int r, sum=0, temp=n;

        while(n!=0){
            r=n%10;
            sum= sum + (r*r*r);
           n=n/10;
        }
        System.out.println(sum);
        

        if(sum==temp){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("not an Armstrong");
        }
    }
}
