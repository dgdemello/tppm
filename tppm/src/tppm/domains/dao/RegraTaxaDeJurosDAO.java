/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tppm.domains.dao;

import tppm.domains.RegraTaxaDeJuros;
import tppm.exceptions.DAOExceptions.RegraTaxaDeJurosDAOException;

/**
 *
 * @author Tiago Neves + Pedro Jardim
 */
public interface RegraTaxaDeJurosDAO {
    public RegraTaxaDeJuros procurar(int numeroPrestacoes) throws RegraTaxaDeJurosDAOException;
    public int obterNumeroMinimoPrestacoes() throws RegraTaxaDeJurosDAOException;
    public int obterNumeroMaximoPrestacoes() throws RegraTaxaDeJurosDAOException;
    public void incluir(RegraTaxaDeJuros taxaDeJuros) throws RegraTaxaDeJurosDAOException;
    public void excluir(RegraTaxaDeJuros taxaDeJuros) throws RegraTaxaDeJurosDAOException;
    public void alterar(RegraTaxaDeJuros taxaDeJuros) throws RegraTaxaDeJurosDAOException;
}
