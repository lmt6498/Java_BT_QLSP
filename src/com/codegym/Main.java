package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManageProduct product = new ManageProduct();
        int choice;
        while (true) {
            System.out.println("Manage Product: ");
            System.out.println("1.Insert Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Update Product");
            System.out.println("4. Search Product");
            System.out.println("5. Sort:");
            System.out.println("0. Exit");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập ID: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập tên: ");
                    String name = sc.nextLine();
                    System.out.println("Nhập giá: ");
                    Float price = Float.parseFloat(sc.nextLine());
                    product.addProduct(id,name,price);
                    product.Display();
                    break;
                case 2:
                    System.out.println("Nhập ID cần xóa: ");
                    int id1 = Integer.parseInt(sc.nextLine());
                    product.deleteProduct(id1);
                    product.Display();
                    break;
                case 3:
                    System.out.println("Nhập ID cần sửa: ");
                    int idUpdate = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập tên: ");
                    String nameUpdate = sc.nextLine();
                    System.out.println("Nhập giá: ");
                    Float priceUpdate = Float.parseFloat(sc.nextLine());
                    product.updateProduct(idUpdate, nameUpdate,priceUpdate);
                    product.Display();
                    break;
                case 4:
                    System.out.println("Nhập tên: ");
                    String name3 = sc.nextLine();
                    product.searchProduct(name3);
                    break;
                case 5:
                    System.out.println("Sắp xếp theo giá: ");
                    product.Sort();
                    product.Display();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
