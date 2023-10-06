
const btnFiltrar = document.getElementById("btnFiltrar");
const modal = document.getElementById("miModal");
const cerrarModal = document.getElementById("cerrarModal");


btnFiltrar.addEventListener("click", function () {
    modal.style.display = "block";
});


cerrarModal.addEventListener("click", function () {
    modal.style.display = "none";
});


window.addEventListener("click", function (event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
});
