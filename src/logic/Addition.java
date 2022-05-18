package logic;

public class Addition {
    public void addingNumbers(String[] inputNumbers){
        float totalSum =0f;
        try {
            for (String num : inputNumbers) {
                totalSum = totalSum + Float.parseFloat(String.valueOf(num));
            }
            System.out.println(totalSum);
        }catch (Exception e) {
            System.out.println("Not a number");
//            flag = false;
        }

    }
}
