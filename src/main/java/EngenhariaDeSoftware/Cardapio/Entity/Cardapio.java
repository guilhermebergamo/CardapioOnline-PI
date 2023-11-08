package EngenhariaDeSoftware.Cardapio.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data //cria Get - Set.
@AllArgsConstructor //Criar construtor com as propriedades dessa classe.
@NoArgsConstructor  //Criar construtor vazio.
@Builder
@Entity //Entididade do BD.
public class Cardapio implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column(nullable = false)
    private String Titulo;

    @Column(nullable = false)
    private double Preco;

    @Column(nullable = false)
    private String Imagem;
}
