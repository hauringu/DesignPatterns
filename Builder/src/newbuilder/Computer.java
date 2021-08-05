package newbuilder;

public class Computer {
    // 必选
    private final String cpu;
    // 必选
    private final String ram;
    private final int usbCount;
    private final String keyBoard;
    private final String display;

    public Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.usbCount = builder.usbCount;
        this.keyBoard = builder.keyBoard;
        this.display = builder.display;
    }

    public static class Builder {
        private final String cpu;
        private final String ram;
        private int usbCount;
        private String keyBoard;
        private String display;

        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder setUsbCount(int usbCount) {
            this.usbCount = usbCount;
            return this;
        }

        public Builder setKeyBoard(String keyBoard) {
            this.keyBoard = keyBoard;
            return this;
        }

        public Builder setDisplay(String display) {
            this.display = display;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }

    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", usbCount=" + usbCount +
                ", keyBoard='" + keyBoard + '\'' +
                ", display='" + display + '\'' +
                '}';
    }
}
