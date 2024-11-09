package ProjetosPessoais;

public class PPM {

   /* double contaPPP (double Ppl){
        return Ppl / 3;
    }
    double PPP(double contaPPP(Ppl), double linhas){
        return contaPPP(Ppl) * linhas;
    }

    double contaPPM (double Ppl, double tempo, double numeroPaginasLidas){
        return contaPPP(Ppl) * numeroPaginasLidas / tempo;
    }
*/
   double contaPPL(double Ppl) {
       return Ppl / 3;  // Calcula palavras por linha (PPL)
   }

    double contaPPP(double PPL, double linhas) {
        return PPL * linhas;  // Calcula palavras totais na página (PPP)
    }

    double contaPPM(double PPP, double numeroPaginas, double tempo) {
        return (PPP * numeroPaginas) / tempo;  // Calcula páginas por minuto (PPM)
    }

}
