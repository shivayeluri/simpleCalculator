package logic;

public class Divison {
    public void divideNumbers(String[] inputNumbers){
        int value = Integer.parseInt(inputNumbers[0]);
        try {
            for (int numIndex =1; numIndex<=inputNumbers.length-2; numIndex++ ) {
                if(value > Integer.parseInt(inputNumbers[numIndex+1])){
                    value = Integer.parseInt(String.valueOf(value / Integer.parseInt(inputNumbers[numIndex+1])));
                }else{
                    value = Integer.parseInt(String.valueOf(Integer.parseInt(inputNumbers[numIndex+1]) / value));
                }
            }
            System.out.println(value);
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}