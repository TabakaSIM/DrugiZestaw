package pl.tabaka.dwudziestyMaja;

/*
Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters.
Return 0 if there are no digits in the string.
(Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
Integer.parseInt(string) converts a string to an int.)

sumDigits("aa1bc2d3") → 6
sumDigits("aa11b33") → 8
sumDigits("Chocolate") → 0
*/

public class AlgorytmikaZad1 {
    public static void main(String[] args) {
        sumDigits("aa1bc2d3");
        sumDigits("aa11b33");
        sumDigits("Chocolate");
    }
    public static int sumDigits(String string){
        int sum=0;
        for (char c:string.toCharArray()){
            if(Character.isDigit(c)){
                sum+=Character.getNumericValue(c);
            }
        }
        System.out.println(sum);
        return sum;
    }
}
