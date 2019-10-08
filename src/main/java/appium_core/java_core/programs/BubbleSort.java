package appium_core.java_core.programs;

public class BubbleSort
{
    public static void main(String[] args)
    {
       int [] arr = {9, 1, 3, 4, 2, 6, 8, 10, 11, 5, 7, 12,14,13};
       //bubbleSort(arr);
       bubbleSortSecondExample(arr);
       for(int i = 0; i < arr.length; i++)
       {
           System.out.println(arr[i] + " ");
       }
    }
//-------------------------------------------------------//
    public static void bubbleSort(int [] array)
    {
        int length_array = array.length;
        int temp = 0;

        for(int i = 0; i < length_array; i++)
        {
            for(int j = 1; j < (length_array -i); j++)
            {
                if(array[j -1] > array[j])
                {
                    temp = array[j -1];
                    array[j -1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    //------------------------------------------//
    public static void bubbleSortSecondExample(int [] array)
    {
        int temp = 0;

        for(int i = 0; i < array.length; i++)
        {
            for(int j = 1; j < array.length -i; j++)
            {
                if(array[j -1] > array[j])
                {
                    temp = array[j -1];
                    array[j -1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
 //   i
 //(j -1)j
 //   0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
 //   -  -  -  -  -  -  -  -  -  -  -
 //   9  2  4  6  5  7  8  3  1  10 11

 //  0 temp = 9 arr[j -1]
 //  2 arr[j -1] = arr[j]
 //   arr[j] = 9 temp
}
