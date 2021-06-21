
import java.util.*;

public class Pitch {
    private ArrayList<Proyecto> projects = new ArrayList<>();
    
    public Pitch(){};

    public void addProject(Proyecto planes){
        this.projects.add(planes);
    }
    
    public ArrayList<Proyecto> getProjects(){
        return this.projects;
    }
}