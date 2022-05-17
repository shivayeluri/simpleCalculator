package logic;

public class Addition {
    public void addingNumbers(String[] inputNumbers){
        float totalSum =0f;
        boolean flag = true;
        try {
            for (String num : inputNumbers) {

                totalSum = totalSum + Float.parseFloat(String.valueOf(num));
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
