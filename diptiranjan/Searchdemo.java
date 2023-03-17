
class User{
  boolean value= false;
  private String request= " ";
  User( String request)
   {
     value = true;
     this.request= request;
     System.out.println(" user request : " + request);
    }
       
    public String getrequest()
     {
             return this.request;
     }
   }
  
class Google{
     private String request;
     Google(String request)
      {
            this.request = request;
        System.out.println(" google search  " + request);
       }
     }
      
class Searchdemo{
      public static void main(String args[])
       { User search = new User("java");
          if(search.value)
              {
               Google g = new Google(search.getrequest());
              }
            }
         }
