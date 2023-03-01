/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator_program;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class GetData {

    Scanner sc = new Scanner(System.in);

    public int UserSelectOption() {
        System.out.print("Your choice: ");
        int option = 0;
        //check select optipn must be number in range 1 - 4
        while (true) {
            try {
                option = Integer.parseInt(sc.nextLine());
                if (option >= 1 && option <= 4) {
                    break;
                } else {
                    System.out.print("Option must be in range 1 - 4!" + "\n" + "Your choice: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid option, input again!" + "\n" + "Your choice: ");
            }

        }
        return option;
    }
}
