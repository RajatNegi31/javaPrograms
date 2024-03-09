public class num2 {
    
    public static void main(String[] args){

        swap_no(15,50);

        //gcd(3,7);
        //gcd(150,300);
        largest_no(-115,45,35);

    }

    public static void swap_no(int a,int b){

        System.out.println("a=" + a);
        System.out.println("b="+ b);
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("after swap:a" + " " + a);
        System.out.println("after swap:b" + " " + b);
    }

    public static void gcd(int x, int y){

        int gcd=1;

        for(int i=1;i<=x && i<=y;i++){

            if(x%i==0 && y%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);

    }


    public static void largest_no(int x, int y ,int z){


        int temp;

        temp= x>y?x:y;
        int largest=temp>z?temp:z;

        System.out.println(largest);


    }
}
