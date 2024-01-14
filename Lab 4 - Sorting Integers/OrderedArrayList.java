public class OrderedArrayList extends UnorderedArrayList
{

    public OrderedArrayList(int size)
    {
       super(size);
    }

    public OrderedArrayList()
    {
       super();
    }

    //Copy constructor
    public OrderedArrayList(OrderedArrayList otherList)
    {
       super(otherList);
    }

    //Method to sort the items from the list.
    //The parameter compareTo specifies the item to
    //be compared to the other items within the array.
    //Postcondition: If compareTo turns out greater than 1, its
    //               position is swapped within the list with
    //               the lesser item within the array.
    public void sort()
    {
      int loc;             //Location within the array
      int loc2;            //Location of inner loop within the array
      int small;           //Smallest of the compared items
      DataElement temp;    //Temporary variable to store value
      
      if(length == 0)
      {
         System.err.println("Cannot sort an empty list.");
      }
      else
      {
         for (loc = 0; loc < (length - 1); loc++)
         {
            small = loc;
            for (loc2 = (loc + 1); loc2 <= (length - 1); loc2++)
            {
               if (list[loc2].compareTo(list[small]) < 0)
               {
                  small = loc2;
               } //end if
            } //end for innerLoop
            
            //Swap items within array using temp data element
            temp = list[loc];
            list[loc] = list[small];
            list[small] = temp;
            
         } //end for outerLoop
         
      } //end if

   } //end sort
    
} //end UnorderedArrayList