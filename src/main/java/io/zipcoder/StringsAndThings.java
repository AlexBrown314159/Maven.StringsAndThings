package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {

// public void main(String[] args) {
    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not
     * an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input){

        String myStr = "";
        Integer iCount = 0;
        String myLet1, myLet2;

        myStr = input.toLowerCase() +  " ";

        for ( Integer i = 0; i < myStr.length() - 1; i++) {
            myLet1 = String.valueOf(myStr.charAt(i));
            myLet2 = String.valueOf(myStr.charAt(i+1));

            if ((myLet1.equals("y")) && (myLet2.equals(" "))) iCount++;

            if ((myLet1.equals("z")) && (myLet2.equals(" "))) iCount++;
        }
//        System.out.println(iCount);
        return iCount;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances
     * of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){

        if (base.contains(remove)) {

            base = base.replaceAll(remove, "");

        }

        return base;

    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input) {

        Boolean myAns = false;

        String strIs = "is";
        String strNot = "not";

        Integer sumIs = 0;
        Integer sumNot = 0;

        int M = strIs.length();
        int N = input.length();

        for (int i = 0; i <= N - M; i++) {

            if (input.charAt(i) == strIs.charAt(0)) {
                if (input.charAt(i + 1) == strIs.charAt(1)) {
                    sumIs = sumIs + 1;
                }
            }
        }

            // =======================================

            M = strNot.length();
            N = input.length();

            for (int i = 0; i <= N - M; i++) {
                if (input.charAt(i) == strNot.charAt(0)) {

                    if (input.charAt(i + 1) == strNot.charAt(1)) {

                        if (input.charAt(i + 2) == strNot.charAt(2)) {
                            sumNot = sumNot + 1;
                        }
                    }
                }
            }

            if (sumIs == sumNot) myAns = true;

            return myAns;
    }

        /**
         * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g'
         * immediately to its left or right.
         * Return true if all the g's in the given string are happy.
         * example : gHappy("xxggxx") // Should return  true
         *           gHappy("xxgxx") // Should return  false
         *           gHappy("xxggyygxx") // Should return  false
         */
        public Boolean gIsHappy (String input){

            String myStr[] = input.split("");
            Boolean Happy = true;

            for (Integer i = 1; i < input.length()-1 ;  i++) {

                if (myStr[i] == "g") {
                    if ((myStr[i-1] != "g") && (myStr[i+1] != "g")) Happy = false;
                }
            }
            return Happy;
        }


        /**
         * We'll say that a "triple" in a string is a char appearing three times in a row.
         * Return the number of triples in the given string. The triples may overlap.
         * example :  countTriple("abcXXXabc") // Should return 1
         *            countTriple("xxxabyyyycd") // Should return 3
         *            countTriple("a") // Should return 0
         */
        public Integer countTriple (String input) {

            String myStr[] = input.split("");
            Integer myAns = 0;

            if (input.length() < 3) {
                myAns = 0;
            }
            else {
                for (Integer i = 0; i < input.length()-2; i++) {
                    if ((myStr[i] == myStr[i+1]) && (myStr[i] == myStr[i+2])) {
                        myAns++;
                    }
                }
            }
            return myAns;
        }

}
