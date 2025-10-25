public class AbbreviatedOperators {

    public static void main(String[] args) {

        int result = 1;
        result = result + 1;
        System.out.println("result = " + result);

        result = 1;
        result++;
        System.out.println("result = " + result);

        result = 1;
        result += 1;
        System.out.println("result = " + result);

        result = 1;
        result--;
        System.out.println("result = " + result);

        result = 1;
        result -= 1;
        System.out.println("result = " + result);

        result = 1;
        result += 5;
        System.out.println("result = " + result);

        result = 10;
        result -= 9;
        System.out.println("result = " + result);

        result = 10;
        result -= 5.5;  //x = x - y --> x = (data type of x) (x - y)
        System.out.println("result = " + result);

        double doubleResult = 10;
        doubleResult -= 5.5;
        System.out.println("doubleResult = " + doubleResult);

        doubleResult = 10;
        doubleResult *= 1.5;
        System.out.println("doubleResult = " + doubleResult);

        doubleResult = 10;
        doubleResult /= 1.5;
        System.out.println("doubleResult = " + doubleResult);

    }

}
