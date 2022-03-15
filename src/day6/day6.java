package day6;

import java.util.Scanner;

public class day6 {

	public static void main(String[] args) {

		// cau 1
		Scanner scanner = new Scanner(System.in);
		System.out.println(" moi nhap n : ");
		int n = scanner.nextInt();
		float s = tinh(n);
		System.out.println("tong s = " + s);

		// cau 2
		int tich = tichUSL(n);
		System.out.println("tich tat ca cac uoc so le cua 'n' la : " + tich);

		// cau 3
		int tong = tongN(n);
		System.out.println("tong cac uoc nho hon n la : " + tong);

		// cau 4
		int tichLe = tinhTichLe(n);
		System.out.println("tich cac chu so le cua n la : " + tichLe);

		// cau 5
		int soDauTien = soDauTien(n);
		System.out.println("chu so dau tien cua so n la : " + soDauTien);

		// cau 6
		int SDN = soDaoNguoc(n);
		System.out.println(" so dao nguoc cua so n la : " + SDN);

		// cau 7
		int sLN = soLonNhat(n);
		System.out.println("chu so lon nhat la : " + sLN);

		// cau 8
		System.out.println(" moi nhap a : ");
		int a = scanner.nextInt();
		System.out.println(" moi nhap b : ");
		int b = scanner.nextInt();
		int UCLN = uCLN(a, b);
		System.out.println("uoc chung lon nhat cua a va b la : " + UCLN);

		// cau 8
		int BCNN = bCNN(a, b);
		System.out.println("boi chung nho nhat cua a va b la : " + BCNN);

	}

	public static float tinh(int n) {
		float s = 0.0f;
		for (int i = 1; i <= n; i++) {
			s = s + (i / (i + 1.00f));
		}
		return s;
	}

	public static int tichUSL(int n) {
		int tich = 1;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0 && i % 2 != 0) {
				tich = tich * i;
			}
		}
		return tich;
	}

	public static int tongN(int n) {
		int tong = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				tong = tong + i;
			}
		}
		return tong;
	}

	public static int tinhTichLe(int n) {
		int tich = 1;
		do {
			int tam = n % 10;
			if (tam % 2 != 0) {
				tich = tich * tam;
			}
			n = n / 10;
		} while (n != 0);
		return tich;
	}

	public static int soDauTien(int n) {
		int SDT = n;
		if (n > 10) {
			do {
				SDT = n % 10;
				n = n / 10;
			} while (n != 0);
		}
		return SDT;
	}

	public static int soLonNhat(int n) {
		int SLN = 0;
		if (n > 10) {
			do {
				int tam = n % 10;
				if (tam > SLN) {
					SLN = tam;
				}
				n = n / 10;
			} while (n > 0);
		} else {
			SLN = n;
		}
		return SLN;

	}

	public static int uCLN(int a, int b) {
		int SLH = 0;
		int UCLN = 1;
		if (a >= b) {
			SLH = a;
		} else {
			SLH = b;

		}
		for (int i = 1; i <= SLH; i++) {
			if (a % i == 0 && b % i == 0) {
				UCLN = i;
			}
		}
		return UCLN;
	}

	public static int bCNN(int a, int b) {
		int BC = a * b;
		int BCNN = a * b;
		int SLH = 1;
		if (a >= b) {
			SLH = a;
		} else {
			SLH = b;

		}
		for (int i = BC; i >= SLH; i--) {
			if (i % a == 0 && i % b == 0) {
				BCNN = i;
			}
		}
		return BCNN;
	}

	public static int soDaoNguoc(int n) {
		int SDN = 0;
		do {
			SDN = SDN * 10 + n % 10;
			n = n / 10;
		} while (n > 0);
		return SDN;
	}
}
