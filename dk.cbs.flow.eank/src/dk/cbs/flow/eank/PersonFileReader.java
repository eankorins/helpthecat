/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dk.cbs.flow.eank;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author Edgars
 */
public class PersonFileReader extends FileReader{

    public PersonFileReader(String fileName) throws FileNotFoundException {
        super(fileName);
    }
    
    public List<Person> readPeople(){
        try {
            BufferedReader reader = new BufferedReader(this);
            String line = "";
            List<Person> people = new ArrayList<Person>();
            while((line = reader.readLine()) != null){
                String[] data = line.split(",");
                String name = data[0];
                int admin = Integer.parseInt(data[1]);
                int analysis = Integer.parseInt(data[2]);
                int creativity = Integer.parseInt(data[3]);
                int finishing = Integer.parseInt(data[4]);

                Person p = new Person(name, admin, analysis, creativity, finishing);
                people.add(p);
            }
            return people;
        }catch (IOException ex) {return null;}
    }
}
