package com.sg.statecapitals2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paul Peterson
 */
public class StateCapitals2 {

    ConsoleIO cio = new ConsoleIO();

    HashMap<String, Capital> stateCapitals = new HashMap();

    String title1 = "State Capitals Lab";
    String title2 = "";
    String[] menuItems = {"Create Capital", "Retrieve Capital",
        "Retrieve All Capitals", "Retrieve Capital by Population", "Update Capital",
        "Delete Capital", "Save File", "Load File", "Exit"};

    //generate and display menu
    public int displayMenu() {
        return cio.displayMenu(title1, title2, menuItems);
    }

    //create new capital entry
    public void addCapital() {
        String state;
        String capital;
        int population = -1;
        double sqMiles = -1;
        state = cio.promptForString("State Name:  ");
        capital = cio.promptForLine("");
        capital += cio.promptForLine("Capital City of " + state + ":  ");
        while (population < 0) {
            population = cio.promptForInt(capital + "'s population:  ");
        }
        while (sqMiles < 0) {
            sqMiles = cio.promptForDouble("Area in square miles of " + capital
                    + ":  ");
        }

        Capital cap = new Capital(capital, population, sqMiles);

        stateCapitals.put(state, cap);
        cio.prompt("");
        cio.prompt("Capital for " + state + " created.");
        cio.prompt("");

    }

    //retrieve capital information for individual state
    public void retrieveCapital() {
        String state = cio.promptForString("State Name:  ");
        Capital cap = new Capital();
        if (stateCapitals.containsKey(state)) {
            cap = stateCapitals.get(state);
        } else {
            cio.prompt("No record for " + state);
            return;
        }
        displayStateData(state, cap);
    }

    //retrieve capital information for all states in HashMap
    public void retrieveAllCapitals(int population) {
        HashMap<String, Capital> result = new HashMap();
        Capital cap = new Capital();
        int pop = 0;
        if (population > 0) {
            cio.prompt("Search capitals with population equal or greater than: ");
            pop = cio.promptForInt("Enter the popuation:  ");
        }
        for (String key : stateCapitals.keySet()) {
            if (stateCapitals.get(key).getPopulation() >= pop) {
                displayStateData(key, stateCapitals.get(key));
            }
        }
    }

    public void updateCapital() {
        String name = "";
        int population = 0;
        double sqMiles = 0;
        String state = cio.promptForString("State Name:  ");
        Capital cap = new Capital();
        if (stateCapitals.containsKey(state)) {
            cap = stateCapitals.get(state);
        } else {
            cio.prompt("No record for " + state);
            return;
        }
        cio.prompt("Update Infotmation for " + state + ".");
        name = cio.promptForLine("");
        name += cio.promptForLine("New Capital City of " + state + "(" + cap.getName() + "):  ");

        if (name.equals("")) {
            name = cap.getName();
        }
        population = cio.promptForInt("New population(" + cap.getPopulation() + "):  ");
        if (population == 0) {
            population = cap.getPopulation();
        }
        sqMiles = cio.promptForInt("New Area(" + cap.getSqMiles() + "):  ");
        if (sqMiles == 0) {
            sqMiles = cap.getSqMiles();
        }
        Capital newCap = new Capital(name, population, sqMiles);
        displayStateData(state, newCap);
        stateCapitals.put(state, newCap);
    }

    //delete capital
    public void deleteCapital() {
        String state = cio.promptForString("State Name:  ");
        Capital cap = new Capital();
        if (stateCapitals.containsKey(state)) {
            stateCapitals.remove(state);
        } else {
            cio.prompt("No record for " + state);
        }
    }

    //save HashMap
    public void saveCapitals() {

        String fileName = cio.promptForString("Enter file name to save data:  ");
        try (PrintWriter out = new PrintWriter(new FileWriter(fileName))) {
            for (HashMap.Entry<String, Capital> entry : stateCapitals.entrySet()) {
                out.println(encode(entry.getKey(), entry.getValue()));
            }
            out.flush();
            System.out.println("Data Saved");
        } catch (IOException ex) {
            Logger.getLogger(StateCapitals2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //load file
    public void loadCapitals() {
        String fileName = "";
        File file = new File(fileName);
        String currentLine = "";
        do {
            fileName = cio.promptForString("Enter file name:  ");
            file = new File(fileName);
            if (!file.exists()) {
                System.out.println("invalid file name");
            }
        } while (!file.exists());

        try {
            Scanner sc = new Scanner(
                    new BufferedReader(new FileReader(fileName)));
            // go through the file line by line
            while (sc.hasNext()) {
                currentLine = sc.nextLine();
                decode(currentLine.split("::"));
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StateCapitals2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //encode entry
    public String encode(String state, Capital capital) {
        return state + "::" + capital.getName() + "::" + capital.getPopulation()
                + "::" + capital.getSqMiles();
    }

    //decode entry
    public void decode(String[] temp) {
        Capital cap = new Capital(temp[1], Integer.parseInt(temp[2]), Double.parseDouble(temp[3]));
        stateCapitals.put(temp[0], cap);
    }

    //display state data
    public void displayStateData(String state, Capital cap) {
        cio.prompt(state);
        cio.prompt("\tCapital of " + state + ":  " + cap.getName());
        cio.prompt("\tPopulation of " + cap.getName() + ":  " + cap.getPopulation());
        cio.prompt("\tArea of " + cap.getName() + ":  " + cap.getSqMiles() + " sq miles.");
        cio.prompt("");
    }
}
