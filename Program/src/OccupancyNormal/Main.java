package OccupancyNormal;


import java.io.IOException;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Budi Pradnyana
 */
public class Main {
        public static void main(String[] args) throws IOException, BiffException, WriteException {
        Backpropagation ann = new Backpropagation();
        ann.Belajar();
        System.out.println("");
        System.out.println("Testing JST : ");
        ann.Testing();
    }
}
