package logic;

public class Division {
    public void divideNumbers(String[] inputNumbers){
        try {
            System.out.println((float) Integer.parseInt(inputNumbers[0]) / Integer.parseInt(inputNumbers[1]));
        }catch ( NumberFormatException e) {
            System.out.println("Not a number");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid number of inputs");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}