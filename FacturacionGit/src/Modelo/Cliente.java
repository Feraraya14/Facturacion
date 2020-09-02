/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Cliente {
    
    private static final long serialVersionUID = 1L;
    public static final String nomTabla = "clientes";
    public static final String nomIdColumna = "ID_CLI";
    public static final String SELECT_ALL = "select * from clientes where ACTIVO=1";
    public final String SELECT_POR_CODIGO = "select * from clientes where ACTIVO=1 AND ID_CLI like  ";
    public final String SELECT_POR_NOMBRE = "select * from clientes where ACTIVO=1 AND NOM_CLI like ";
    public final String SELECT_POR_RUC = "select * from clientes where ACTIVO=1 AND CER_CLI like ";
    public static final String ELIMINAR_POR_ESTADO = "UPDATE clientes SET ACTIVO = ";
    public static final String ULTIMO_CLIENTE = "SELECT * FROM "+nomTabla+" where ACTIVO=1 ORDER BY "+nomIdColumna+" DESC LIMIT 1";
     
    private Double saldo;
    

    public Cliente(Double saldo, Date fechaIngreso) {
        this.saldo = saldo;
        this.fechaIngreso = fechaIngreso;
    }

    public Cliente() {
        
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
}
  