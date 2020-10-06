public class driver {
    public static void main(String[] args) {

        //Array
        int[] array= {0,3,8,6,2,1,8};

        //Array sort
        for(int i = 0;i<array.length-1;i++) {
            int min=i;

            for (int x = i+1; x < array.length; x++) {
                 if (array[x] < array[min]) {
                     min = x;
                 }
            }

            int temp = array[min]; 
            array[min] = array[i]; 
            array[i] = temp;
        }
        //Print
           for (int i=0; i<array.length; ++i) 
               System.out.print(array[i]+" "); 

    }

}

