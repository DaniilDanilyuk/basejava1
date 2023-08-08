package Practice1;

import java.util.Arrays;

public class ArrayStorage {
    Resume [] resumes = new Resume[1000];
    private int size =0;

    public int getSize() {
        return size;
    }

    public void save(Resume resume){
        resumes[size]=resume;
        size+=1;
    }

    public void delete(int n){
        for(int i = n; i<size;i++){
            resumes[n]=resumes[n+1];
        }
        size-=1;
    }

    public void clear(){
        Arrays.fill(resumes,null);
        size=0;
    }

    public void getAll(){
        Arrays.toString(resumes);
    }


}