package dp_animesh_wizard;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Label;

public class Page3TripDate extends WizardPage {
	
	Label lbl_agent;
	Label lbl_date;
	Combo agent;
	DateTime date;
	Composite compo;
	
	public Combo getAgent() {
		return agent;
	}

	public void setAgent(Combo agent) {
		this.agent = agent;
	}

	public String getDate() {
		return date.getYear()+"-"+(date.getMonth()+1)+"-"+date.getDay();
	}

	public void setDate(DateTime date) {
		this.date = date;
	}

	protected Page3TripDate(String pageName) {
		super(pageName);
		setTitle("Trip Date");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createControl(Composite parent) {
		// TODO Auto-generated method stub
		compo = new Composite(parent, SWT.NULL);
		GridLayout gl = new GridLayout(2, true);
		compo.setLayout(gl);
		lbl_agent = new Label(compo, SWT.NONE);
		lbl_agent.setText("Agent");
		agent = new Combo(compo, SWT.BORDER|SWT.READ_ONLY);
		agent.add("Makemytrip");
		agent.add("Expedia");
		agent.add("Yatra");
		
		lbl_date = new Label(compo, SWT.NONE);
		lbl_date.setText("Date");
		date = new DateTime(compo, SWT.CALENDAR);
		
		agent.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				if(!agent.getText().isEmpty())
					setPageComplete(true);	
			}
		});
		setControl(compo);
	}
}
