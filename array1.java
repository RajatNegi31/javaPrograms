public class array1 {
    
    public static void main(String[] args){

        print_array();
        copy_array();



    }

    public static void print_array(){

        int arr1[]={1,2,3,4,5,6, 7,8,9};
        for(int x : arr1){
            System.out.println(x);
        }
    }

    public static void copy_array(){

        int arr2[]={1,2,3,4,5,67,8,9};
        int arrcopy[]=new int[arr2.length];

        for(int i=0;i<arr2.length;i++){
            arrcopy[i]=arr2[i];
        }

        System.out.println("Array original: array2");
        for(int x: arr2){
            System.out.println(x);
        }

        System.out.println("copied array");
        for(int y: arrcopy){
            System.out.println(y);
        }


    }
    
}
