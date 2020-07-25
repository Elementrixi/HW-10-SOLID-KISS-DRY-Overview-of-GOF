package main.java.com.alpashaev.builder;

public class Parcel {
    private String sender;
    private String recipient;
    private int parcelId;
    private double weightInKg;

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

        public Builder identity(int parcelId) {
            newParcel.parcelId = parcelId;
            return this;
        }

        public Builder weight(double weight) {
            newParcel.weightInKg = weight;
            return this;
        }

        @Override
        public String toString() {
            return "Parcel{" +
                    "sender : " + newParcel.sender +
                    ", recipient : " + newParcel.recipient +
                    ", parcel id = " + newParcel.parcelId +
                    ", weight in kg = " + newParcel.weightInKg +
                    '}';
        }
    }
}