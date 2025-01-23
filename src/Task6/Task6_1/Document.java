package Task6.Task6_1;

import java.util.Date;

public class Document {
    private String documentName;
    private Date dateCreated;
    private String documentContent;
    private User signedBy;

    public Document(String documentName, Date dateCreated, String documentContent, User signedBy) {
        this.documentName = documentName;
        this.dateCreated = dateCreated;
        this.documentContent = documentContent;
        this.signedBy = signedBy;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDocumentContent() {
        return documentContent;
    }

    public void setDocumentContent(String documentContent) {
        this.documentContent = documentContent;
    }

    public User getSignedBy() {
        return signedBy;
    }

    public void setSignedBy(User signedBy) {
        this.signedBy = signedBy;
    }

    @Override
    public String toString() {
        return "Document{" +
                "documentName='" + documentName + '\'' +
                ", dateCreated=" + dateCreated +
                ", documentContent='" + documentContent + '\'' +
                ", signedBy=" + signedBy +
                '}';
    }
}
