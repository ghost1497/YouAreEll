public class Message {
    private String sequence;
    private String timestamp;
    private ID toID;
    private ID fromID;
    private String message;

    public Message(String sequence, String timestamp, ID toID, ID fromID, String message) {
        this.sequence = sequence;
        this.timestamp = timestamp;
        this.toID = toID;
        this.fromID = fromID;
        this.message = message;
    }

    public String getSequence() {
        return sequence;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public ID getToID() {
        return toID;
    }

    public ID getFromID() {
        return fromID;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "sequence='" + sequence + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", toID=" + toID +
                ", fromID=" + fromID +
                ", message='" + message + '\'' +
                '}';
    }
}
