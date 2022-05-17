package logic;


public class Subtraction {
    public void subtractingNumbers(String[] inputNumbers){
        float totalSum = Float.parseFloat(inputNumbers[0]);
        boolean flag = true;
        try {
            for (String num : inputNumbers) {
                totalSum = Float.parseFloat(String.valueOf(num)) - totalSum;
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