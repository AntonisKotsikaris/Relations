/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relations;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author antoniskotsikaris
 */
public class Relations {

    private long runTimes;
    private int[] myArray;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int times =5;
//
//        System.out.println("For loop:");
//        for (int i = 0; i < times; i++) {
//            System.out.print("Hellow World");
//             if ( i == times - 1) {
//               System.out.print(".");
//            }else if( i % 2 == 0){
//                System.out.print(", ");    
//            }else if( i % 2 == 1){
//                System.out.print("; ");  
//            }
////          
//        }
//        System.out.println();
//
//        int j = 0;
//        System.out.println("While loop:");
//        while (j < times) {
//            System.out.print("Hellow World");
//            if (j == times - 1) {
//                System.out.print(".");
//            } else {
//                System.out.print(", ");
//            }
//            j++;
//        }
//        System.out.println();
//
//        int k = 0;
//        System.out.println("Do-While loop:");
//        do {
//            System.out.print("Hellow World");
//            if (k == times - 1) {
//                System.out.print(".");
//            } else {
//                System.out.print(", ");
//            }
//            k++;
//        } while (k < times);
//        System.out.println();
//        
//        
//        System.out.println("Arrays");
//        int [] arr1 = new int[5];
//        int [] arr2 = new int[]{4, 67, 456, 2, 0};
//        for(int l = 0; l < arr1.length; l++){
//            System.out.println(arr2[l]);
//        }
//        List<Integer> myIntegerList = new ArrayList();
//        myIntegerList.add(23);
//        myIntegerList.add(78);
//        myIntegerList.add(7);
//        myIntegerList.add(34);
//        myIntegerList.add(90);
//        System.out.println(myIntegerList);
//        int[] test = new int []{1,2,3,4};
//        Relations rel = new Relations();
//        int [] newTest = rel.amendArray(test, 8);
//        for( int i = 0; i < newTest.length; i++)
//         System.out.println(newTest[i]);
//        System.out.println("--------------------------");
//        int [] newTest2 = rel.amendArray(newTest, 10);
//        for( int i = 0; i < newTest2.length; i++)
//         System.out.println(newTest2[i]);
//        System.out.println("--------------------------");
//       int [] newTest3 = rel.amendArray(newTest2, 12);
//        for( int i = 0; i < newTest3.length; i++)
//         System.out.println(newTest3[i]);
//         System.out.println("-------------------------");
        String name = "/Tony kotsikaris";
        name = " Nikos Mpellias";
        String name3 = "Antonis".concat(" Kotsikaris");
        String name2 = "My name is:" + name3.substring(0, name3.length());
       // name = name2;
       
        System.out.println(name2 + name );
    }

    private int[] amendArray(int[] arr, int x) {
        
        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        
        }
        newArray[newArray.length-1] = x;
        return newArray;
    }

}
