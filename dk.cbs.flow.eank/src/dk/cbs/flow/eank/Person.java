/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dk.cbs.flow.eank;

/**
 *
 * @author Edgars
 */
public class Person {
    private String name;
    private int adminstration;
    private int analysis;
    private int creativity;
    private int finishing;

    public Person(String name, int adminstration, int analysis, int creativity, int finishing) {
        this.name = name;
        this.adminstration = adminstration;
        this.analysis = analysis;
        this.creativity = creativity;
        this.finishing = finishing;
    }

    @Override
    public String toString() {
        return name;
    }
    public String getSaveString(){
        return name + "," + adminstration + "," + analysis + "," + creativity + "," + finishing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAdminstration() {
        return adminstration;
    }

    public void setAdminstration(int adminstration) {
        this.adminstration = adminstration;
    }

    public int getAnalysis() {
        return analysis;
    }

    public void setAnalysis(int analysis) {
        this.analysis = analysis;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public int getFinishing() {
        return finishing;
    }

    public void setFinishing(int finishing) {
        this.finishing = finishing;
    }
    
    
}
