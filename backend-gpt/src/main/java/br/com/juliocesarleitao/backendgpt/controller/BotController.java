package br.com.juliocesarleitao.backendgpt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/bots")
public class BotController {

    public static List<String> BOTS = List.of("a1", "a2", "a3","a4", "a5");

    @GetMapping("/{botUuid}")
    public BotDTO getBOTByUuid(@PathVariable(name = "botUuid") String uuid) {
        List<BotDTO> bots = getBOTS();

        UUID botProcuradoUuid = UUID.fromString(uuid);

        for (BotDTO bot : bots){
            if (bot.getUuid().equals(botProcuradoUuid)){
                return bot;
            }
        }

        throw new RuntimeException("Bot com UUID " + uuid + " nao foi encontrado");
    }

    @GetMapping
    public List<BotDTO> getBOTS() {

        BotDTO botDTO = new BotDTO();
        botDTO.setAge(1);
        botDTO.setName("Pedro");
        botDTO.setFunction("Aniquilar");
        botDTO.setUuid(UUID.fromString("158b6562-a672-475f-a101-62871c4dfb6d"));


        BotDTO botDTO2 = new BotDTO();
        botDTO2.setAge(2);
        botDTO2.setName("Joao");
        botDTO2.setFunction("Salvar");
        botDTO2.setUuid(UUID.fromString("4a273c52-ccf9-431c-b307-84a07db6a14f"));

        List<BotDTO> lista = new ArrayList<>();
        lista.add(botDTO);
        lista.add(botDTO2);
        return lista;
    }



}
