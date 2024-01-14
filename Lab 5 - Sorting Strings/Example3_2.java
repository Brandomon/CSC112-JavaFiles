//Test Program String Array List

import java.io.*;
import java.util.*;

public class Example3_2
{
    static BufferedReader keyboard = new
           BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException
    {
        UnorderedArrayList stringList =
                             new UnorderedArrayList(50);    //Line 1
        UnorderedArrayList tempList =
                            new UnorderedArrayList();       //Line 2

        StringElement strObject = new StringElement();      //Line 3
        int counter;                                        //Line 4
        int position;                                       //Line 5

        StringTokenizer tokenizer;                          //Line 6

        System.out.println("Line 7: Processing the "
                         + "string list");                  //Line 7
        System.out.print("Line 8: Enter 5 strings on "
                       + "the same line: ");                //Line 8
        System.out.flush();                                 //Line 9

        tokenizer = new
                   StringTokenizer(keyboard.readLine());    //Line 10

        for(counter = 0; counter < 5; counter++)            //Line 11
        {
            strObject.setString(tokenizer.nextToken());     //Line 12
            stringList.insert(strObject);                   //Line 13
        }

        tempList.copyList(stringList);                      //Line 14

        System.out.println();                               //Line 15
        System.out.print("Line 16: The list you "
                       + "entered is: ");                   //Line 16
        stringList.print();                                 //Line 17
        System.out.println();                               //Line 18

        System.out.print("Line 19: Enter the item to "
                       + "be deleted: ");                   //Line 19
        System.out.flush();                                 //Line 20
        strObject.setString(keyboard.readLine());           //Line 21
        System.out.println();                               //Line 22

        stringList.remove(strObject);                       //Line 23
        System.out.println("Line 24: After removing "
                         + strObject
                           + " the list is:");              //Line 24

        stringList.print();                                 //Line 25
        System.out.println();                               //Line 26

        System.out.print("Line 27: Enter the position of "
                       + "the string to be deleted: ");     //Line 27
        System.out.flush();                                 //Line 28
        position = Integer.parseInt(keyboard.readLine());   //Line 29
        System.out.println();                               //Line 30

        stringList.removeAt(position);                      //Line 31
        System.out.println("Line 32: After removing the "
                         + "element at position "
                         + position
                         + ", stringList:");                //Line 32

        stringList.print();                                 //Line 33
        System.out.println();                               //Line 34

        System.out.print("Line 35: Enter the search "
                       + "item: ");                         //Line 35
        System.out.flush();                                 //Line 36

        strObject.setString(keyboard.readLine());           //Line 37
        System.out.println();                               //Line 38

        if(stringList.seqSearch(strObject) != -1)           //Line 39
           System.out.println("Line 40: Item found in "
                            + "the list");                  //Line 40
        else                                                //Line 41
           System.out.println("Line 42: Item not found");   //Line 42

        System.out.print("List 43: tempList: ");            //Line 43
        tempList.print();                                   //Line 44
        System.out.println();                               //Line 45
    }
}

/*    OUTPUT
Line 7: Processing the string list
Line 8: Enter 5 strings on the same line: Hello Winter Spring Summer Fall

Line 16: The list you entered is: Hello Winter Spring Summer Fall

Line 19: Enter the item to be deleted: Hello

Line 24: After removing Hello the list is :
Winter Spring Summer Fall

Line 27: Entered the position of the string to be deletedL 3

Line 32: After removing the element at position 3, stringList:
Winter Spring Summer

Line 35: Enter the search item: Spring

Line 40: Item found in the list
Line 43: tempList: Hello Winter Spring Summer Fall

*/