package edu.iis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class Factory {
	
	public PlotterCommand getRectangle(int x, int y, int width, int height) {
		List<PlotterCommand> commandsList = new ArrayList<PlotterCommand>();
		commandsList.add(new CommandSetPosition(x, y));
		commandsList.add(new CommandDrawLineToPosition(x + width, y));
		commandsList.add(new CommandDrawLineToPosition(x + width, y + height));
		commandsList.add(new CommandDrawLineToPosition(x, y + height));
		commandsList.add(new CommandDrawLineToPosition(x, y));
		return new ComplexCommand(commandsList);
	}
	
}
