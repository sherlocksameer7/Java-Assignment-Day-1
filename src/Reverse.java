public class Reverse {

    public static void main(String[] args) {

        Integer number = 5678,reverse = 0;

        while (number != 0)
        {
            Integer digit = number % 10;
            reverse = reverse * 10+ digit;
            number = number / 10;
        }
        System.out.println("Reversed Number is "+reverse);
    }
}
