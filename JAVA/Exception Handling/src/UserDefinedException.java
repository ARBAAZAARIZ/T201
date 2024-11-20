class IsValidException extends Exception{
    IsValidException(String s){
        super(s);
    }
}


public class UserDefinedException {
    void checkAge(int age) throws IsValidException {
        if(age<17){
            throw new IsValidException("Age must be grater then 17");
        }
        else{
            System.out.println("you are eligible");
        }

    }


    public static void main(String[] args) {
        UserDefinedException test=new UserDefinedException();
        try{
            test.checkAge(19);
        }catch (IsValidException e){
//            System.out.println(e);
            System.out.println("invalid number");
        }

    }

}
