package dp_animesh_wizard;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class Page2TripDetails extends WizardPage {
	Label lbl_from;
	Label lbl_to;
	Label lbl_via;
	Text txt_from;
	Text txt_to;
	Text txt_via;
	Composite compo;
	
	
	public Text getT_from() {
		return txt_from;
	}

	public void setT_from(Text txt_from) {
		this.txt_from = txt_from;
	}

	public Text getT_to() {
		return txt_to;
	}

	public void setT_to(Text txt_to) {
		this.txt_to = txt_to;
	}

	public Text getT_via() {
		return txt_via;
	}

	public void setT_via(Text txt_via) {
		this.txt_via = txt_via;
	}

	protected Page2TripDetails(String pageName) {
		super(pageName);
		setTitle("Trip Details");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createControl(Composite parent) {
		// TODO Auto-generated method stub
		compo = new Composite(parent, SWT.NULL);
		GridLayout gl = new GridLayout(2, true);
		compo.setLayout(gl);
		lbl_from = new Label(compo, SWT.NONE);
		lbl_from.setText("From");
		txt_from = new Text(compo, SWT.BORDER);
		
		lbl_to = new Label(compo, SWT.NONE);
		lbl_to.setText("To");
		txt_to = new Text(compo, SWT.BORDER);
		
		lbl_via = new Label(compo, SWT.NONE);
		lbl_via.setText("Via");
		txt_via = new Text(compo, SWT.BORDER);
		
		
		txt_from.addKeyListener(new KeyListener() {
			
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			if(!txt_from.getText().isEmpty()&&!txt_to.getText().isEmpty()){
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
		
		txt_to.addKeyListener(new KeyListener() {
			
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			if(!txt_to.getText().isEmpty()&&!txt_from.getText().isEmpty()){
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
