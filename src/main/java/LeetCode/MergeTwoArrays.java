package LeetCode;

/* Merge two arrays sorted */
public class MergeTwoArrays {

    public static void main (String[] args) {
        int[] array1 = {1,4,5,7,9};
        int length1 = array1.length;
        int[] array2 = {2,3,6,8,9};
        int length2 = array2.length;
        int[] merged = new int[length1 + length2];
        int i = 0,j = 0,k = 0;

        while (i < length1 && j < length2) {
            if(array1[i] < array2[j]) {
                merged[k++] = array1[i++];
            } else {
                merged[k++] = array2[j++];
            }
        }
        while(i < length1){
            merged[k++] = array1[i++];
        }
        while(i < length2){
            merged[k++] = array2[j++];
        }

        for(int x = 0; x < length1 + length2; x++) {
            System.out.print(merged[x] + " ");
        }
    }
}
