package com.bike.buildprocess;

import com.bike.Printable;

import java.util.InputMismatchException;
import java.util.List;

abstract class GeneralProcess<T> implements Printable {
    abstract void process();

    abstract List<T> generateList() ;

    abstract T getType();

    abstract void displayList() ;

    void select(List<T> typeList) {
        try {
            final int select = in.nextInt();
            getCurrentType(typeList, select);
            getSelected(select);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(printIndexOutOfBounds.get());
        } catch (InputMismatchException ime) {
            System.out.println(printInputMismatch.get());
        }
    }

    abstract void getCurrentType(List<T> typeList, int select);
    abstract void getSelected(int select);
}
