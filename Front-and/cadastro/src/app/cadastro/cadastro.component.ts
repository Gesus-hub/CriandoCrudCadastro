import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Postagem } from '../model/Postagem';
import { PostagemService } from '../service/postagem.service';

@Component({
  selector: 'app-cadastro',
  templateUrl: './cadastro.component.html',
  styleUrls: ['./cadastro.component.css']
})
export class CadastroComponent implements OnInit {

  postagem: Postagem = new Postagem()

  listaPostagem: Postagem[]

  constructor(
    private router: Router,
    private postagemService: PostagemService
  ) { }

  ngOnInit(){
    this.verPostagem()
  }

  cadastrar(){
    this.postagemService.postPostagem(this.postagem).subscribe((resp: Postagem) => {
      this.postagem = resp
      alert('Participante cadastrado com sucesso!')

      this.postagem = new Postagem()

      this.verPostagem()

    })
  }

  verPostagem(){
    this.postagemService.getAllPostagens().subscribe((resp: Postagem[]) => {
      this.listaPostagem = resp

    })
  }

}
