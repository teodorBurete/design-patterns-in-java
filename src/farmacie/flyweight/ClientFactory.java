package farmacie.flyweight;

import java.util.HashMap;

public class ClientFactory {


    private HashMap<String, IClientFlyweight> clienti;

    public ClientFactory() {
        clienti = new HashMap<>();
    }

    public int getNumarRetete(){
        return clienti.size();
    }

    public IClientFlyweight getClient(String numeClient){
        IClientFlyweight client = clienti.get(numeClient);

        if(client==null){
            clienti.put(numeClient, new Client(numeClient,(long)(Math.random()*100000)));
            client = clienti.get(numeClient);
        }
        return client;
    }
}
