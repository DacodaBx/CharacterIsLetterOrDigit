public class CharacterIs {
    public static void main (String[] args){
        int dacodaBlak1, dacodaBlak2, dacodaBlak3, dacodaBlak4;

        dacodaBlak1 = 2;
        dacodaBlak2 = 48;
        dacodaBlak3 = 110;
        dacodaBlak4 = 250;

        char ch1, ch2, ch3, ch4, ch5, ch6; //Create char primitives

        ch1 = 'A'; //Give char primitives values
        ch2 = '9';
        ch3 = 'e';

        ch4 = '1';
        ch5 = '*';
        ch6 = 'e';

        boolean b1, b2, b3, b4, b5, b6, b7, b8, b9, b10; //Create boolean primitives
        // boolean b7, b8, b9,b10;

        b1 = Character.isLetterOrDigit(ch1);  //Give booleans a measure to weigh
        b2 = Character.isLetterOrDigit(ch2);
        b3 = Character.isLetter(ch3);

        b4 = Character.isLetter(ch4);
        b5 = Character.isLetterOrDigit(ch5);
        b6 = Character.isLetter(ch6);

        b7 = Character.isLetter(dacodaBlak1);
        b8 = Character.isLetter(dacodaBlak2);
        b9 = Character.isLetter(dacodaBlak3);
        b10 = Character.isLetter(dacodaBlak4);
       
        System.out.println(b1);        //Print out boolean
        System.out.println(b2);
        System.out.println(b3);

        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);

        System.out.println(b7);
        System.out.println(b8);
        System.out.println(b9);
        System.out.println(b10);
    }
}
/*Dacoda's Notes:
Is it or is it not a letter or digit?
 */