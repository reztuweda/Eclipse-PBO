package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.Dosen;
import id.ac.undiksha.siak.entities.Mahasiswa;
import id.ac.undiksha.siak.entities.Pegawai;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Data Mahasiswa
		Mahasiswa mhs1 = new Mahasiswa(
				"2115101077",
				"Restuyyyy",
				true,
				"Tejakula",
				"Ilmu Komputer",
				"Teknik Informatika",
				"FTK"
		);
		System.out.println("");		
		mhs1.printAllInfo();
		
		
		//Data Dosen
		Dosen dsn1 = new Dosen(
				
		);
		System.out.println("");
		dsn1.printAllInfo();
		


		//Data Pegawai
		Pegawai pgw1 = new Pegawai(
								
		);
		System.out.println("");
		pgw1.printAllInfo();
	}

}
