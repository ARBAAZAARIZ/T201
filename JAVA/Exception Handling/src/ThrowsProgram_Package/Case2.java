package ThrowsProgram_Package;

public class Case2 {
    public static void main(String[] args) {
        try {
            throw new Exception();
        }catch (Exception e){
            System.out.println(e);
        }
//        throw new Error();  error in runtime to as it will leat to ANT so to handle this error we can use
//        throws keyword or handle my self
        try {
            throw new Error();
        }catch (Throwable e){
            System.out.println(e);
        }

    }



}
