package be.vives.oop2.javafx;

/**
 * EvenUneven
 */
public class EvenUneven {
    
    private int number = 0;

    public void setNumber(int number){
        this.number = number;
    }

    public String getResult(int number){
        if(number%2 == 0){
            return "The number is even";
        }else{
            return "The number is uneven";
        }
    }
    
}