package dp_animesh_wizard;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.handlers.HandlerUtil;

public class CreateTripHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		System.out.println("In CreateTripHandler");
		MyWizard wizard = new MyWizard(); 
        WizardDialog dialog = new WizardDialog(HandlerUtil.getActiveShell(event), wizard);
        dialog.open();
       return null;
	}
}
