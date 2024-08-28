import java.sql.SQLOutput;

/**
 * The Riddler:
 * A puzzle by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: YOUR NAME HERE
 */
public class Riddler {

    public String decryptOne(String encrypted) {
        String decrypted = "";
        // TODO: Complete the decryptOne() function.
        //Shift everything to the right 9
        for(int i = 0; i < encrypted.length(); i++){
            if(encrypted.charAt(i) > 64){
                char filler = encrypted.charAt(i);
                int gap;
                if(filler > 96){
                    if(filler + 9 > 122){
                        gap = filler + 9 - 122;
                        filler = (char)(96 + gap);
                    }
                    else{
                        filler = (char)(filler + 9);
                    }
                }
                if(filler < 91){
                    if(filler + 9 > 90){
                        gap = filler + 9 - 90;
                        filler = (char)(64 + gap);
                    }
                    else{
                        filler = (char)(filler + 9);
                    }
                }
                decrypted += filler;
            }
            else{
                decrypted += encrypted.charAt(i);
            }

        }
        System.out.println(decrypted);
        return decrypted;
    }

    public String decryptTwo(String encrypted) {
        String decrypted = "";
        int counter = 0;
        decrypted = "";
        //Seperate ASCII Numbers
        for(int i = 0; i < encrypted.length(); i++){
            if(encrypted.charAt(i) != ' '){
                counter++;
            }
            //Turn ASCII into Chars
            else{
                String filler = "";
                for(int j = i-counter; j < i; j++){
                    filler += encrypted.charAt(j);
                }
                if(filler != ""){
                    int num = Integer.parseInt(filler);
                    char filler2 = (char)(num);

                    decrypted += filler2;

                }
                counter = 0;
            }

        }
        // TODO: Complete the decryptTwo() function.
        System.out.println(decrypted);
        return decrypted;
    }

    public String decryptThree(String encrypted) {
        String decrypted = "";
        int value = 0;
        for(int i = 0; i < encrypted.length();i++){
            if((i+1) % 8 == 0 ){
                //Get Binary
                for(int j = 0; j < 8; j++){
                    int placehold = encrypted.charAt(i - j);
                    if(placehold == 48){
                        placehold = 0;
                    }
                    if(placehold == 49){
                        placehold = 1;
                    }
                    //Turn Binary into Base 10
                    value += (placehold * (int) Math.pow(2,j));

                }
                //Turn ASCII into Characters
                decrypted += (char) value;
                value = 0;
            }
        }
        // TODO: Complete the decryptThree() function.
        System.out.println(decrypted);
        return decrypted;
    }

    public String decryptFour(String encrypted) {
        String decrypted = "";
        int value = 0;
        for(int i = 0; i < encrypted.length(); i++)
        {
            //Turn Symbol into Hex
            value = encrypted.charAt(i);
            String hex = Integer.toHexString(value);
            //Turn Hex into Base 10
            for(int j = 0; j < hex.length(); j++){
                int num = Integer.valueOf(hex.charAt(hex.length()-j-1));
            }
            System.out.println(hex);
        }
        // TODO: Complete the decryptFour() function.
        System.out.println();
        return decrypted;
    }
}
