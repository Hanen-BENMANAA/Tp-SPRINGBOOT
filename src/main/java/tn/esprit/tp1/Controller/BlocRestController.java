package tn.esprit.tp1.Controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp1.entity.Bloc;
import tn.esprit.tp1.entity.Chambre;
import tn.esprit.tp1.services.IBlocService;

import java.util.List;

@Tag(name = "Gestion Bloc pour 4DS2")
@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class BlocRestController {

    IBlocService blocService;


    //http://localhost:8083/foyer/bloc/retrieve-all-blocs

    @GetMapping("/retrieve-all-blocs")
    @Operation(description = "WS de récuperation de tous les Blocs ")
    public List<Bloc> getBlocs() {
        return blocService.retrieveAllBlocs();
        //return listBlocs;
    }


    // http://localhost:8083/foyer/bloc/retrieve-bloc/8
    @GetMapping("/retrieve-bloc/{bloc-id}")
    public Bloc retrieveBloc(@PathVariable("bloc-id") Long bId) {
        return blocService.retrieveBloc(bId);

    }

    // http://localhost:8083/foyer/bloc/add-bloc
    @PostMapping("/add-bloc")
    public Bloc addBloc(@RequestBody Bloc c) {
        Bloc bloc = blocService.addBloc(c);
        return bloc;
    }

    // http://localhost:8083/foyer/bloc/remove-bloc/{bloc-id}
    @DeleteMapping("/remove-bloc/{bloc-id}")
    public void removeBloc(@PathVariable("bloc-id") Long chId) {
        blocService.removeBloc(chId);
    }

    // http://localhost:8083/foyer/bloc/modify-bloc
    @PutMapping("/modify-bloc")
    public Bloc modifyBloc(@RequestBody Bloc c) {
        Bloc bloc =blocService.modifyBloc(c);
        return bloc;
    }

    @GetMapping("/trouver-blocs-sans-foyer")
    public List<Bloc> getBlocswirhoutFoyer() {
        List<Bloc> listBlocs = blocService.trouverBlocsSansFoyer();
        return listBlocs;
    }

    @GetMapping("/get-bloc-nb-c/{nb}/{c}")
    public List<Bloc> recuperBlocsParNomEtCap(
            @PathVariable("nb") String nb,
            @PathVariable("c") long c) {

        return blocService.trouverBlocsParNomEtCap(nb, c);

    }

}