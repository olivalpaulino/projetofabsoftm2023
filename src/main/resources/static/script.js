(function(){
    $("#tabproduto").on("click","js.delete", function(){
        let botaoClicado = $(this);
        $("#btnsim").attr("data-id", botaoClicado.attr("data-id"))
        $("#modalproduto").modal("show");
    })
    $("#btnsim").on("click", function(){
        let botaoSim = $(this);
        let od = botaoSim.attr("data-id")
        $.ajax({
            url: "/produto/remover/" + id,
            method: "GET",
            success:  function(){
                window.location.href = "/produto"
            }
        })
    })

})();
