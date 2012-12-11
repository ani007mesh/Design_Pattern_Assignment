package dp_animesh_wizard;



import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class Page1TripName extends WizardPage {
	Label lbl_tripName;
	Text txt_tripName;
	Composite compo;
	
	
	public Label getL_tripName() {
		return lbl_tripName;
	}

	public void setL_tripName(Label lbl_tripName) {
		this.lbl_tripName = lbl_tripName;
	}

	public Text getT_tripName() {
		return txt_tripName;
	}

	public void setT_tripName(Text txt_tripName) {
		this.txt_tripName = txt_tripName;
	}

	protected Page1TripName(String pageName) {
		super(pageName);
		// TODO Auto-generated constructor stub
		setTitle("Trip Name");
	}

	@Override
	public void createControl(Composite parent) {
		// TODO Auto-generated method stub
		compo = new Composite(parent, SWT.NULL);
		GridLayout gl = new GridLayout(2, true);
		compo.setLayout(gl);
		lbl_tripName = new Label(compo, SWT.NONE);
		lbl_tripName.setText("Trip Name");
		txt_tripName = new Text(compo, SWT.BORDER);
		txt_tripName.addKeyListener(new KeyListener() {
			
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			if(!txt_tripName.getText().isEmpty()){
				setPageComplete(true);
			}
			else
				setPageComplete(false);
		}
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
		}
		});
		setControl(compo);
		setPageComplete(false);
	}
}
