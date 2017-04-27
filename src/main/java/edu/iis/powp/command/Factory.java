package edu.iis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class Factory {
	
	public static PlotterCommand getRectangle(int x, int y, int width, int height) {
		List<PlotterCommand> commandsList = new ArrayList<PlotterCommand>();
		commandsList.add(new CommandSetPosition(x, y));
		commandsList.add(new CommandDrawLineToPosition(x + width, y));
		commandsList.add(new CommandDrawLineToPosition(x + width, y + height));
		commandsList.add(new CommandDrawLineToPosition(x, y + height));
		commandsList.add(new CommandDrawLineToPosition(x, y));
		return new ComplexCommand(commandsList);
	}
	
	public static PlotterCommand getTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		List<PlotterCommand> commandsList = new ArrayList<PlotterCommand>();
		commandsList.add(new CommandSetPosition(x1, y1));
		commandsList.add(new CommandDrawLineToPosition(x2, y2));
		commandsList.add(new CommandDrawLineToPosition(x3, y3));
		commandsList.add(new CommandDrawLineToPosition(x1, y1));
		return new ComplexCommand(commandsList);
	}
	
}
