package by.nikiforov.junit.lesson1;

public class Numbers {

    public int sum (int num){
        int result = 0;
        for(int i = 0; i <= num; i++){
            result += i;
        }
        return result;
    }
}
