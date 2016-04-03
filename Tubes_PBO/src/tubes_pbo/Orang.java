/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes_pbo;

/**
 *
 * @author user rizky ujiansyah
 */
public abstract class Orang{
	protected String nama;
	protected String tanggal_lahir;
	protected String email;
	protected char jenis_kelamin;
	protected String foto_profil;
	protected String password;
	
	public void setNama(String nama){
		this.nama=nama;
	}

	public String getNama(){
		return nama;
	}

	public void setPassword(String password){
		this.password=password;
	}

	public String getPassword(){
		return password;
	}

	public void setTanggal_lahir(String tanggal_lahir){
		this.tanggal_lahir=tanggal_lahir;
	}

	public String getTanggal_lahir(){
		return tanggal_lahir;
	}

	public void setEmail(String email){
		this.email=email;
	}

	public String getEmail(){
		return email;
	}

	public void setJenis_kelamin(char jenis_kelamin){
		if(jenis_kelamin == 'L' || jenis_kelamin == 'P'){
			this.jenis_kelamin=jenis_kelamin;
		}else{
			System.out.println("Jenis kelamin Salah");
		}
	}

	public char getJenis_kelamin(){
		return jenis_kelamin;
	}
	
	public void setFoto_profil(String foto_profil){
		this.foto_profil=foto_profil;
	}

	public String getFoto_profil(){
		return foto_profil;
	}
}