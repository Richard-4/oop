package Pertemuan3;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {new Main();}
// Array
// Sekumpulan data yang memiliki tipe data yang sama

//CRUD		Static	Dynamic
//create	  X		   V
//read		  V		   V
//update	  V		   V
//delete	  X		   V
	
	private Main () {
		staticArray();
//		dynamicArray();
	}
	
// Static Array
// merupakan sebuah array yang sizenya tidak bisa diubah
	private void staticArray() {
		int[] array = {1, 12, 31}; //cara membuat array
		array[1] = 20;
		System.out.println(array[1]);
		
		System.out.println(array.length);//panjang array
		
		// membuat array yang belum mau diisi
		Integer[] array2 = new Integer[20]; // isi array harus wrapper class
		System.out.println(array2[2]);
		array2[2] = 8;
		System.out.println(array2[2]);
		
		// foreach = for (datatype varname : aryname) 
		int tot = 0;
		for (int i : array) {
			tot += i;
		}
		System.out.println(tot);
	}
	
//  dynamic array = array yang sizenya bisa diubah
//	punya 2 jenis Vector dan arrayList dua duanya punya syntax yang sama persis
// 	Vector synchronized arrayList tidak
//	synchronized artinya semua thread dijalankan secara langsung
//	arrayList adalah versi yang lebih baru
	private void dynamicArray() {
		ArrayList<String> arylst = new ArrayList<>(); // harus diisi Wrapper class
		arylst.add("Nero");
		arylst.add("Artoria");
		arylst.add("Jeanne");
		arylst.add("Dio");
		arylst.add("Plato");
		arylst.add(1, "Argonaut"); // memasukan ke indeks 1 artinay artoria akan berubah jd index ke 2 dst
		
//		arylst.add(7, "Jack"); //bakalan error karena belum ada index ke 6
		
		// Read
		System.out.println(arylst);
		System.out.println(arylst.get(2)); // cari object
		System.out.println(arylst.indexOf("Jeanne")); // cari index dr object
		
		// Update
		arylst.set(arylst.indexOf("Dio"), "Claudio");
		System.out.println(arylst.get(4));
		
		// Delete
		arylst.remove("Argonaut");
		System.out.println(arylst.get(1)); // sama kyk add Argonaut akan ilang dan artoria bakal isi index ke 1 dst
		arylst.clear(); // clear semua arrayList
		
		// Method lain yang berguna
		arylst.contains("Nero");// cari apakah di dlm arraylist ada object yg dicari kaloa ada return true
		arylst.equals(arylst);//bandingin 2 data dlm arraylist kalo sama persis kalo sama return true
		arylst.isEmpty();//liat apakah arylst kosong atau tidak kalau kosong return true
	}
}
