package messagepassing_and_coordination;

import java.util.Arrays;

public class ReverseStringll541 {

    public static void main(String[] args) {

        String str = "tcagdo";

        int len = str.length();


        int i = 0;

        int n = 0;

        while (i < len) {


            if (i % 3 == 0) {

                System.out.println(str.charAt(i));
                n++;
            }

            i++;
        }


    }


}


