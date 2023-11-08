package EngenhariaDeSoftware.Cardapio.Controller;

import EngenhariaDeSoftware.Cardapio.Entity.Cardapio;
import EngenhariaDeSoftware.Cardapio.Repository.CardapioRepository;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Cardapio")
public class CardapioController
{
    @Autowired
    private CardapioRepository _cardapioRepository;

    @SneakyThrows
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public Cardapio Salvar(@RequestBody Cardapio cardapio)
    {
        try
        {
            if (cardapio == null) throw new IllegalArgumentException("Imagem is required");
            return _cardapioRepository.save((cardapio));
        }
        catch (Exception e)
        {
            throw new Exception(e.getMessage());
        }
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<Cardapio> getAll()
    {
        return _cardapioRepository.findAll();
    }
}
