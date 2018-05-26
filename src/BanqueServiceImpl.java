import corbaBanque.Compte;
import corbaBanque.IBanqueRemotePOA;
import org.omg.CORBA.DoubleHolder;

/**
 * Created by mkaroune on 09/09/2017.
 */
public class BanqueServiceImpl extends IBanqueRemotePOA {
    @Override
    public double conversion(double mt) {
        return mt*11.3;
    }

    @Override
    public Compte getCompte(int code) {
        return new Compte(code, Math.random() * 900000);
    }

    @Override
    public Compte[] getComptes() {
        Compte [] cptes = new Compte[3];
        cptes[0] = new Compte(1, Math.random() * 90000);
        cptes[1] = new Compte(2, Math.random() * 90000);
        cptes[2] = new Compte(3, Math.random() * 90000);

        return cptes;
    }
}
