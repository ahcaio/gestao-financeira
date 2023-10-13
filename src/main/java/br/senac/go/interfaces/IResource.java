package br.senac.go.interfaces;

import br.senac.go.model.Conta;

public interface IResource<T,N> extends GenericOperations<T,N> {

    void deleteByEntity(T entity);
}
