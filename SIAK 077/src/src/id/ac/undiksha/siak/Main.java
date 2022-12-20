package src.id.ac.undiksha.siak;

import src.id.ac.undiksha.siak.entities.Dosen;
import src.id.ac.undiksha.siak.entities.Mahasiswa;
import src.id.ac.undiksha.siak.entities.Pegawai;

public class Main {

	public static void main(String[] args) {
		Mahasiswa mhs1 = new Mahasiswa(
				"Made Restu Wedatama",
				"Tejakula",
				true,
				"2115101077",
				"Ilmu Komputer",
				"Teknik Informatika",
				"FTK"
				);
		mhs1.printAllInfo();
		
		Dosen dosen1 = new Dosen(
				"Dosen",
				"Singaraja",
				true,
				"1213141516",
				"Ilmu Komputer",
				"Teknik Informatika",
				"FTK",
				"Dosen Ilmu Komputer"
				);
		dosen1.printAllInfo();
		
		Pegawai pegawai1 = new Pegawai(
				"Pegawai",
				"Buleleng",
				true,
				"1213141516",
				"Lab Ilmu Komputer"
				);
		pegawai1.printAllInfo();
	}
}