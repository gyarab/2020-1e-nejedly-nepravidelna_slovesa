/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

/**
 *
 * @author Vojta
 */
public class Slovicko {

    private String infinitiv;
    private String simple;
    private String participle;
    private String preklad;

    public String getInfinitiv() {
        return infinitiv;
    }

    public String getSimple() {
        return simple;
    }

    public String getParticiple() {
        return participle;
    }

    public String getPreklad() {
        return preklad;
    }

    public Slovicko(String infinitiv, String simple, String participle, String preklad) {
        this.infinitiv = infinitiv;
        this.simple = simple;
        this.participle = participle;
        this.preklad = preklad;
    }

    public boolean isCorrect(String infinitiv, String simple, String participle, String preklad) {
        return infinitiv.equalsIgnoreCase(this.infinitiv)
                && simple.equalsIgnoreCase(this.simple)
                && participle.equalsIgnoreCase(this.participle)
                && preklad.equalsIgnoreCase(this.preklad);
    }
}
