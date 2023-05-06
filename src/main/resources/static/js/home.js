
let username = document.querySelector("#username")
let password = document.querySelector("#password")

let signinBtn = document.querySelector("#signin")
let signupBtn = document.querySelector("#signup")


function signup() {

    let data = JSON.stringify({
        username : username.value,
        password : password.value
    })


    $.ajax({
        url: "/api/v1/signup",
        type: "POST",
        data: data,
        contentType: "application/json",
    })
        .done(function (data, status, xhr) {
            // test code
            console.log(data, status, xhr);
            alert("회원가입에 성공했습니다")
        })
        .fail(function (xhr, status, errorThrown) {
            console.log(xhr, status, errorThrown);

            alert("회원가입에 실패했습니다")
        })
}

function signin() {

    let data = JSON.stringify({
        username : username.value,
        password : password.value
    })


    $.ajax({
        url: "/api/v1/signin",
        type: "POST",
        data: data,
        contentType: "application/json",
    })
        .done(function (data, status, xhr) {
            console.log(data, status, xhr);
            alert("로그인에 성공했습니다")
        })
        .fail(function (xhr, status, errorThrown) {
            console.log(xhr, status, errorThrown);

            alert("로그인에 실패했습니다")
        })
}

function findpw() {

    $.ajax({
        url: `/api/v1/password?username=${username.value}`,
        type: "GET",
        contentType: "application/json",
    })
        .done(function (data, status, xhr) {
            // test code
            console.log(data, status, xhr);
            alert(`${data}`)
        })
        .fail(function (xhr, status, errorThrown) {
            console.log(xhr, status, errorThrown);

            alert(`${data}`)
        })
}