import java.io.IOException;
public class VlcOpener {
		public void run(String fileName) {
			try {
					System.out.println("Vlc Opening!");
					Runtime runTime = Runtime.getRuntime();
					String []command = new String[2]; //= { "vlc" , "D:\\Awara - Title Song - Awara Hoon - Mukesh.mp4"};
					command[0]="vlc";
					command[1]=fileName;
					Process process = runTime.exec(command);
			} catch (IOException e){
				e.printStackTrace();
			}	
		}
}
