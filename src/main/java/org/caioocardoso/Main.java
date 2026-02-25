package org.caioocardoso;

import org.caioocardoso.command.LightPowerCommand;
import org.caioocardoso.command.SmartHouseApp;
import org.caioocardoso.command.SmartHouseCommand;
import org.caioocardoso.command.SmartHouseLight;
import org.caioocardoso.memento.ImageEditor;
import org.caioocardoso.memento.ImageEditorBackupManager;
import org.caioocardoso.strategy.ChristmasDiscount;
import org.caioocardoso.strategy.ECommerceShoppingCart;
import org.caioocardoso.strategy.ProductProtocol;

public class Main {
    public static void main(String[] args) {
//        StrategyClient();
//        CommandClient();
        MementoClient();
    }

    static void StrategyClient() {
        ECommerceShoppingCart shoppingCart = new ECommerceShoppingCart();
        shoppingCart.setDiscountStrategy(new ChristmasDiscount());
        shoppingCart.addProduct(new ProductProtocol("Camisa", 500));
        shoppingCart.addProduct(new ProductProtocol("Camisa", 500));
        shoppingCart.addProduct(new ProductProtocol("Camisa", 500));
        shoppingCart.addProduct(new ProductProtocol("Camisa", 500));
        shoppingCart.addProduct(new ProductProtocol("Camisa", 500));
        shoppingCart.addProduct(new ProductProtocol("Camisa", 500));
        shoppingCart.addProduct(new ProductProtocol("Camisa", 500));
        System.out.println(shoppingCart.getTotalPrice());
        System.out.println(shoppingCart.getTotalWithDiscount());
    }

    static void CommandClient() {
        SmartHouseLight bedroomLight = new SmartHouseLight("Luz do Quarto");
        SmartHouseCommand lightPowerCommand = new LightPowerCommand(bedroomLight);

        SmartHouseApp smartHouseApp = new SmartHouseApp();
        smartHouseApp.addCommand("btn-1", lightPowerCommand);

        smartHouseApp.executeCommand("btn-1");
        smartHouseApp.undoCommand("btn-1");
    }

    static void MementoClient() {
        ImageEditor imageEditor = new ImageEditor("/media/imagem.png", "png");
        ImageEditorBackupManager backupManager = new ImageEditorBackupManager(imageEditor);

        backupManager.backup();
        imageEditor.convertImageTo("jpg");
        System.out.println(imageEditor);
        backupManager.undo();
        System.out.println(imageEditor);
    }
}