/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes_pbo;

/**
 *
 * @author user
 */
public class Tugas_akhir{
	private int x =0; 
	Dokumen ta = new Dokumen();
	private int responsi;
	private Mahasiswa [] kelompok;
	private String[] walktrough = new String [100];

	public void set_responsi(){
		this.responsi ++;
	}

	public int get_responsi(){
		return this.responsi;
	}

	public void Set_Ta(Dokumen tmp_ta){
		this.ta = tmp_ta;
	}

	public void set_jumlah_anggota(int jumlah_orang){
		this.kelompok = new Mahasiswa[jumlah_orang];
	}

	public void set_bagian_responsi(String tmp_nama_bagian){
		if (responsi < walktrough.length) {
			this.walktrough[responsi] = tmp_nama_bagian;		
		}
	}

	public void tampil_walktrough(){
		for (int i = 0;i < this.responsi; i++) {
			System.out.println("Revisi ke "+i+" revisi bagian "+walktrough[i]);
		}
	}

	public void add_anggota(String tmp_nama,String tmp_nim){
		if(x<kelompok.length == true){
			this.kelompok[x] = new Mahasiswa(tmp_nama,tmp_nim);
		}else{
			System.out.println("Kelompok Penuh ");
		}
	}
}