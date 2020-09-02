/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ASUS
 */
public class FacturaDetalle {
     private static final long serialVersionUID = 1L;
    public static final String nomTabla = "facv_det";
    public static final String SELECT_ALL = "select * from facv_det";
    public static final String SELECT_POR_FACTURA = "select * from facv_det where NUM_FACV like ";
    
    
    private Integer id;
    private String idArticulo;
    private Articulo articulo;
    private Factura factura;
    private Double precioVenta;
    private Integer cantidad;
    private String numeroFactura;

    public FacturaDetalle(Integer id, String idArticulo, Double precioVenta, Integer cantidad, String numeroFactura) {
        this.id = id;
        this.idArticulo = idArticulo;
        this.precioVenta = precioVenta;
        this.cantidad = cantidad;
        this.numeroFactura = numeroFactura;
    }

    public FacturaDetalle(String idArticulo, Double precioVenta, Integer cantidad, String numeroFactura) {
        this.idArticulo = idArticulo;
        this.precioVenta = precioVenta;
        this.cantidad = cantidad;
        this.numeroFactura = numeroFactura;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }
    
    public FacturaDetalle() {
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(String idArticulo) {
        this.idArticulo = idArticulo;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    @Override
    public String toString() {
        return  numeroFactura+" "+precioVenta;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FacturaDetalle other = (FacturaDetalle) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

}
