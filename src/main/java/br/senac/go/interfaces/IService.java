package br.senac.go.interfaces;

/**
 * C - create
 * R - readById
 * R - Read()
 * U - update
 * D - delete
 * @param <T>
 * @param <N>
 */
public interface IService<T,N> {

    public T create(T entity);

    public T readById(N id) throws Exception;

    public T read(T entity) throws Exception;

    public T update(T entity);

    public T updatePart(N id, T entity) throws Exception;

    public T updateFull(N id,T entity);

    public T deleteById(N id);

    public T delete(T entity);
}