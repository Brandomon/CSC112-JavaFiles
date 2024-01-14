//Test Program Integer Array List

import java.io.*;
import java.util.*;

public class Example3_1
{
    static BufferedReader keyboard = new
           BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException
    {
        OrderedArrayList intList = new OrderedArrayList(50);
        UnorderedArrayList temp = new UnorderedArrayList();         //Line 2

        IntElement num = new IntElement();                          //Line 3

        int counter;                                                //Line 4
        int position;                                               //Line 5

        StringTokenizer tokenizer;                                  //Line 6

        System.out.println("Line 7: Processing the "
                          + "integer list");                        //Line 7
        System.out.print("Line 8: Enter 8 integers on the "
                        + "same line: ");                           //Line 8
        System.out.flush();                                         //Line 9

        tokenizer = new StringTokenizer(keyboard.readLine());       //Line 10

        for(counter = 0; counter < 8; counter++)                    //Line 11
        {
            num.setNum(Integer.parseInt(tokenizer.nextToken()));    //Line 12
            intList.insert(num);                                    //Line 13
        }

        temp.copyList(intList);                                     //Line 14

        System.out.println();                                       //Line 15
        System.out.print("Line 16: The list you "
                        + "entered is: ");                          //Line 16
        intList.print();                                            //Line 17
        System.out.println();                                       //Line 18
        intList.sort();
        intList.print();

        System.out.print("Line 19: Enter the num to "
                       + "be deleted: ");                           //Line 19
        System.out.flush();                                         //Line 20
        num.setNum(Integer.parseInt(keyboard.readLine()));          //Line 21
        System.out.println();                                       //Line 22

        intList.remove(num);                                        //Line 23
        System.out.println("Line 24: After removing "
                          + num
                          + " the list is:");                       //Line 24
        intList.print();                                            //Line 25
        System.out.println();                                       //Line 26

        System.out.print("Line 27: Enter the position of "
                       + "the num to be deleted: ");                //Line 27
        System.out.flush();                                         //Line 28
        position = Integer.parseInt(keyboard.readLine());           //Line 29
        System.out.println();                                       //Line 30

        intList.removeAt(position);                                 //Line 31
        System.out.println("Line 32: After removing the "
                          + "element at position "
                          + position
                          + ", intList:");                          //Line 32

        intList.print();                                            //Line 33
        System.out.println();                                       //Line 34

        System.out.print("Line 35: Enter the search "
                        +  "item: ");                               //Line 35
        System.out.flush();                                         //Line 36

        num.setNum(Integer.parseInt(keyboard.readLine()));          //Line 37
        System.out.println();                                       //Line 38

        if(intList.seqSearch(num) != -1)                            //Line 39
           System.out.println("Line 40: Item found in "
                            + "the list");                          //Line 40
        else                                                        //Line 41
           System.out.println("Line 42: Item not found");           //Line 42

        System.out.print("List 43: The list temp: ");               //Line 43
        temp.print();                                               //Line 44
        System.out.println();                                       //Line 45
    }
}

/*    OUTPUT
Line 7: Processing the integer list
Line 8: Enter 8 integers on the same line: 23 54 32 78 27 87 45 66

Line 16: The list you entered is:  23 54 32 78 27 87 45 66

Line 19: Enter the num to be deleted: 32

Line 24: After removing 32 the list is:
23 54 78 27 87 45 66

LIne 27: Enter the position of the number to be deleted: 2

Line 32: After removing the element at position 2, intList:
23 54 27 87 45 66

Line 35: Enter the search item: 23

Line 40: Item found in the list
Line 43: The list temp: 23 54 32 78 27 87 45 66

*/
