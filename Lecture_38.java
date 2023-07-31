class Lecture_38
{
   void detectAndRemoveLoop(Node head)
   {
       if(head==null) return;
      Node slow = head;
      Node slow  = head;
     
     while(fast!=null && fast.next!=null)
     {
           slow = slow.next;
           fast = fast.next.next;
          if(slow==fast)
          {
               break;
          }
     }
//Can break of 2 reasons  .either loop not found or loop found
       if(slow==fast)
       {
           slow = head;
           while(slow.next != fast.next)
           {
               slow = slow.next;
               fast = fast.next
           }
//this breaks when fast points to the last element of loop
           fast.next = null;
       }
   }
