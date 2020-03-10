
class AppletToJavaApp
{
	AppletToJavaApp()
	{
		System.out.println("Initialized");
	}

	public void start()
	{
		System.out.println("Starting applet");
	}
	
	public void stop()
	{
		System.out.println("Stopping applet");
	}
	public void destroy()
	{
		System.out.println("Destroyed");
	}


		public static void main(String[] args) {
			AppletToJavaApp obj = new AppletToJavaApp();
				obj.start();
				obj.stop();
				obj.destroy();
		}
}