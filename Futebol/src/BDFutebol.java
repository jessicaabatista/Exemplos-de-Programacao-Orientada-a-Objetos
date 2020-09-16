import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BDFutebol {
	
	String nomeArquivo = "bdFut.dat";

	public BDFutebol() {
		// TODO Auto-generated constructor stub
	}
	
	public String salvaDados (Time time) throws FileNotFoundException, IOException {
		// TODO Auto-generated constructor stub
		ObjectOutputStream objOut = new ObjectOutputStream (new BufferedOutputStream (new FileOutputStream (this.nomeArquivo)));
		objOut.writeObject(time);
		objOut.close();
		return "Time salvo com sucesso.";
	}
	
	public Time recuperaTime (String nome) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated constructor stub
		ObjectInputStream objIn = new ObjectInputStream (new BufferedInputStream (new FileInputStream (this.nomeArquivo)));
		Time time = (Time) objIn.readObject();
		objIn.close();
		return time;
	}

}
