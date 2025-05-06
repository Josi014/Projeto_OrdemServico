/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.util.List;
import modelo.Cliente;

/**
 *
 * @author Usuário
 */
public class ClienteController {
       public List<Cliente> addCliente(Cliente c, List<Cliente> listaClientes){
        listaClientes.add(c);
        return listaClientes;
    }
}
