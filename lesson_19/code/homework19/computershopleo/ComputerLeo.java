package homework19.computershopleo;

import java.util.Objects;
public class ComputerLeo {
    public static final int BARCODE_LENGTH = 20;

        private String brand;
        private String cpu;
        private int ram;
        private long msn; // manufacture serial number

        public ComputerLeo(String brand, String cpu, int ram, long msn) {
            this.brand = brand;
            this.cpu = cpu;
            this.ram = ram;
            this.msn = checkMsn(msn);
        }

        private long checkMsn(long msn) {
            if (countDigit(msn) == BARCODE_LENGTH) {
                return msn;
            }
            return -1;
        }

        private int countDigit(long msn) {
            int count = 0;
            do {
                count++;
                msn = msn / 10;
            } while (msn != 0);

            return count;
        }


        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getCpu() {
            return cpu;
        }

        public void setCpu(String cpu) {
            this.cpu = cpu;
        }

        public int getRam() {
            return ram;
        }

        public void setRam(int ram) {
            this.ram = ram;
        }

        public long getMsn() {
            return msn;
        }

        @Override
        public String toString() {
            return "Computer{" +
                    "brand='" + brand + '\'' +
                    ", cpu='" + cpu + '\'' +
                    ", ram=" + ram +
                    ", msn=" + msn +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof ComputerLeo computer)) return false;
            return ram == computer.ram && msn == computer.msn && Objects.equals(brand, computer.brand) && Objects.equals(cpu, computer.cpu);
        }

        @Override
        public int hashCode() {
            return Objects.hash(msn);
        }
    }

