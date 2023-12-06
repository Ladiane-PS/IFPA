/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifpa.BancoTeste.control;

import com.ifpa.BancoTeste.mode.ContaB;
import com.ifpa.BancoTeste.mode.ContaBV;
import com.ifpa.BancoTeste.repo.ContaR;
import com.ifpa.BancoTeste.repo.ContaVR;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifpa.banco.modelo.ContaBancaria;
import br.com.ifpa.banco.modelo.ContaBancariaVersionada;
import br.com.ifpa.banco.repositorio.ContaRepo;
import br.com.ifpa.banco.repositorio.ContaVersionadaRepo;

 *
 * @author LADY
 */
@RestController
public class ContaBC {

	@Autowired
	private ContaR contasRepo;
	
	@Autowired
	private ContaVR contasVersionadasRepo;

	@GetMapping("/listagem/contas")
	public List<ContaB> listarContas() {
		return contasRepo.findAll();
	}
	
	@GetMapping("/listagem/contas/versionadas")
	public List<ContaBV> listarContasVersionadas() {
		return contasVersionadasRepo.findAll();
	}

	@PutMapping("/depositar/conta/{id}")
	public String depositar(@PathVariable Long id, @RequestParam float valor) {
		ContaB conta = contasRepo.findById(id).orElse(null);
		conta.setSaldo(conta.getSaldo() + valor);
		contasRepo.save(conta);
		return "A operação de depósito foi bem-sucedida!";
	}
	
	@PutMapping("/depositar/conta/versionada/{id}")
	public String depositarContaVersionada(@PathVariable Long id, @RequestParam float valor) {
		ContaBV conta = contasVersionadasRepo.findById(id).orElse(null);
		conta.setSaldo(conta.getSaldo() + valor);
		contasVersionadasRepo.save(conta);
		return "A operação de depósito foi bem-sucedida!";
	}

	@PutMapping("/retirar/conta/{id}")
	public String retirar(@PathVariable Long id, @RequestParam float valor) {
		ContaB conta = contasRepo.findById(id).orElse(null);
		if (conta.getSaldo() >= valor) {
			conta.setSaldo(conta.getSaldo() - valor);
			contasRepo.save(conta);
			return "A operação de retirada foi bem-sucedida!";
		} else {
			return "Saldo insuficiente. A retirada não pode ser processada.";
		}
	}
	
	@PutMapping("/retirar/conta/versionada/{id}")
	public String retirarContaVersionada(@PathVariable Long id, @RequestParam float valor) {
		ContaBV conta = contasVersionadasRepo.findById(id).orElse(null);
		if (conta.getSaldo() >= valor) {
			conta.setSaldo(conta.getSaldo() - valor);
			contasVersionadasRepo.save(conta);
			return "A operação de retirada foi bem-sucedida!";
		} else {
			return "Saldo insuficiente. A retirada não pode ser processada.";
		}
	}

}


