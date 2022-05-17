package logic;

public class Modulus {
    public void Modulus(String[] inputNumbers){
        int value = Integer.parseInt(inputNumbers[0]);
        boolean flag = true;
        try {
            for (int numIndex =1; numIndex<=inputNumbers.length-2; numIndex++ ) {
                if(value < Integer.parseInt(inputNumbers[numIndex+1])){
                    value = Integer.parseInt(String.valueOf(value % Integer.parseInt(inputNumbers[numIndex+1])));
                }else{
                    value = Integer.parseInt(String.valueOf(Integer.parseInt(inputNumbers[numIndex+1]) % value));
                }
            }
        }catch (Exception e) {
            System.out.println("non int-val");
            flag = false;
        }

        if (flag){
            System.out.println(value);
        }

    }
}