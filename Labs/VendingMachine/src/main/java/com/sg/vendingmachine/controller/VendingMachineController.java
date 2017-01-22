package com.sg.vendingmachine.controller;

import com.sg.vendingmachine.ops.VendingMachine;
import java.util.Arrays;

/**
 *
 * @author Paul Peterson
 */
public class VendingMachineController {

    public static void main(String[] args) {

        InventoryController i = new InventoryController();
        VendingMachine vm = new VendingMachine();
        vm.initialize();
        String[] options = {"admin", "reports", "exit", "error"};
        String option = "";
        while (!option.equals("exit")) {
            double balance = 0;
            option = vm.start();
            switch (option) {
                case "admin":
                    vm.manageVendingMachine();
                    break;
                case "reports":
                    vm.displayReports();
                    break;
                case "exit":
                    if (!vm.hasBeginInvnetory()){
                        vm.closeVendingMachine();
                    }
                    break;
                default:
                    if (!Arrays.asList(options).contains(option)) {
                        balance = Double.parseDouble(option);
                        if (vm.hasBeginInvnetory()){
                            vm.autoLoadVendingMachine();
                        }
                        vm.displayVendingMachine();
                        balance = vm.makePurchase(balance);
                        vm.returnChange(balance);
                        vm.displayVendingMachine();
                    }
            }
        }
        System.out.println("Good-bye");

    }
}
