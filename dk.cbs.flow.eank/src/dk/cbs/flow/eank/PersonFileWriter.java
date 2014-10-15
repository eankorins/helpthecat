/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dk.cbs.flow.eank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 *
 * @author Edgars
 */
public class PersonFileWriter extends PrintWriter {
   
    public PersonFileWriter(String fileName) throws IOException {
        super(new BufferedWriter(new FileWriter(fileName)));
    }
    
    private void writePerson(Person p)throws IOException{
        this.append(p.getSaveString() + "\n");
        
    }
    public void writePeople(List<Person> people) throws IOException{
        this.write("");
        for(Person p : people){
            writePerson(p);
        }
        this.close();
    }
}
