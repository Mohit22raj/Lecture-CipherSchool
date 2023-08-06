class Lecture40
{
     static boolean ispar(String x)
     {
          int len = x.length();
          if(if len%2 != 0) return false;
         Stack <Character> stack = new Stack<>();

         for(int i=0;i<len;i++)
         {
            char c = x.charAt(i);
            if(c== '{' || c=='{' || c=='(')
            {
                 stack.push(arr[i]);
            }
            else{
                       if(stack.isEmpty()) return false;
                       if(isPair(stack.peek(), c))
                       {
                           stack.pop();
                       }
                       else{
                                  return false;
                              }
                   }
         }
          if(!stack.isEmpty()) retrun false;
          return true;
     }
     static boolean isPair(char a, char b)
     {
            if(a=='{' && b=='}') return true;
            if(a=='[' && b==']') return true;
            if(a=='(' && b==')') return true;
            retrun false;
     }
     
}