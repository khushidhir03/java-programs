//Write a program to check if the letter 'e' is present in the word 'Umbrella'. 

class umbrella {

    public static void main(String args [] ) {

        String name = "umbrella" ;
        boolean output = false;
    

    for(int i=0; i<(name.length()-1); i++) {

        if (name.charAt(i) == 'e') {

            output = true;
            break;
        }
       
    }

    if (output) {

    System.out.println("e is present in umbrella"); 
    
    }
    else {
        System.out.println(" e is not present in umbrella");
    }

}

}