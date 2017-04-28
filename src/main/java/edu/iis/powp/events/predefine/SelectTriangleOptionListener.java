package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.Factory;

public class SelectTriangleOptionListener implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent e)
    {
    	Factory.getTriangle(-40, -40, -40, 0, 0, 0).execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    }
}
