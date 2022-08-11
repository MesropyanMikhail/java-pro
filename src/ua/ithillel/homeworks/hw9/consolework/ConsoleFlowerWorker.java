package ua.ithillel.homeworks.hw9.consolework;

import ua.ithillel.homeworks.hw9.exception.InvalidSteamLengthException;
import ua.ithillel.homeworks.hw9.model.Accessory;
import ua.ithillel.homeworks.hw9.model.Bouquet;
import ua.ithillel.homeworks.hw9.model.Flower;
import ua.ithillel.homeworks.hw9.utils.ArrayUtils;
import ua.ithillel.homeworks.hw9.worker.FlowerShop;

import java.lang.reflect.Field;
import java.util.Scanner;

public class ConsoleFlowerWorker {

    private Scanner scanner;
    private FlowerShop flowerShop;

    public ConsoleFlowerWorker(FlowerShop flowerShop) {
        this.flowerShop = flowerShop;
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        FlowerShop flowerShop = new FlowerShop();
        ConsoleFlowerWorker flowerWorker = new ConsoleFlowerWorker(flowerShop);
        flowerWorker.mainMenu();
        flowerWorker.stop();
    }

    public void mainMenu() {
        int typing = 0;

        do {
            System.out.println("1. Create bouquet\n" +
                    "2. Bouquet operations\n" +
                    "3. Print bouquets\n" +
                    "0. Exit");

            if (scanner.hasNextInt()) {
                typing = scanner.nextInt();
                switch (typing) {
                    case 1:
                        Bouquet currentBouquet = createBouquet();
                        flowerShop.addBouquet(currentBouquet);
                        System.out.println("Created bouquet price " + currentBouquet.totalСost()); // PRICE!!!
                        break;
                    case 2:
                        bouquetOperations();
                        break;
                    case 3:
                        printBouquets();
                        break;
                    default:
                        System.out.println("Error. There is no such menu item.");
                        break;
                }
            } else {
                typing = -1;
                System.out.println("Error.Enter the number corresponding to the menu item");
                scanner.next();
            }
        } while (typing != 0);
    }

    private void bouquetOperations() {
        int typing = 0;
        Bouquet choosedBouquet;
        printBouquets();
        choosedBouquet = ChooseBouquet();
        do {
            System.out.println("1. Sort flowers by days to live.\n" +
                    "2. Find flowers by stem length.\n" +
                    "3. Bouquet price.\n" +
                    "4. Add flower.\n" +
                    "5. Add accessory.\n" +
                    "0. Back to main menu.");

            if (scanner.hasNextInt()) {
                typing = scanner.nextInt();
                switch (typing) {
                    case 1:
                        ArrayUtils.SortFlowersByDaysTolive(choosedBouquet);
                        break;
                    case 2:
                        printFlowersByStemLength(choosedBouquet);
                        break;
                    case 3:
                        System.out.println(choosedBouquet.totalСost());
                        break;
                    case 4:
                        createFlower(choosedBouquet);
                        break;
                    case 5:
                        addAccessory(choosedBouquet);
                        break;
                    default:
                        System.out.println("Error. There is no such menu item.");
                        break;
                }
            } else {

                typing = -1;
                System.out.println("Error.Enter the number corresponding to the menu item");
                scanner.next();
            }
            printBouquets();
        } while (typing != 0);
    }

    private Bouquet ChooseBouquet() {
        int typing = 0;
        Bouquet[] bouquets = flowerShop.getBouquets();
        do {
            System.out.println("Choose a bouquet");
            if (scanner.hasNextInt()) {
                typing = scanner.nextInt();
                if (typing <= (bouquets.length - 1) && typing >= 0) {
                    return bouquets[typing];
                } else {
                    System.out.println("Error. Inputting the number of bouquet.");
                }

            } else {
                System.out.println("Error. Inputting the number of bouquet.");
                scanner.next();
            }
        } while (true);
    }

    private Bouquet createBouquet() {
        Bouquet bouquet = new Bouquet();
        int typing = 0;

        do {
            System.out.println("1. Create flower.\n" +
                    "2. Create accessory.\n" +
                    "0. Back to main menu.");

            if (scanner.hasNextInt()) {
                typing = scanner.nextInt();
                switch (typing) {
                    case 1:
                        addFlower(bouquet);
                        break;
                    case 2:
                        addAccessory(bouquet);
                        break;
                    default:
                        System.out.println("Error. There is no such menu item.");
                        break;
                }
            } else {
                System.out.println("Error.Enter the number corresponding to the menu item");
                scanner.next();
            }
        } while (typing != 0);
        return bouquet;
    }

    private void addFlower(Bouquet currentBouquet) {

        int typing = 0;

        do {
            System.out.println("1. New flower.\n" +
                    "0. Back to menu create bouquet.");

            if (scanner.hasNextInt()) {
                typing = scanner.nextInt();
                switch (typing) {
                    case 1:
                        createFlower(currentBouquet);
                        break;
                    default:
                        System.out.println("Error. There is no such menu item.");
                        break;
                }
            } else {
                typing = -1;
                System.out.println("Error.Enter the number corresponding to the menu item");
                scanner.next();
            }
        } while (typing != 0);
    }

    private void createFlower(Bouquet currentBouquet) {
        Flower flower = new Flower();
        System.out.println("Enter title");
        flower.setTitle(scanner.next());
        System.out.println("Enter price");
        flower.setPrice(scanner.nextDouble());
        System.out.println("Enter days to live");
        flower.setDaysToLive(scanner.nextInt());
        System.out.println("Enter stem length");
        flower.setStemLength(scanner.nextInt());
        flowerShop.addFlowerToBouquet(flower, currentBouquet);
    }

    private void addAccessory(Bouquet currentBouquet) {
        int typing = 0;

        do {
            System.out.println("1. New accessory.\n" +
                    "0. Back to menu create bouquet.");

            if (scanner.hasNextInt()) {
                typing = scanner.nextInt();
                switch (typing) {
                    case 1:
                        createAccessory(currentBouquet);
                        break;
                    default:
                        System.out.println("Error. There is no such menu item.");
                        break;
                }
            } else {
                typing = -1;
                System.out.println("Error.Enter the number corresponding to the menu item");
                scanner.next();
            }
        } while (typing != 0);
    }

    private void createAccessory(Bouquet currentBouquet) {
        Accessory accessory = new Accessory();
        System.out.println("Enter title");
        accessory.setTitle(scanner.next());
        System.out.println("Enter price");
        accessory.setPrice(scanner.nextDouble());
        flowerShop.addAccessoryToBouquet(accessory, currentBouquet);
    }

    private void printBouquets() {
        int bouquetIndex = 0;

        for (Bouquet bouquet : flowerShop.getBouquets()) {
            System.out.println("Bouquet " + bouquetIndex++ + " \n" + bouquet.toString());
        }
    }

    private void printFlowersByStemLength(Bouquet choosedBouquet) {
        Flower[] foundFlowers = new Flower[]{};
        try {
            foundFlowers = findFlowersByStemLength(choosedBouquet.getFlowers());

        } catch (InvalidSteamLengthException exception) {
            System.out.println(exception.getMessage());
        }
        if (foundFlowers.length > 0) {
            for (Flower flower : foundFlowers) {
                System.out.println(flower.toString());
            }
        } else {
            System.out.println("No flower matching the search criteria was found");
        }
    }

    private Flower[] findFlowersByStemLength(Flower[] flowers) throws InvalidSteamLengthException {
        int minStemLength;
        int maxStemLength;
        System.out.println("Enter min stem length");
        minStemLength = scanner.nextInt();
        System.out.println("Enter max stem length");
        maxStemLength = scanner.nextInt();
        if ((minStemLength < 0) || (maxStemLength < 0))
            throw new InvalidSteamLengthException("The number is less than 0");
        return ArrayUtils.findFlowersByStemLength(flowers, minStemLength, maxStemLength);
    }

    private void stop() {
        scanner.close();
        System.out.println("Goodbye, have a nice day.");
        System.exit(0);
    }

}
