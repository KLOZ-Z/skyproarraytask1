public class Main {


    public static void task1(){
        System.out.println("\nTask 1");
        int[] array1 = new int[3];
        array1[0]=1;
        array1[1]=2;
        array1[2]=3;
        double[] array2 = {1.57, 7.654, 9.986};
        int[] array3 = {1, 2, 3, 4, 5};
    }
    public static void task2(){
        System.out.println("\nTask 2");
        int[] array1 = new int[3];
        array1[0]=1;
        array1[1]=2;
        array1[2]=3;
        double[] array2 = {1.57, 7.654, 9.986};
        int[] array3 = {1, 2, 3, 4, 5};
        for(int i=0;i<array1.length-1;i++)
            System.out.print(array1[i]+",");
        System.out.print(array1[array1.length-1]);
        System.out.println(" ");
        for(int i=0;i<array2.length-1;i++)
            System.out.print(array2[i]+",");
        System.out.print(array2[array2.length-1]);
        System.out.println(" ");
        for(int i=0;i<array3.length-1;i++)
            System.out.print(array3[i]+",");
        System.out.print(array3[array3.length-1]);
    }

    public static void task3(){
        System.out.println("\nTask 3");
        int[] array1 = new int[3];
        array1[0]=1;
        array1[1]=2;
        array1[2]=3;
        double[] array2 = {1.57, 7.654, 9.986};
        int[] array3 = {1, 2, 3, 4, 5};
        for(int i=array1.length-1;i>0;i--)
            System.out.print(array1[i]+",");
        System.out.print(array1[0]);
        System.out.println(" ");
        for(int i=array2.length-1;i>0;i--)
            System.out.print(array2[i]+",");
        System.out.print(array2[0]);
        System.out.println(" ");
        for(int i=array3.length-1;i>0;i--)
            System.out.print(array3[i]+",");
        System.out.print(array3[0]);
    }

    public static void task4(){
        System.out.println("\nTask 4");
        int[] array3 = {1, 2, 3, 4, 5};
        for(int i=0;i< array3.length;i++)
        {
            if(array3[i] % 2 == 1)
                array3[i]++;
        }
        for(int i=0;i<array3.length;i++)
            System.out.print(array3[i]+" ");
    }


    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
}