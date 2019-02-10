package TIJ_examples.Seventeen_Containers;

import TIJ_examples.net.mindview.util.RandomGenerator;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionDataGeneration {
    public static void main(String[] args){
        System.out.println(new ArrayList<String>(
                CollectionData.list(
                        new RandomGenerator.String(9),10)));
        System.out.println(new HashSet<Integer>(
                new CollectionData<Integer>(
                        (Generator<Integer>) new RandomGenerator.Integer(),10)));
    }
}
