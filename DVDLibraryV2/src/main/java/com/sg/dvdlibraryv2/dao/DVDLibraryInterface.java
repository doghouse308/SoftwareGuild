/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibraryv2.dao;

import com.sg.dvdlibraryv2.dto.DVD;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 *
 * @author Paul Peterson
 */
public interface DVDLibraryInterface {

    public void addDVD();
    public DVD searchDVD();
    public List<DVD> displayResults(List<DVD> dvdLib, Predicate<DVD> predicate, Consumer<DVD> consumer);
    public DVD editDVD(DVD dvd);
    public void deleteDVD();
    public void save();
    public void load(String type);
    
    

}
