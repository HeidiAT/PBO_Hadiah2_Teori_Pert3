import java.util.Scanner;

public class TugasTeori1_2
{
	public static void main(String[] args)
	{		
		Scanner input = new Scanner(System.in);
		
		String nama, alamat;
		int umur;
		
		System.out.print("Masukkan nama: ");
			nama = input.nextLine();
		System.out.print("Masukkan Alamat: ");
			alamat = input.nextLine();
		System.out.print("Masukkan Umur: ");
			umur = input.nextInt();
		System.out.println();
		
		System.out.println("Saudara   : "+nama);
		System.out.println("Tinggal di: "+alamat);
		System.out.println("Berumur   : "+umur+" tahun");
	}
}