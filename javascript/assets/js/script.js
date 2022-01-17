let nome = window.document.getElementById("nome")
let txtNome = document.querySelector("#txtNome")

let email = document.querySelector("#email")
let txtEmail = document.querySelector("#txtEmail")

let assunto = document.querySelector("#assunto")
let txtAssunto = document.querySelector("#txtAssunto")

nome.style.width = "100%"
email.style.width = "100%"

function validaNome(){

    if(nome.value.length < 3){
        txtNome.innerHTML = "Nome Invalido"
        txtNome.style.color = "red"
    }
    else{
        txtNome.innerHTML = "Nome Valido"
        txtNome.style.color = "green"
    }
}

function validaEmail(){

    if(email.value.indexOf('@') == -1 || email.value.indexOf('.') == -1){
        txtEmail.innerHTML = "Email Invalido"
        txtEmail.style.color = "red"
    }
    else{
        txtEmail.innerHTML = "Email Valido"
        txtEmail.style.color = "green"
    }
}

function validaTextArea(){
    if(assunto.value == ""){
        txtAssunto.innerHTML = "Assunto Invalido"
        txtAssunto.style.color = "red"
    }
    else{
        txtAssunto.innerHTML = "Assunto Valido"
        txtAssunto.style.color = "green"
    }
}

let btn = document.querySelector("#submit-button")
btn.addEventListener('click', (e) => {
    e.preventDefault();
});

function validaForm(){
    validaNome()
    validaEmail()
    validaTextArea()
}