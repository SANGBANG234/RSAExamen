/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.io.Serializable;
import java.math.BigInteger;

/**
 *
 * @author Omar
 */
public class Paquete implements Serializable {
    String ipOrigen;
    String ipDestino;
    String usuario;
    String mensaje;
    BigInteger[] msjcifrado;
    BigInteger clavPriv;
    BigInteger n;
    BigInteger d;

    public Paquete(String ipOrigen, String ipDestino, String usuario, String mensaje, BigInteger[] msjcifrado,
    BigInteger clavPriv, BigInteger n, BigInteger d) {
        this.ipOrigen = ipOrigen;
        this.ipDestino = ipDestino;
        this.usuario = usuario;
        this.mensaje = mensaje;
        this.msjcifrado = msjcifrado;
        this.clavPriv=clavPriv;
        this.d = d;
        this.n = n;
    }

    public Paquete() {
    }

    public String getIpOrigen() {
        return ipOrigen;
    }

    public void setIpOrigen(String ipOrigen) {
        this.ipOrigen = ipOrigen;
    }

    public String getIpDestino() {
        return ipDestino;
    }

    public void setIpDestino(String ipDestino) {
        this.ipDestino = ipDestino;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public BigInteger[] getMsjcifrado() {
        return msjcifrado;
    }

    public void setMsjcifrado(BigInteger[] msjcifrado) {
        this.msjcifrado = msjcifrado;
    }

    public BigInteger getClavPriv() {
        return clavPriv;
    }

    public void setClavPriv(BigInteger clavPriv) {
        this.clavPriv = clavPriv;
    }

    public BigInteger getN() {
        return n;
    }

    public void setN(BigInteger n) {
        this.n = n;
    }

    public BigInteger getD() {
        return d;
    }

    public void setD(BigInteger d) {
        this.d = d;
    }
    
    
}
