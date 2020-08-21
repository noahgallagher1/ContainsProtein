public class Protein {
    //this program determins if there is a protein in a strand of DNA
    public static void main(String[] args){
        //Three random DNA strands to test.
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";
        
        //Choose which DNA strand you want to analyze here.
        String dna = dna3;

       
        if (dna.substring(dna.indexOf("ATG"),dna.indexOf("ATG")+3).equals("ATG") && dna.substring(dna.indexOf("TGA"),dna.indexOf("TGA")+3).equals("TGA") && dna.length() % 3 == 0){
            System.out.println("This is a protein.");
        }
        else{System.out.println("This is not a Protein.");}
    }

}
