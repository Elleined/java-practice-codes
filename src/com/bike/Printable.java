package com.bike;
import java.util.Scanner;
import java.util.function.Supplier;

public interface Printable {
    Scanner in = new Scanner(System.in);
    Supplier<String> printDash = () -> "-----";
    Supplier<String> printChooseBrand = () -> "Choose brand type: ";
    Supplier<String> printChooseChain = () -> "Choose chain type: ";
    Supplier<String> printChooseModel = () -> "Choose model type: ";
    Supplier<String> printChooseChair = () -> "Choose chair type: ";
    Supplier<String> printChooseFrame = () -> "Choose frame type: ";
    Supplier<String> printChooseGear = () -> "Choose gear type: ";
    Supplier<String> printChoosePedal = () -> "Choose pedal type: ";
    Supplier<String> printChooseHandlebar = () -> "Choose handlebar type: ";
    Supplier<String> printChooseTire = () ->"Choose tire type: ";

    Supplier<String>[] listOfBrands = new Supplier[] {
            () -> "BMW", () -> "Topstar", () -> "Avon"
    };

    Supplier<String>[] listOfChains = new Supplier[] {
            () -> "Single Strand Chain", () -> "Double Strand Chain", () -> "Triple Strand Chain"
    };

    Supplier<String>[] listOfModels = new Supplier[] {
            () -> "Folding Bike Model", () -> "Mountain Bike Model", () -> "Road Bike Model"
    };

    Supplier<String>[] listOfChairs = new Supplier[] {
            () -> "Comfort Chair", () -> "Cruiser Chair", () -> "Racing Chair"
    };

    Supplier<String>[] listOfFrames = new Supplier[] {
            () -> "Steel Frame", () -> "Carbon Fiber Frame", () -> "Aluminum Frame"
    };

    Supplier<String>[] listOfGears = new Supplier[] {
            () -> "Single Speed Gear", () -> "Fixed Speed Gear", () -> "Hub Gear"
    };
    Supplier<String>[] listOfPedals = new Supplier[] {
            () -> "Clip Pedal", () -> "Platform Pedal", () -> "Clip Less Pedal"
    };

    Supplier<String>[] listOfHandlebars = new Supplier[] {
            () -> "Flat Handle Bar", () -> "Drop Handle Bar", () -> "Cruiser Handle Bar"
    };

    Supplier<String>[] listOfTires = new Supplier[] {
            () -> "Road Tire", () -> "Mountain Tire", () -> "Commuter Tire"
    };

    Supplier<String> printNoType = () -> "\nType cannot be empty!, Try again!";
    Supplier<String> printInputMismatch = () -> "Input Mismatch! Choose only within provided selectors";
    Supplier<String> printIndexOutOfBounds = () -> "Array index out of bounds! Choose only within provided selectors";
    Supplier<String> printUpdateBoth = () -> "\"List and String array must be both updated!\"";
}
