package classwork_45.parcels;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Box implements Iterable<Parcel> {

    List<Parcel> parcels; // список посылок в коробке(опись)

    // constructor
    public Box(int numParcels) {
        Random random = new Random();
        this.parcels = Stream.generate(() -> new Parcel(random.nextDouble(0, 2))) // weight of parcel from 0 to 2 kg
                .limit(numParcels)
                .collect(Collectors.toList());
    }

    public List<Parcel> getParcels() {
        return parcels;
    }

    // add parcel to box
    public boolean addParcel(Parcel parcel) {
        return parcels.add(new Parcel(2));
    }

    // сколько в Box имеется parcel
    public int quantity() {
        return parcels.size();
    }

    // вес Box = сумма весов всех посылок
    public double weightBox() {
        return parcels.stream()
                .mapToDouble(p -> p.getWeight())
                .sum();
    }

    @Override
    public Iterator<Parcel> iterator() {
        return parcels.iterator();
    }
}
