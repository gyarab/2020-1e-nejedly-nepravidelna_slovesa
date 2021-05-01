/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

import java.util.Random;

/**
 *
 * @author Vojta
 */
public class Repository {

    private final Slovicko[] slovicka;
    private int lastIndex;
    private Random nahoda;

    public Repository() {
        this.slovicka = new Slovicko[]{
            new Slovicko("to be", "was,were", "been", "být"),
            new Slovicko("to become", "became", "become", "stát se"),
            new Slovicko("to begin", "began", "begun", "začít"),
            new Slovicko("to bite", "bit", "bitten", "kousnout"),
            new Slovicko("to break", "broke", "broken", "zlomit"),
            new Slovicko("to bring", "brought", "brought", "přinést"),
            new Slovicko("to build", "built", "built", "stavět"),
            new Slovicko("to buy", "bought", "bought", "koupit"),
            new Slovicko("to catch", "caught", "caught", "chytit"),
            new Slovicko("to choose", "chose", "chosen", "vybrat"),
            new Slovicko("to come", "came", "come", "přijít"),
            new Slovicko("to cost", "cost", "cost", "stát"),
            new Slovicko("to do", "did", "done", " dělat"),
            new Slovicko("to draw", "drew", "drawn", "kreslit"),
            new Slovicko("to drink", "drank", "drunk", "pít"),
            new Slovicko("to drive", "drove", "driven", "řídit"),
            new Slovicko("to eat", "ate", "eaten", "jíst"),
            new Slovicko("to fall", "fell", "fallen", "spadnout"),
            new Slovicko("to feel", "felt", "felt", "cítit"),
            new Slovicko("to fight", "fought", "fought", "bojovat"),
            new Slovicko("to find", "found", "found", "najít"),
            new Slovicko("to fly", "flew", "flown", "létat"),
            new Slovicko("to forget", "forgot", "forgotten", "zapomenout"),
            new Slovicko("to forgive", "forgave", "forgiven", "odpustit"),
            new Slovicko("to get", "got", "got", "dostat"),
            new Slovicko("to go", "went", "gone", "jit"),
            new Slovicko("to grow", "grew", "grown", "růst"),
            new Slovicko("to have", "had", "had", "mít"),
            new Slovicko("to hear", "heard", "heard", "slyšet"),
            new Slovicko("to hide", "hid", "hidden", "schovat"),
            new Slovicko("to hurt", "hurt", "hurt", "ublížit"),
            new Slovicko("to keep", "kept", "kept", "držet"),
            new Slovicko("to know", "knew", "known", "vědět"),
            new Slovicko("to leave", "left", "left", "odejít"),
            new Slovicko("to lose", "lost", "lost", "prohrát"),
            new Slovicko("to make", "made", "made", "vytvořit"),
            new Slovicko("to meet", "met", "met", "potkat"),
            new Slovicko("to pay", "paid", "paid", "platit"),
            new Slovicko("to put", "put", "put", "dát"),
            new Slovicko("to read", "read", "read", "číst"),
            new Slovicko("to ride", "rode", "ridden", "jet"),
            new Slovicko("to ring", "rang", "rung", "zvonit"),
            new Slovicko("to run", "ran", "run", "běžet"),
            new Slovicko("to see", "saw", "seen", "vidět"),
            new Slovicko("to say", "said", "said", "říct"),
            new Slovicko("to sell", "sold", "sold", "prodat"),
            new Slovicko("to send", "sent", "sent", "poslat"),
            new Slovicko("to sing", "sang", "sung", "zpívat"),
            new Slovicko("to sit", "sat", "sat", "sednout"),
            new Slovicko("to sleep", "slept", "slept", "spát"),
            new Slovicko("to speak", "spoke", "spoken", "mluvit"),
            new Slovicko("to spread", "spread", "spread", "šířit"),
            new Slovicko("to steal", "stole", "stolen", "krást"),
            new Slovicko("to swim", "swam", "swum", "plavat"),
            new Slovicko("to take", "tok", "taken", "vzít"),
            new Slovicko("to teach", "taught", "taught", "učit"),
            new Slovicko("to tell", "told", "told", "říct"),
            new Slovicko("to think", "thought", "thought", "myslet"),
            new Slovicko("to throw", "threw", "thrown", "hodit"),
            new Slovicko("to understand", "understood", "understood", "rozumět"),
            new Slovicko("to wake up", "woke up", "woken up", "vzbudit"),
            new Slovicko("to wear", "wore", "worn", "nosit"),
            new Slovicko("to win", "won", "won", "vyhrát"),
            new Slovicko("to write", "wrote", "written", "psát")
        };

        nahoda = new Random();

        lastIndex = -1;
    }

    public Slovicko getSlovicko() {
        if (slovicka.length < 2) {
            throw new AssertionError("Pole je moc krátké");
        }
        int nahodCislo = nahoda.nextInt(slovicka.length);
        while (nahodCislo == lastIndex) {
            nahodCislo = nahoda.nextInt(slovicka.length);
        }
        lastIndex = nahodCislo;

        return slovicka[nahodCislo];
    }

}
