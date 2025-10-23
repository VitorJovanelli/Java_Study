public class VariablesKeywordsAndDataType {

    public static void main(String[] args) {
        int myFirstNumber = 5;                  //Declaring a variable with the Type "int", with the name "myFirstNumber" and with the value of "5"

        System.out.println("myFirstNumber");    //Printing the "myFirstNumber" string and not the variable "myFirstNumber
        System.out.println("5");                //Printing a string with "5" as it's content
        System.out.println(myFirstNumber);      //Printing the value of the variable "myFirstNumber", in this case, the value "5"

        myFirstNumber = 10;                     //Changed the value of the variable "myFirstNumber" to "10"
        System.out.println(myFirstNumber);      //Print the new value of the variable "myFirstNumber"

        myFirstNumber = 1000;
        System.out.println(myFirstNumber);

        myFirstNumber = 10 + 5;
        System.out.println(myFirstNumber);

        myFirstNumber = (10 + 5) + (2 * 10);
        System.out.println(myFirstNumber);
    }

}
