public class JC_25_Multidimension_array {
    public static void main(String[] args) {
        //This program is about Multidimension of an array

       // int[][] arr= new int[5][5];
        int arr[][]= {{101,102,103},{201,202,203}}; // Declaration and Initializing the 2 dimensional array

        //The method to display the 2 dimensional array

        for(int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        //We can use the same nesting for loop to take input for 2 dimensional array

    }
}
