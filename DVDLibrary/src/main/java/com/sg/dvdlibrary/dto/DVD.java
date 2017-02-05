
package com.sg.dvdlibrary.dto;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Paul Peterson
 */
public class DVD {
    private int DVDId;
    private boolean isArchive;
    private String title;
    private LocalDate releaseDate;
    private String MPAArating;
    private String director;
    private String studio;
    private List<String> comments;
    
    public DVD(){
        
    }

    public DVD(int DVDId, boolean isArchive, String title, LocalDate releaseDate, String MPAArating, String director, String studio, List<String> comments) {
        this.DVDId = DVDId;
        this.isArchive = isArchive;
        this.title = title;
        this.releaseDate = releaseDate;
        this.MPAArating = MPAArating;
        this.director = director;
        this.studio = studio;
        this.comments = comments;
    }

    /**
     * @return the DVDId
     */
    public int getDVDId() {
        return DVDId;
    }

    /**
     * @param DVDId the DVDId to set
     */
    public void setDVDId(int DVDId) {
        this.DVDId = DVDId;
    }

    /**
     * @return the isArchive
     */
    public boolean isIsArchive() {
        return isArchive;
    }

    /**
     * @param isArchive the isArchive to set
     */
    public void setIsArchive(boolean isArchive) {
        this.isArchive = isArchive;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the releaseDate
     */
    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    /**
     * @param releaseDate the releaseDate to set
     */
    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * @return the MPAArating
     */
    public String getMPAArating() {
        return MPAArating;
    }

    /**
     * @param MPAArating the MPAArating to set
     */
    public void setMPAArating(String MPAArating) {
        this.MPAArating = MPAArating;
    }

    /**
     * @return the director
     */
    public String getDirector() {
        return director;
    }

    /**
     * @param director the director to set
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * @return the studio
     */
    public String getStudio() {
        return studio;
    }

    /**
     * @param studio the studio to set
     */
    public void setStudio(String studio) {
        this.studio = studio;
    }

    /**
     * @return the comments
     */
    public List<String> getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "DVD{" + "DVDId=" + DVDId + ", isArchive=" + isArchive + ", title="
                + title + ", releaseDate=" + releaseDate + ", MPAArating=" 
                + MPAArating + ", director=" + director + ", studio=" + studio 
                + ", comments=" + comments + '}';
    }
    
    
}
