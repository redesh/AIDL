package poc.aidlservice;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.widget.Toast;

public class GuidanceServiceImpl extends IGuidanceService.Stub implements IGuidanceService {
	@Override
	public IBinder asBinder() {
		return this;
	}

	@Override
	public void resetGuidance() throws RemoteException {
		System.out.println("Guidance reset");
	}

	@Override
	public boolean markB(boolean completeSwath) throws RemoteException {
		System.out.println("Marking B");

		return completeSwath;
	}

    @Override
    public String getResults() throws RemoteException {
        // TODO Auto-generated method stub
        return this.getClass().getName();
    }
}
