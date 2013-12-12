import org.omg.CosTransactions.Control;
import org.omg.CosTransactions.ControlPOA;
import org.omg.CosTransactions.Coordinator;
import org.omg.CosTransactions.CoordinatorPOA;
import org.omg.CosTransactions.Inactive;
import org.omg.CosTransactions.NotSubtransaction;
import org.omg.CosTransactions.PropagationContext;
import org.omg.CosTransactions.RecoveryCoordinator;
import org.omg.CosTransactions.Resource;
import org.omg.CosTransactions.Status;
import org.omg.CosTransactions.SubtransactionAwareResource;
import org.omg.CosTransactions.SubtransactionsUnavailable;
import org.omg.CosTransactions.Synchronization;
import org.omg.CosTransactions.SynchronizationUnavailable;
import org.omg.CosTransactions.Terminator;
import org.omg.CosTransactions.Unavailable;


public class coo extends ControlPOA{

	public Coordinator get_coordinator() throws Unavailable {
		// TODO Auto-generated method stub
		return null;
	}

	public Terminator get_terminator() throws Unavailable {
		// TODO Auto-generated method stub
		return null;
	}

	
}
