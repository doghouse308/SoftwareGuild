
package com.sg.statecapitals;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Paul Peterson
 */
public class StateCapitalsHash {

    public void stateHashMap() {
        HashMap<String, String> statesHash = new HashMap();
        String al = "Montgomery";
        String ak = "Juneau";
        String az = "Pheonix";
        String ar = "Little Rock";
        String ca = "Sacramento";
        String co = "Denver";
        String ct = "Hartford";
        String de = "Dover";
        String fl = "Tallahassee";
        String ga = "Atlanta";
        String hi = "Honolulu";
        String id = "Boise";
        String il = "Springfield";
        String in = "Indianapolis";
        String ia = "Des Moines";
        String ks = "Topeka";
        String ky = "Frankfort";
        String la = "Baton Rouge";
        String me = "Augusta";
        String md = "Annapolis";
        String ma = "Boston";
        String mi = "Lancing";
        String mn = "St. Paul";
        String ms = "Jackson";
        String mo = "Jefferson City";
        String mt = "Helena";
        String ne = "Lincoln";
        String nv = "Carson City";
        String nh = "Concord";
        String nj = "Trenton";
        String nm = "Santa Fe";
        String ny = "Albany";
        String nc = "Raleigh";
        String nd = "Bismarck";
        String oh = "Columbus";
        String ok = "Oklahoma City";
        String or = "Salem";
        String pa = "Harrisburg";
        String ri = "Providence";
        String sc = "Columbia";
        String sd = "Pierre";
        String tn = "Nashville";
        String tx = "Austin";
        String ut = "Salt Lake City";
        String vt = "Montpelier";
        String va = "Richmond";
        String wa = "Olympia";
        String wv = "Charleston";
        String wi = "Madison";
        String wy = "Cheyenne";
        statesHash.put("Alabama", al);
        statesHash.put("Alaska", ak);
        statesHash.put("Arizona", az);
        statesHash.put("Arkansas", ar);
        statesHash.put("California", ca);
        statesHash.put("Colorado", co);
        statesHash.put("Connecticut", ct);
        statesHash.put("Deleware", de);
        statesHash.put("Florida", fl);
        statesHash.put("Georgia", ga);
        statesHash.put("Hawaii", hi);
        statesHash.put("Idaho", id);
        statesHash.put("Illinois", il);
        statesHash.put("Indiana", in);
        statesHash.put("Iowa", ia);
        statesHash.put("Kansas", ks);
        statesHash.put("Kentucky", ky);
        statesHash.put("Louisiana", la);
        statesHash.put("Maine", me);
        statesHash.put("Maryland", md);
        statesHash.put("Massachusetts", ma);
        statesHash.put("Michigan", mi);
        statesHash.put("Minnesota", mn);
        statesHash.put("Mississippi", ms);
        statesHash.put("Missouri", mo);
        statesHash.put("Montana", mt);
        statesHash.put("Nebraska", ne);
        statesHash.put("Nevada", nv);
        statesHash.put("New Hampshire", nh);
        statesHash.put("New Jersy", nj);
        statesHash.put("New Mexico", nm);
        statesHash.put("New York", ny);
        statesHash.put("North Carolina", nc);
        statesHash.put("North Dakota", nd);
        statesHash.put("Ohio", oh);
        statesHash.put("Oklahoma", ok);
        statesHash.put("Oregon", or);
        statesHash.put("Pennsylvania", pa);
        statesHash.put("Rhoade Island", ri);
        statesHash.put("South Carolina", sc);
        statesHash.put("South Dakota", sd);
        statesHash.put("Tennessee", tn);
        statesHash.put("Texas", tx);
        statesHash.put("Utah", ut);
        statesHash.put("Vermont", vt);
        statesHash.put("Virginia", va);
        statesHash.put("Washington", wa);
        statesHash.put("West Virginia", wv);
        statesHash.put("Wisconsin", wi);
        statesHash.put("Wyoming", wy);

        // keySet
        Map<String, String> sortedMap = new TreeMap<>(statesHash);
        
        System.out.println("Printing States");
        System.out.println("==================");
        for (String key : sortedMap.keySet()) {
            System.out.println(key);
        }
        // values
        System.out.println("Printing Capitals");
        System.out.println("==================");
        for (String value : sortedMap.values()) {
            System.out.println(value);
        }
        // entrySet
        System.out.println("Printing States and capitals");
        System.out.println("==================");
        for (Map.Entry<String,String> e : sortedMap.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }

}


