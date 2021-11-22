package day1;

public class Javaprograms {


    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,1,2,3};
//        HashSet hs=new HashSet();
//
//        for(int i=0;i<arr.length;i++)
//        {
//            hs.add(arr[i]);
//        }
//        System.out.println(hs);

        int[] arr = {1, 2, 3, 4, 1, 2, 3};
        int size = arr.length;
        int count = 0;
        int index = 0;
        int[] temp = new int[size];
        for (int i = 0; i < size; i++) {
            count = 0;
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count = count + 1;
                    break;
                }
            }
            if (count == 0) {
                temp[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < index; i++) {
            arr[i] = temp[i];
        }
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
        }
    }
}




