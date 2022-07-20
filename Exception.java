class IamException extends Exception {
    String msg;
    IamException(String msg) {
        this.msg=msg;
    }
    public String toString() {
        return msg;
    }
}
public class UserDefined {
    public static void main(String[] args) {
        try {
            throw new IamException("Exception");
        } catch (IamException e) {
            System.out.println("This is a user defined message");
            //TODO: handle exception
        }
    }
}