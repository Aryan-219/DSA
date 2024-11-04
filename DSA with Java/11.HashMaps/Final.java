import java.util.ArrayList;
import java.util.LinkedList;

public class Final<K, V> {
    ArrayList<LinkedList<Entity>> list;

    private int size = 0;
    private float lf = 0.5f;

    public Final() {
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<>());
        }
    }

    public void put(K key, V value) {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);
        for (Entity entity : entities) {
            if (entity.key.equals(key)) {
                entity.value = value;
                return;
            }
        }
        if ((float) (size) / list.size() > lf) { 
            reHash();
        }
        entities.add(new Entity(key, value));
        size++; 
    }

    private void reHash(){
        System.out.println("We are now rehashing the list");
        ArrayList<LinkedList<Entity>> oldList = list;
        
        list = new ArrayList<>();

        size = 0; 

        for(int i = 0 ; i < oldList.size() * 2 ; i++){
            list.add(new LinkedList<>());
        }
        
        for(LinkedList<Entity> entries : oldList){
            for(Entity entity : entries){
                put(entity.key, entity.value);
            }
        }
    }
    public V get(K key){
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);
        for (Entity entity : entities) {
            if (entity.key.equals(key)) {
                return entity.value;
            }
        }
        return null;
    }

    public void remove (K key){
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);
        for (int i = 0; i < entities.size(); i++) {
            Entity entity = entities.get(i);
            if (entity.key.equals(key)) {
                entities.remove(i);
                size--;
                return;
            }
        }
    }
    private class Entity {
        K key;
        V value;

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
