public class Main {

    public static void main(String[] args) {

        UserToUser userToUser = new UserToUser();
        System.out.println(userToUser.makeEmail());

        UserToNonUser userToNonUser = new UserToNonUser();
        System.out.println(userToNonUser.makeEmail());


    }

}
