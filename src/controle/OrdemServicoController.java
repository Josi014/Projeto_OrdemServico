/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.util.List;
import modelo.OrdemServico;

/**
 *
 * @author Usuário
 */
public class OrdemServicoController {
     public List<OrdemServico> addOrdemServico(OrdemServico s, List<OrdemServico> listaOrdemServico){
        listaOrdemServico.add(s);
        return listaOrdemServico;
    }
}
