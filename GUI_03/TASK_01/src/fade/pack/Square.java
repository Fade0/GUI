package fade.pack;

public class Square implements Comparable, Figure{
    //public class Square implements Comparable<Square>, Figure{
    private int length;
    private int number;
    private static int counter = 0;

    public Square(int length) throws TooBigSquareException {
        this.length = length;
        this.number = counter;
        counter++;
        if(length > max){
            System.out.println("length = " + length + " jest wiekszy");
            throw new TooBigSquareException(max);
        }


    }
    public int getArea(){
        return length*length;
    }

    @Override
    public int getPerimeter() {
        return length*4;
    }

    @Override
    public String toString() {
        return "Square (" + number  + ") length = " + length + ", area = " + getArea();
    }

    @Override
    public int compareTo(Object o) {

        return ((Square) o).getArea() - getArea();
        //return o;
    }
}
