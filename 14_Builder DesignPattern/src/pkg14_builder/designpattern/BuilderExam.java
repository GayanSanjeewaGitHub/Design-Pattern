package pkg14_builder.designpattern;

/**
 *
 * @author GAYAN SANJEEWA
 */
class Mobile {

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @return the camera
     */
    public int getCamera() {
        return camera;
    }

    /**
     * @return the NFC
     */
    public boolean isNFC() {
        return NFC;
    }

    /**
     * @return the display_size
     */
    public double getDisplay_size() {
        return display_size;
    }

    /**
     * @return the storage
     */
    public int getStorage() {
        return storage;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the ram
     */
    public int getRam() {
        return ram;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    private final String brand;
    private final int camera;
    private final boolean NFC;
    private final double display_size;
    private final int storage;
    private double price;
    private final int ram;
    private final String model;

    public Mobile(Builder b) {
        this.camera = b.getCamera();
        this.brand = b.getBrand();
        this.model = b.getModel();
        this.price = b.getPrice();
        this.ram = b.getRam();
        this.storage = b.getStorage();
        this.NFC = b.isNFC();
        this.display_size = b.getDisplay_size();

    }

    @Override
    public String toString() {
        return " Specification are:\n"
                + "Mobile Brand:" + this.getBrand() + "\n"
                + "Mobile Model:" + this.getModel() + "\n"
                + " Camera:" + this.getCamera() + " MP \n"
                + " RAM:" + this.getRam() + "\n"
                + "Storage:" + this.getStorage() + " GB \n"
                + "Price:" + this.getPrice() + " /=Rs " + "\n"
                + "Display:" + this.getDisplay_size() + " inch \n"
                + "NFC:" + this.isNFC() + "\n";

    }

    static class Builder {

        /**
         * @return the brand
         */
        public String getBrand() {
            return brand;
        }

        /**
         * @return the display_size
         */
        public double getDisplay_size() {
            return display_size;
        }

        /**
         * @return the storage
         */
        public int getStorage() {
            return storage;
        }

        /**
         * @return the price
         */
        public double getPrice() {
            return price;
        }

        /**
         * @return the ram
         */
        public int getRam() {
            return ram;
        }

        /**
         * @return the model
         */
        public String getModel() {
            return model;
        }

        private final String brand;
        private int camera;
        private boolean NFC;
        private double display_size;
        private int storage;
        private double price;
        private int ram;
        private final String model;

        public Builder(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        public Mobile build() {
            return new Mobile(this);
        }

        /**
         * @return the camera
         */
        public int getCamera() {
            return camera;
        }

        /**
         * @param camera the camera to set
         */
        public Builder setCamera(int camera) {
            this.camera = camera;
            return this;
        }

        /**
         * @return the NFC
         */
        public boolean isNFC() {
            return NFC;
        }

        /**
         * @param NFC the NFC to set
         */
        public Builder setNFC(boolean NFC) {
            this.NFC = NFC;
            return this;
        }

        /**
         * @param display_size the display_size to set
         */
        public Builder setDisplay_size(double display_size) {
            this.display_size = display_size;
            return this;
        }

        /**
         * @param storage the storage to set
         */
        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        /**
         * @param price the price to set
         */
        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        /**
         * @param ram the ram to set
         */
        public Builder setRam(int ram) {
            this.ram = ram;
            return this;
        }

    }
}

public class BuilderExam {

    public static void main(String[] args) {
        Mobile.Builder ab = new Mobile.Builder("Apple", "i13");
        ab.setCamera(13).setDisplay_size(14).setNFC(true).setPrice(250000).setRam(8).setStorage(125);
        Mobile apple4n = ab.build();
        System.out.println( apple4n.toString());
         System.out.println("///////////");
        Mobile.Builder sb = new Mobile.Builder("Samsung", "Galaxy 9");
        sb.setCamera(13).setDisplay_size(14).setNFC(true).setPrice(250000).setRam(8).setStorage(125);
        Mobile samsung4n = sb.build();
        System.out.println( samsung4n.toString());
         
    }

}
