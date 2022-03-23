package fade.pack;

public class TooBigSquareException extends Exception{
    public TooBigSquareException(int max){
        super("Max length is " + max);
    }
}
