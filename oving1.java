class oving1 {
    public static void main(String[] args){
        System.out.println(oppgave1(1.5));
        System.out.println(oppgave2(2,30,20));
        System.out.println(oppgave3(9020));
    }
    static String oppgave1(double tommer){
        double centimeter=tommer*2.54;
        return tommer+" tommer er "+centimeter+"cm";
    }
    static String oppgave2(int timer,int minutter, int sekunder){
        int sekTot=0;
        sekTot+=timer*3600;
        sekTot+=minutter*60;
        sekTot+=sekunder;
        return timer+" timer, "+minutter+" minutter og "+sekunder+" sekunder er "+sekTot+" sekunder";
    }
    static String oppgave3(int sekunder){
        int restSek=sekunder;
        int timer=restSek/3600;
        restSek=restSek%3600;
        int minutter=restSek/60;
        restSek=restSek%60;
        //resten av sekunder er resterende sekunder
        return sekunder+" sekunder tilsvarer "+timer+" timer, "+minutter+" minutter og "+restSek+" sekunder";
    }
}

