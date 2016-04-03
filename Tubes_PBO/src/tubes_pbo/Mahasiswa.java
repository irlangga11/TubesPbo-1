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
public class Mahasiswa extends Orang{
	private TugasAkhir tugasakhir = new TugasAkhir();
	private String nim;
	private boolean status;

	public Mahasiswa(String temp_nama, String temp_tanggal_lahir, String temp_email, char temp_jenis_kelamin, String temp_password, String temp_nim){
		super.tanggal_lahir = temp_tanggal_lahir;
		super.jenis_kelamin = temp_jenis_kelamin;
		super.password = temp_password;
		super.email = temp_email;
		super.nama = temp_nama;		
		this.nim = temp_nim;
	}
	
	public void set_TA(TugasAkhir tmp_tugas_akhir){
		this.tugasakhir=tmp_tugas_akhir;
	}
	public void set_nim(String tmp_nim){
		if(tmp_nim.matches("1301(.*)") == true){
			this.nim=tmp_nim;
		}else{
			System.out.println("Nim salah");
		}
	}

	public String get_nim(){
		return this.nim;
	}

	public TugasAkhir get_TA(){
		return this.tugasakhir;
	}
	
	public void set_Status(int x){
		if(x == 1){
			this.status=true;
		}else if (x == 0) {
			this.status = false;
		}else{
			System.out.println("Status Salah");
		}
	}

	public boolean get_status(){
		return this.status;
	}
}