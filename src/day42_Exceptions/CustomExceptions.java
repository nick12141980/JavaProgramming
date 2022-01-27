package day42_Exceptions;

class NickException extends RuntimeException{

    public NickException(){
       super("Hello");
    }
    public NickException(String message){
       super(message);
    }
}

public class CustomExceptions {

    public static void main(String[] args) {

        throw new NickException();
    }

}
