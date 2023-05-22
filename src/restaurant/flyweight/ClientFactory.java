package restaurant.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ClientFactory {

    private Map<Long,FlyweightClient> cache;

    public ClientFactory(){
        cache = new HashMap<>();
    }

    public FlyweightClient getClient(long idClient){
        return cache.computeIfAbsent(idClient, id-> new ConcreteFlyweightClient("Pizdulesc","09345","pizdulescu@yahoo.pula"));
    }
}
