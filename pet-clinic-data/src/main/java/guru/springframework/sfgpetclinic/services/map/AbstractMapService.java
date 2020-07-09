package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.BaseEntity;

import java.util.*;

/**
 * @author d.monterey on 09/07/2020
 */
public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save(T object){
        if(object != null){
            if(object.getId() == null){
                object.setId(getNextId());
            }

            map.put(object.getId(), object);
        }else{
            throw new RuntimeException("Object cannot be null");
        }

        return object;
    }

    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    void deleteById(ID id){
        map.entrySet().removeIf(entry -> entry.getKey().equals(id));
    }

    private Long getNextId(){
//        Long nextId;
//
//        try{
//            nextId = Collections.max(map.keySet()) + 1;
//        }catch(NoSuchElementException e){
//            nextId = 1L;
//        }

        return map.keySet().isEmpty() ? 1L : Collections.max(map.keySet()) + 1;

        //return nextId;
    }
}
