public class ERPSystem {

    User[] users = new User[1000];
    int sizeOfUsers = 0;
    public void addUser(User u){
        users[sizeOfUsers] = u;
        sizeOfUsers++;
    }

    public void printTeacher(){
        for (int i = 0; i < sizeOfUsers; i++) {
            if ( users[i] instanceof Teacher)
                System.out.println(users[i].getUserData());
        }
    }
    public void printStudent(){
        for (int i = 0; i < sizeOfUsers; i++) {
            if ( users[i] instanceof Student)
                System.out.println(users[i].getUserData());
        }
    }

   public void printUser(int index){
        boolean user = false;

       for (int i = 0; i < sizeOfUsers; i++) {
           if (i == index - 1){
               System.out.println(users[i].getUserData());
               user = true;
           }
       }
       if (!user){
           System.out.println("No such user in this index");
       }
   }


}
