package day1;

public class SecondBigNum {
    public static void main(String[] args) {

//        int arr[]={12,35,1,10,34,1};
//        int big1=0, big2=0, pos=0;
//        big1=arr[0];
//
//        for(int i=1; i<arr.length;i++){
//            if(big1<arr[i]){
//                big1=arr[i];
//                pos=i;
//            }
//        }
//
//        for(int j=0; j<arr.length;j++){
//            if(big2<arr[j] && arr[j]!=big1){
//                big2=arr[j];
//            }
//        }
//        System.out.println(big2);
//        System.out.println(big1);

        int temp, size;
        int array[] = {23, 20, 25, 63, 96, 57};
        size = array.length;

        for(int i = 0; i<size; i++ ){
            for(int j = i+1; j<size; j++){

                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("largest number is:: "+array[size-1]);
        System.out.println("Second largest number is:: "+array[size-2]);
        System.out.println("Third second largest number is:: "+array[size-3]);
    }
}
