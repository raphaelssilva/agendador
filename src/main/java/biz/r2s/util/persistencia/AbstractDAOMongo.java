package biz.r2s.util.persistencia;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import biz.r2s.util.model.MongoDBModel;

public abstract class AbstractDAOMongo<T> implements DAO<T> {

	private Class<T> classe;
	
	@Autowired
	private MongoTemplate mongoTemplate;
	    
	
	@SuppressWarnings("unchecked")
	public AbstractDAOMongo(){
		this.classe = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	@Override
	public T create(T object) {
		if (!mongoTemplate.collectionExists(classe)) {
            mongoTemplate.createCollection(classe);
        }       
		try {
			((MongoDBModel)object).setId(UUID.randomUUID().toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
        mongoTemplate.insert(object, classe.getSimpleName().toLowerCase());	
        return object;
	}

	@Override
	public T edit(T object) {
		mongoTemplate.save(object, classe.getSimpleName().toLowerCase());
		return object;
	}

	@Override
	public void delete(T object) {
		mongoTemplate.remove(object, classe.getSimpleName().toLowerCase());
	}


	@Override
	public List<T> findAll() {		
		return mongoTemplate.findAll(classe, classe.getSimpleName().toLowerCase());
	}

	@Override
	public List<T> findBy(String filtro) {
		List<T> list = null;
		
		return list;
	}
	
	@Override
	public T find(String id) {
		return mongoTemplate.findById(id, classe);
	}
	
	public Query createQuery(){
		return null;
	}

}
