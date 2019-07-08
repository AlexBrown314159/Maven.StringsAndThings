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

        Integer sumIs = 0;
        Integer sumNot = 0;

        for (int i = 0; i < input.length()-1; i++) {

            if ((input.charAt(i) == 'i') && (input.charAt(i + 1) == 's')) {

                sumIs++;

            }
        }

            for (int i = 0; i < input.length()-2; i++) {

                if ((input.charAt(i) == 'n') && (input.charAt(i + 1) == 'o') && (input.charAt(i + 2) == 't')) {

                    sumNot++;

                }
            }

            if (sumIs == sumNot) {
                return true;
            }
            else {
                return false;
            }
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

            Boolean Happy = true;

            for (Integer i = 1; i < input.length()-1 ;  i++) {

                if (input.charAt(i) == 'g') {
                    if ((input.charAt(i-1) != 'g') && (input.charAt(i+1) != 'g')) {
                        Happy = false;
                    }
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

            Integer myAns = 0;

            if (input.length() < 3) {
                return 0;
            }

            for (Integer i = 0; i < input.length() - 2; i++) {

                if ((input.charAt(i+1) == input.charAt(i)) && (input.charAt(i+2) == input.charAt(i))) {
                    myAns++;
                }
            }

            return myAns;
        }

}
