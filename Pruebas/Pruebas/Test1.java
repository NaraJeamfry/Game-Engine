package Pruebas;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

public class Test1 {
	public void start()
	{
		try
		{
			Display.setDisplayMode(new DisplayMode(800,600));
			Display.create();
		}
		catch(LWJGLException e)
		{
			e.printStackTrace();
			System.exit(0);
		}
		
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		
		
		while(!Display.isCloseRequested())
		{
			Display.update();
		}
		
		Display.destroy();
	}
	
	public static void main(String[] args)
	{
		Test1 displayExample = new Test1();
		displayExample.start();
	}
}
