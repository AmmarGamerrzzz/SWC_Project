package vaccination;

public class WelcomePageSystem {

	public static void main (String[] args) {
		
		WelcomePage welcomePages;
		MainPage Page;
		
		try {
			welcomePages = new WelcomePage();
			Page = new MainPage ();
			
			welcomePages.setVisible (true);
			welcomePages.setLocationRelativeTo(null);
			Thread.sleep(700);
			welcomePages.progressBar.setVisible(true);
			
			try {
				for (int i = 0; i<= 100; i += 4) {
					Thread.sleep(20);
					welcomePages.progressBar.setValue(i);
					welcomePages.lblNewLabel.setText (i + "%");
				}
				Thread.sleep(1000);
				welcomePages.setVisible(false);
				Page.setVisible(true);
				Page.setLocationRelativeTo(null);
			}
			catch (Exception e)
			{
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
