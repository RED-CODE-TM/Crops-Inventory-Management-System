/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cropinventorymanager;

/**
 *
 * @author uyser
 */
import java.util.Scanner;

public class CropInventoryManager {
    private static String[] crops;
    
    private static int[] quantities;
    private static Scanner sscrop = new Scanner(System.in);

    public static void main(String[] args) {
        initializingInventory();
        displayingMenu();
    }

    private static void initializingInventory() {
        // Initialize arrays with some default values
        crops = new String[]{"MAIZE", "POTATOES", "RICE"};
        quantities = new int[]{900, 450, 300};
    }

   