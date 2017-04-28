package edu.iis.powp.drawer;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.adapter.LinePlotterAdapter;
import edu.iis.powp.command.Factory;
import edu.iis.powp.command.PlotterCommand;
import edu.kis.powp.drawer.panel.DefaultDrawerFrame;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.LineFactory;

public class TestTriangle {

	public static void main(String[] args)
	{
		DrawPanelController controller = new DrawPanelController();
		DefaultDrawerFrame.getDefaultDrawerFrame().setVisible(true);
		IPlotter plotter = new LinePlotterAdapter(controller, LineFactory.getBasicLine());
		PlotterCommand plotterCommand = Factory.getTriangle(-40, -40, -40, 0, 0, 0);
		plotterCommand.execute(plotter);
	}
}
