<?php

use App\Http\Controllers\UserController;
use Illuminate\Support\Facades\Route;

Route::get('/store-user', [UserController::class, 'store'])->name('user.store');
Route::get('/', [UserController::class, 'index'])->name('user.index');

Route::get('/', function () {
    return view('welcome');
});

