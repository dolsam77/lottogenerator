package project;

import java.util.Arrays;
import java.util.Random;

public class LottoGenerate {
    private Random random = new Random(System.nanoTime());
    
    public int[] generate(){
        int[] result = new int[6];
        
        for(int i=0;i<6;i++){
            result[i] = random.nextInt(45);
        }
        
        return result;
    }     
    
    public static void main(String args[]){
        int[] result = new LottoGenerate().generate();
        System.out.println(Arrays.toString(result));
    }
}
