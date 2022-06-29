public class Module2 {
    public void self_help(){
        System.out.println("");
        String shelp[]={"Atomic Habits","The Alchemist","Thinking Fast And Slow","The Four Agreements"};


        System.out.println("The books available in Self-help genre are as follows:");
        for (int i=0; i< shelp.length;i++){

            System.out.println(shelp[i]);

        }


    }


    public void romance(){
        System.out.println("");
        String rom[]={"Wish I Could Tell You","The One You Cannot Have","Can't Quarantine Our Love","The Boy Who Loved",
        "Sorry You're Not My Type"};

        System.out.println("The books available in Romance genre are as follows:");

        for(int j=0; j<rom.length;j++){

            System.out.println(rom[j]);
        }

    }



    public void business(){

        System.out.println("");
        String biz[]={"Influence:The Pysochology Of Persuasion","Fooled By Randomness",
        "Simple Numbers, Straight Talks, Big Profits!","Not Fade Away"};

        System.out.println("The books available in Business genre are as follows:");

        for (int k=0;k< biz.length;k++){

            System.out.println(biz[k]);
        }

    }

    public void authors(){
        System.out.println("");
        String auth[]={"James Clear","Paulo Coelho","Daniel Kahneman","Don Miguel Ruiz","Durjoy Datta","Preeti Shenoy",
        "Sudeep Nagarkar","Robert Cialdini","Nassim Nicholas Taleb","Grag Crabtree","Laurance Shames And Peter Barton"};
        
        System.out.println("The Authors are as follows:");

        for (int k=0;k< auth.length;k++){

            System.out.println(auth[k]);


        }
    }


}