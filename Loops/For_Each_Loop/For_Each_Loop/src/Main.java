//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /** for each is a special type of for loop desaigned to traverse
         * through the Array objects and collections
         * for(data_type item : collections) {
         *      statements
         * }
         */
        int a[] = {10,20,30,40,50,60,70,80,90,100};

        for (int item : a){
            System.out.println("array of a: " + item);
        }


    }
}