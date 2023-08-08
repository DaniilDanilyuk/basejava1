package Practice1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayStorage arrayStorage = new ArrayStorage();
        Resume resume = new Resume(1,"Main");
        arrayStorage.save(resume);
        arrayStorage.save(new Resume(2,"Dading"));
        arrayStorage.save(new Resume(3,"Maming"));
        arrayStorage.save(new Resume(4,"Fort"));
        System.out.println(Arrays.toString(arrayStorage.resumes));
        arrayStorage.delete(3);
        System.out.println(Arrays.toString(arrayStorage.resumes));
        System.out.println(arrayStorage.getSize());
        arrayStorage.clear();
        System.out.println(Arrays.toString(arrayStorage.resumes));

    }
}
