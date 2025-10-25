public class OperatorsOperandsAndExpressions {

    public static void main(String[] args) {

        int result = 1 + 2; //Operator "+" | Operands "1" and "2" | Expression "1 + 2"

        int previousResult = result; //3
        result = result - 1; //2

        System.out.println(previousResult);

        char firstChar = 'A';
        char secondChar = 'B';
        System.out.println(firstChar + secondChar);
        System.out.println("" + firstChar + secondChar);

        result = result * 10;   //20
        result = result / 4;    //5

        result = result % 3;    //2
        
    }

}
