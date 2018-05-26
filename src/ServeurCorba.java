import org.omg.CORBA.ORB;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

import javax.naming.Context;
import javax.naming.InitialContext;

/**
 * Created by mkaroune on 09/09/2017.
 */
public class ServeurCorba {
    public  static void main (String [] args){
        try {
            // Create and initialize the ORB
            ORB orb = ORB.init(args, null);

            POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            //Activate the POA manager to be ready to manage a request
            rootPOA.the_POAManager().activate();
            BanqueServiceImpl od = new BanqueServiceImpl();
            // Create the initial context
            Context ctx = new InitialContext();
            ctx.rebind("BANQUE", rootPOA.servant_to_reference(od));
             orb.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
