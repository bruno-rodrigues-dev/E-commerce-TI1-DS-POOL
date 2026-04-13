package br.com.ecommerce.controllers;

import br.com.ecommerce.EcommerceApplication;
import br.com.ecommerce.models.Produto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")

public class ProdutosController {
    List<Produto> produtos = List.of(
            new Produto(200.00,"Echo Dot", "Caixa de som inteligente com assistente virtual, que responde comandos de voz, toca música, controla dispositivos da casa e ajuda no dia a dia com lembretes, notícias e informações rápidas.", "https://fastcompanybrasil.com/wp-content/uploads/2025/10/Conectar-Alexa-Wifi.jpg" ),
            new Produto(250.00, "Controle Sem Fio DualSense Midnight Black", "Controle sem fio com feedback háptico e gatilhos adaptáveis, oferecendo maior imersão nos jogos, além de microfone embutido e design ergonômico para conforto durante longas sessões.", "https://m.media-amazon.com/images/I/517nIWAoJFL._AC_SX679_.jpg"),
            new Produto(700, "Bicicleta", "Bicicleta versátil com estrutura resistente, ideal para deslocamentos urbanos ou lazer, oferecendo conforto, estabilidade e bom desempenho em diferentes terrenos.", "https://cdn.awsli.com.br/2594/2594021/produto/332008049/bw-8-0-laranja-lldzg4vkc6.jpg"),
            new Produto(500, "Monitor Samsung", "Monitor com tela de alta definição, oferecendo imagens nítidas, cores vivas e bom desempenho para trabalho e entretenimento.", "https://www.notebookcheck.info/fileadmin/_processed_/webp/Notebooks/News/_nc3/Odyssey_Neo_G7_dl255-q82-w2560-h.webp" ),
            new Produto(1000, "Iphone 11", "Smartphone com tela de 6,1 polegadas, bom desempenho e câmera dupla de alta qualidade, ideal para fotos, vídeos e uso diário com fluidez.", "https://buy.gazelle.com/cdn/shop/files/iPhone_11_Pro_Max_-_Space_Gray_-_Angle-cropped_9597563f-0654-4c92-8000-13c6d6143483.jpg?v=1757019500&width=1946"),
            new Produto(100, "Teclado Mecânico", "Teclado com iluminação RGB e resposta rápida, projetado para jogos, oferecendo conforto, precisão e maior desempenho durante partidas.", "https://sc04.alicdn.com/kf/H5814e7211bdb494d912a877217804265p.png")
    );


    @GetMapping("/")
    public String getProduto(Model model) {
        model.addAttribute("produtos", produtos);
        return "primeiraPagina";
    }
}



