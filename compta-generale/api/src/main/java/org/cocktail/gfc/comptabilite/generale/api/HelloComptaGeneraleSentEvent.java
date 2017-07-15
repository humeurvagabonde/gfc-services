package org.cocktail.gfc.comptabilite.generale.api;

public class HelloComptaGeneraleSentEvent {

    /** System time when the event happened */
    private final long timestamp;
    
    public HelloComptaGeneraleSentEvent() {
        this.timestamp = System.currentTimeMillis();
    }

    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (timestamp ^ (timestamp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        HelloComptaGeneraleSentEvent other = (HelloComptaGeneraleSentEvent) obj;
        if (timestamp != other.timestamp)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "HelloSentEvent [timestamp=" + timestamp + "]";
    }

}
