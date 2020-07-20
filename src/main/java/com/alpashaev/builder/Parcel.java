package main.java.com.alpashaev.builder;

public class Parcel {
    private static String sender;
    private static String recipient;
    private static int parcelId;
    private static double weightInKg;

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public int getIdentity() {
        return parcelId;
    }

    public double getWeight() {
        return weightInKg;
    }

    public static class Builder {
        private Parcel newParcel;

        public Builder() {
            newParcel = new Parcel();
        }

        public Builder sender(String sender) {
            newParcel.sender = sender;
            return this;
        }

        public Builder recipient(String recipient) {
            newParcel.recipient = recipient;
            return this;
        }

        public Builder identity(int id) {
            newParcel.parcelId = id;
            return this;
        }

        public Builder weight(double weight) {
            newParcel.weightInKg = weight;
            return this;
        }

        @Override
        public String toString() {
            return "Parcel{" +
                    "sender : " + sender +
                    ", recipient : " + recipient +
                    ", parcel id = " + parcelId +
                    ", weight in kg = " + weightInKg +
                    '}';
        }
    }
}