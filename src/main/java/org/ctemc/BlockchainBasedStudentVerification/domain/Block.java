package org.ctemc.BlockchainBasedStudentVerification.domain;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Block {
    private String gradClass;
    private String hsCountry;

    private String hsState;
    private String highSchoolIdentifier;
    private String studentIdentifier;
    private String docType;

    public String getFileHash() {
        return fileHash;
    }

    public void setFileHash(String fileHash) {
        this.fileHash = fileHash;
    }

    private String fileHash;


    public String getGradClass() {
        return gradClass;
    }

    public void setGradClass(String gradClass) {
        this.gradClass = gradClass;
    }

    public String getHsCountry() {
        return hsCountry;
    }

    public void setHsCountry(String hsCountry) {
        this.hsCountry = hsCountry;
    }

    public String getHsState() {
        return hsState;
    }

    public void setHsState(String hsState) {
        this.hsState = hsState;
    }

    public String getHighSchoolIdentifier() {
        return highSchoolIdentifier;
    }

    public void setHighSchoolIdentifier(String highSchoolIdentifier) {
        this.highSchoolIdentifier = highSchoolIdentifier;
    }

    public String getStudentIdentifier() {
        return studentIdentifier;
    }

    public void setStudentIdentifier(String studentIdentifier) {
        this.studentIdentifier = studentIdentifier;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }


    public Block(String gradClass, String hsCountry, String hsState, String highSchoolIdentifier, String studentIdentifier, String docType, String docHash) {
        this.gradClass = gradClass;
        this.hsCountry = hsCountry;
        this.hsState = hsState;
        this.highSchoolIdentifier = highSchoolIdentifier;
        this.studentIdentifier = studentIdentifier;
        this.docType = docType;
        this.fileHash = docHash;
    }

    public Block() {
    }

    public String toString(){
        ObjectMapper mapper = new ObjectMapper();
        String jsonString;
        //Converting the Object to JSONString
        try {
            jsonString = mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return jsonString;
    }
}
