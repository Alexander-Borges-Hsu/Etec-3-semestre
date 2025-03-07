<?php

namespace App\Http\Controllers;

use App\Http\Requests\UserRequest;
use App\Models\User;
use Illuminate\Http\Request;

class UserController extends Controller
{
    public function index()
    {
        // Recuperar os registros do banco dados 
        $users = User::orderByDesc('id')->get();
        // Carregar a VIEW 
        return view('users.index', ['users' => $users]);
    }

    public function store(UserRequest $request)
    {
        // Validar o formulário
        $request->validated();

        // Cadastrar o usuário no BD
        User::create([
            'name' => $request->name,
            'email' => $request->email,
            'password' => $request->password,
        ]);

        // Redirecionar o usuário, enviar a mensagem de sucesso
        return redirect()->route('user.index')->with('success', 'Usuário
        cadastrado com sucesso!');
    }
}
