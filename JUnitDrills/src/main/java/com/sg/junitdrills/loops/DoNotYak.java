/*
Suppose the string "yak" is unlucky. Given a string, return a version where all
the "yak" are removed, but the "a" can be any char. The "yak" strings will
not overlap. 

DoNotYak("yakpak") -> "pak"
DoNotYak("pakyak") -> "pak"
DoNotYak("yak123ya") -> "123ya"

public string DoNotYak(string str) {

}
 */
package com.sg.junitdrills.loops;

/**
 *
 * @author Paul Peterson
 */
public class DoNotYak {

    public String doNotYak(String str) {
        String search = "yak";
        return str.replaceAll(search, "");
    }
}
