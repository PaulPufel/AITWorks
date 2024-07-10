package homework_46.hospital;

import java.util.Arrays;

public class Doctor {

    String name;
    String[] specialties;

    public Doctor(String name, String... specialties) {
        this.name = name;
        this.specialties = specialties;
    }

    public String getName() {
        return name;
    }

    public String[] getSpecialties() {
        return specialties;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Doctor{");
        sb.append("name='").append(name).append('\'');
        sb.append(", specialties=").append(Arrays.toString(specialties));
        sb.append('}');
        return sb.toString();
    }
}
