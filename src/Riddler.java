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
        for(int i = 0; i < encrypted.length(); i++){
            if(encrypted.charAt(i) != ' '){
                counter++;
            }
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

        // TODO: Complete the decryptThree() function.
        System.out.println();
        return decrypted;
    }

    public String decryptFour(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptFour() function.

        return decrypted;
    }
}
