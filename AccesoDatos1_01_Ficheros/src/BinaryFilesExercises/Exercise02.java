package BinaryFilesExercises;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.JOptionPane;


/* Codificar un programa para realizar el mantenimiento de las cuentas de nuestros
clientes. Para ello contamos con la existencia de dos ficheros: 
Uno se llamará MOVIMIENTOS.DAT y tiene la siguiente estructura

MOVIMIENTOS.DAT
Campo | Tipo

numCta | Entero.
importe | Entero. Guarda el importe que se ingresa o se retira
tipo | Entero. puede tomar los valores:
1.- Cero: una imposición
2.- Un reintegro

El segundo es el fichero CLIENTES.DAT, con la siguiente estructura

CLIENTES.DAT

Campo | Tipo

numCta | Entero.
nombre | String 30
direccion | String 30
saldo | Entero

El programa tendrá distintas opciones:
1. Crear y listar el fichero de Movimientos.
2. Actualizar el fichero de Clientes con los datos del fichero de Movimientos. Si el
cliente no existe se insertará en el fichero y en caso de que exista se actualizará el saldo.*/

@SuppressWarnings("serial")
class Movements implements Serializable {
	private int accountNumber;
	private int quantity;
	private int type;
	
	public Movements(int accountNumber, int quantity, int type) {
		this.accountNumber = accountNumber;
		this.quantity = quantity;
		this.type = type;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getType() {
		return type;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Movements [Numero de cuenta=" + accountNumber + ", Cantidad=" + quantity + ", Tipo=" + type + "]";
	}
}
@SuppressWarnings("serial")
class Clients implements Serializable {
	int accountNumber;
	String name;
	String address;
	int balance;
	
	public Clients(int accountNumber, String name, String address, int balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.address = address;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getBalance() {
		return balance;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Clients [Numero de cuenta=" + accountNumber + ", Nombre=" + name + ", Direccion=" + address + ", Saldo="
				+ balance + "]";
	}
}

public class Exercise02 {
	
	public static File movesFile = new File("src/BinaryFilesExercises/Movimientos.dat");
	public static File clientsFile = new File("src/BinaryFilesExercises/Clientes.dat");
	
	static FileOutputStream fos;
	static ObjectOutputStream oos;
	static FileInputStream fis;
	static ObjectInputStream ois;
	
	public static Movements createMovement() {
		JOptionPane.showMessageDialog(null, "Introduce los datos del movimiento");
		int accountNumber = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de cuenta"));
		int quantity = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad"));
		int type = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tipo(1 = ingreso, 2 = retiro)"));
		return new Movements(accountNumber, quantity, type);
	}
	
	public static Clients createClient() {
		JOptionPane.showMessageDialog(null, "Introduce los datos del cliente");
		int accountNumber = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de cuenta"));
		String name = JOptionPane.showInputDialog("Introduce el nombre");
		String address = JOptionPane.showInputDialog("Introduce la direccion");
		int balance = Integer.parseInt(JOptionPane.showInputDialog("Introduce el saldo"));
		return new Clients(accountNumber, name, address, balance);
	}
	
	public static void writeMovementsOnFile(ArrayList<Movements> movementsList, File movementsFile) {
		try {
			fos = new FileOutputStream(movementsFile);
			oos = new ObjectOutputStream(fos);
			for (Movements m : movementsList) {
				oos.writeObject(m);
			}
			oos.close();
			fos.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR EL MOVIMIENTO");
		}
	}
	
	public static void writeClientsOnFile(ArrayList<Clients> clientsList, File clientsFile) {
		try {
			fos = new FileOutputStream(clientsFile);
			oos = new ObjectOutputStream(fos);
			for (Clients c : clientsList) {
				oos.writeObject(c);
			}
			oos.close();
			fos.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR EL CLIENTE");
		}
	}
	
	public static ArrayList<Movements> readMovementsFromFile(File movementsFile) {
		ArrayList<Movements> movementsList = new ArrayList<>();
		try {
			fis = new FileInputStream(movementsFile);
			ois = new ObjectInputStream(fis);
			while (fis.available() > 0) {
				Movements m = (Movements) ois.readObject();
				movementsList.add(m);
			}
			ois.close();
			fis.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "ERROR AL LEER LOS MOVIMIENTO");
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "ERROR AL LEER LOS MOVIMIENTO");
		}
		return movementsList;
	}
	
	public static ArrayList<Clients> readClientsFromFile(File clientsFile) {
		ArrayList<Clients> clientsList = new ArrayList<>();
		try {
			fis = new FileInputStream(clientsFile);
			ois = new ObjectInputStream(fis);
			while (fis.available() > 0) {
				Clients c = (Clients) ois.readObject();
				clientsList.add(c);
			}
			ois.close();
			fis.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "ERROR AL LEER LOS CLIENTES");
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "ERROR AL LEER LOS CLIENTES");
		}
		return clientsList;
	}
	
	public static void updateClientsWithMovements(ArrayList<Clients> clientsList, ArrayList<Movements> movementsList) {
		for (Clients c : clientsList) {
			for (Movements m : movementsList) {
				if(c.getAccountNumber() == m.getAccountNumber()) {
					if (m.getType() == 1) {
						c.setBalance(c.getBalance() + m.getQuantity());
					} else {
						c.setBalance(c.getBalance() - m.getQuantity());
					}
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		ArrayList<Movements> movementsList = readMovementsFromFile(movesFile);
		ArrayList<Clients> clientsList = readClientsFromFile(clientsFile);
		updateClientsWithMovements(clientsList, movementsList);
		writeClientsOnFile(clientsList, clientsFile);
		
		Movements m = createMovement();
		movementsList.add(m);
		writeMovementsOnFile(movementsList, movesFile);
		
		Clients c = createClient();	
		clientsList.add(c);
		writeClientsOnFile(clientsList, clientsFile);
	}

}
