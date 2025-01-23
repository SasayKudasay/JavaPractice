package Task5.Task5_2;

public class TransportInfo {
    private boolean documentsValid;
    private boolean hasFine;
    private int emissionLevel;

    public TransportInfo(boolean documentValid, boolean hasFine, int emissionLevel) {
        this.documentsValid = documentValid;
        this.hasFine = hasFine;
        this.emissionLevel = emissionLevel;
    }

    public boolean isDocumentsValid() {
        return documentsValid;
    }

    public void setDocumentsValid(boolean documentsValid) {
        this.documentsValid = documentsValid;
    }

    public boolean isHasFine() {
        return hasFine;
    }

    public void setHasFine(boolean hasFine) {
        this.hasFine = hasFine;
    }

    public int getEmissionLevel() {
        return emissionLevel;
    }

    public void setEmissionLevel(int emissionLevel) {
        this.emissionLevel = emissionLevel;
    }
}
