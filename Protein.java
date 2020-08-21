public class Protein {
    //this program determins if there is a protein in a strand of DNA
    public static void main(String[] args){
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";
        String dna = dna3;

        //System.out.println(dna.length());
        //System.out.println(dna.indexOf("TGA"));
        //int start = dna.indexOf("A");
        //int end = dna.length();
        //int startEnd = dna.length()-2;
        //System.out.println(dna.indexOf("ATG"));
        //System.out.println(dna.indexOf("ATG")+3);

        if (dna.substring(dna.indexOf("ATG"),dna.indexOf("ATG")+3).equals("ATG") && dna.substring(dna.indexOf("TGA"),dna.indexOf("TGA")+3).equals("TGA") && dna.length() % 3 == 0){
            System.out.println("This is a protein.");
        }
        else{System.out.println("This is not a Protein.");}
    }

}
