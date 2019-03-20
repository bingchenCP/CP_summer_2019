public class Homework1 {
    public static void main(String[] args) {

        String email = "test.test@gmailcom";

        int indexofAt = email.indexOf('@');
        int lastindexofdot = email.lastIndexOf('.');


        if ((indexofAt < 0) || (lastindexofdot < indexofAt)) {
            System.out.println("This is an invalid email address.");}

        else {
            System.out.println("This is a valid email address");}

    }
}



