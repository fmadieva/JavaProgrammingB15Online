package day63;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindingCharacterShowedUpAtLeastOnce_V2 {

    public static void main(String[] args) {


        String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signin page , once you signin with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";

       //Set<Character> chars = new HashSet<> (Arrays.asList('A',   ) );

        // 1.  Instead of going through each and every character
        // 2. I want to turn this String into a String array of each character
        String[] eachCharStrArray = str.split("");
        System.out.println("Arrays.toString(eachCharStrArray) = " + Arrays.toString(eachCharStrArray)); // Arrays.toString(eachCharStrArray) = [T, h, e,  , n, e, w,  , l, i, n, k,  , f, o, r,  , j, o, i, n, i, n, g,  , c, l, a, s, s,  , w, i, l, l,  , r, e, q, u, i, r, e,  , y, o, u,  , t, o,  , l, o, g, i, n,  , t, o,  , O, k, t, a, ,,  , i, f,  , i, t,  , a, s, k,  , y, o, u,  , t, o,  , s, i, g, n,  , i, n,  , ,,  , p, l, e, a, s, e,  , j, u, s, t,  , c, l, i, c, k,  , o, n,  , i, t,  , ,,  , i, t,  , w, i, l, l,  , t, a, k, e,  , y, o, u,  , t, o, o,  , O, k, t, a,  , s, i, g, n, i, n,  , p, a, g, e,  , ,,  , o, n, c, e,  , y, o, u,  , s, i, g, n, i, n,  , w, i, t, h,  , O, k, t, a, T, h, e, n,  , y, o, u,  , w, i, l, l,  , b, e,  , a, b, l, e,  , t, o,  , j, o, i, n,  , r, i, g, h, t,  , a, w, a, y, .,  , P, L, E, A, S, E,  , D, O,  , N, O, T,  , T, R, Y,  , T, O,  , R, E, G, I, S, T, E, R,  , ,,  , T, H, E,  , L, I, N, K,  , I, S,  , A, L, R, E, A, D, Y,  , I, N,  , T, H, E,  , E, M, A, I, L, C, l, i, c, k,  , t, o,  , j, o, i, n]

        // 3. then turn it into a List with Arrays.AsList
        List<String> charList = Arrays.asList ( eachCharStrArray );

        // 4.  eventually create a HashSet object by copying everything inside this list
        Set<String> charSet = new HashSet<>(charList); // the meat
        System.out.println("charSet = " + charSet);

        //Set<Character> chars = new HashSet<> (Arrays.asList(   ) );
        //System.out.println("chars = " + chars);





        // THE ONE SHOT WAY OF DOING THIS
        Set<String> charSetShortWay = new HashSet<>(Arrays.asList(str.split("")));
        System.out.println("charSetShortWay = " + charSetShortWay);


    }

}
