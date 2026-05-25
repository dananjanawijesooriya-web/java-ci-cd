public class CalculatorTest {
    public static void main(String[] args) {

        Calculator cal=new Calculator();

        if(cal.add(2,3)==5){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }

        if(cal.substract(10,5)==5){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }

        if(cal.multiply(4,5)==20){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }

        if(cal.divide(20,4)==5){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }
    }
    
}