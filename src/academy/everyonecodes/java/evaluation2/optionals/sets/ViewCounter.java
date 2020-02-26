package academy.everyonecodes.java.evaluation2.optionals.sets;

import java.util.HashSet;
import java.util.Set;

public class ViewCounter {
    private Set<String> collectionOfIPAddresses;
    private int views;

    public ViewCounter() {
        this.collectionOfIPAddresses = new HashSet<>();
        this.views = 0;
    }

    public void addViewerIPAddress(String ipAddress) {
        if (!collectionOfIPAddresses.contains(ipAddress)) {
            collectionOfIPAddresses.add(ipAddress);
            views++;
        }
    }

    public int countUniqueViews(){
        return views;
    }

}
