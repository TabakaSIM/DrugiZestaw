package pl.tabaka.dwudziestyMaja;

/*
Given a string, does "xyz" appear in the middle of the string?
To define middle, we'll say that the number of
chars to the left and right of the "xyz" must differ by at most one.
This problem is harder than it looks.

xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
*/

public class StringZad2 {
    public static void main(String[] args) {
        System.out.println(xyzMiddle("xyzz"));
        System.out.println(xyzMiddle("AAxyzBB"));
        System.out.println(xyzMiddle("AxyzBB"));
        System.out.println(xyzMiddle("AxyzBBB"));
        System.out.println(xyzMiddle("AxyzBBBB"));
    }
    public static boolean xyzMiddle(String string){
        if(string.length()<3) return false;
        int middleIndex;
        if(string.length()%2!=0){
            middleIndex=(string.length()+1)/2;
            return (string.charAt(middleIndex-2)=='x' & string.charAt(middleIndex-1)=='y' & string.charAt(middleIndex)=='z');
        } else {
            middleIndex=string.length()/2;
            boolean found=false;
            if(string.charAt(middleIndex)=='y'){
                found=true;
            }
            if(!found & string.charAt(middleIndex-1)=='y'){
                middleIndex--;
                found=true;
            }
            return (found & string.charAt(middleIndex-1)=='x' & string.charAt(middleIndex+1)=='z');
        }
    }
}
