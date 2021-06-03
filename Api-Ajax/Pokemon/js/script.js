function pokedex() {
    for (var i = 1; i <= 150; i++) {
        var ruta = "<img src='http://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/shiny/" + i + ".png'>";
        document.getElementById("pokemones").innerHTML += ruta;
    }
}