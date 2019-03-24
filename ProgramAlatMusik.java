public class ProgramAlatMusik { 
	public static void main(String []args) { 
	
	AlatMusik ams = new AlatMusik(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9]);
	
	
	String Nama = ams.getNama();
	String Jenis = ams.getJenis();
	String Bentuk = ams.getBentuk();
	String Warna = ams.getWarna();
	String Harga = ams.getHarga();
	String Pemilik = ams.getPemilik();
	String CaraMain = ams.getCaraMain();
	String NadaDasar = ams.getNadaDasar();
	String SumberBunyi = ams.getSumberBunyi();
	String TempatBeli = ams.getTempatBeli();
	
	System.out.println(Nama);
	System.out.println(Jenis);
	System.out.println(Bentuk);
	System.out.println(Warna);
	System.out.println(Harga);
	System.out.println(Pemilik);
	System.out.println(CaraMain);
	System.out.println(NadaDasar);
	System.out.println(SumberBunyi);
	System.out.println(TempatBeli);
	
	}
}
	
	