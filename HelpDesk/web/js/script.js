/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function GoToIndex(){
    window.location.href = "index.html";
}

function GoToCadastroCliente(){
    window.location.href = "CadastroCliente.html";
}

function GoToCadastroEmpresa(){
    window.location.href = "CadastroEmpresa.html";
}

function CadastrarCliente(usuario,senha){
    var request = new XMLHttpRequest();
    request.open("GET", "http://localhost:8080/HelpDesk/ServletCadastroUsuario?usuario=" + usuario + "&senha=" + senha, true);
    request.send();
 }

function CadastrarEmpresa(nomefantasia,razaosocial,cnpj){
    var request = new XMLHttpRequest();
    request.open("GET", "http://localhost:8080/HelpDesk/ServletCadastroEmpresa?nomefantasia=" + nomefantasia + "&razaosocial=" + razaosocial + "&cnpj=" + cnpj, true);
    request.send();
 }