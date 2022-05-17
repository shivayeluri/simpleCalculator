package logic;

public class Multiplication {
    public void multiplyingNumbers(String[] inputNumbers){
        float totalSum =1f;
        boolean flag = true;
        try {
            for (String num : inputNumbers) {
                totalSum = Float.parseFloat(String.valueOf(num)) * totalSum;
            }
        }catch (Exception e) {
            System.out.println("non int-val");
            flag = false;
        }

        if (flag){
            System.out.println(totalSum);
        }

    }
}