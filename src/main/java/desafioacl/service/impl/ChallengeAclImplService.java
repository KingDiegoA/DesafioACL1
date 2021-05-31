package desafioacl.service.impl;

import desafioacl.model.ChallengeAclModelRequest;
import desafioacl.model.ChallengeAclModelResponse;
import desafioacl.service.ChallengeAclService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChallengeAclImplService implements ChallengeAclService {

    @Override
    public ChallengeAclModelResponse findDates(ChallengeAclModelRequest input) {
        const challengeAclModelResponse  = new ChallengeAclModelResponse();
        return challengeAclModelResponse;
    }

    public  ChallengeAclModelResponse calcularPeriodosPerdidos(){
        ChallengeAclModelResponse data = this.calcularPeriodosPerdidos();
        ChallengeAclModelResponse challengeAclModelResponse = new ChallengeAclModelResponse();
        challengeAclModelResponse.setId(data.id());
        challengeAclModelResponse.setFechaCreacion(data.getFechaCreacion());
        challengeAclModelResponse.setFechaFin(data.getFechaFin());
        challengeAclModelResponse.setFechas(data.getFechas());

        List<LocalDate> fechasFaltantes = new ArrayList<>();
        for(LocalDate date = data.getFechaCreacion(); date.isBefore(data.getFechaFin().plusMonths(1)); date = date.plusMonths(1)) {
            if (!data.getFechas().contains(date)){
                fechasFaltantes.add(date);
            }
        }
        challengeAclModelResponse.setFechasFaltantes(fechasFaltantes);

        return challengeAclModelResponse;
    }

    private void escribirJSON(ChallengeAclModelRequest entrada, ChallengeAclModelResponse salida) {
        try {
            Path file = Paths.get("JsonResponse").toAbsolutePath().normalize();
            Files.createDirectories(file);

            // entrada
            Path targetEntrada = file.resolve("entrada.json");
            FileOutputStream streamEntrada = new FileOutputStream(targetEntrada.toString());
            streamEntrada.write(gson.toJson(entrada).getBytes());
            streamEntrada.close();

            // salida
            Path targetSalida = file.resolve("salida.json");
            FileOutputStream streamSalida = new FileOutputStream(targetSalida.toString());
            streamSalida.write(gson.toJson(salida).getBytes());
            streamSalida.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
