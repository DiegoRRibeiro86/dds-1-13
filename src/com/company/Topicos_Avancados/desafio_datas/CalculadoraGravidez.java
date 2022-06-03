package com.company.Topicos_Avancados.desafio_datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalculadoraGravidez {
    public static void main(String[] args) {
        DateFormat dataUltimoPeriodoMenstrual = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println();
	    public CalculadoraGravidez(Date.dataUltimoPeriodoMenstrual) {
            this.dataUltimoPeriodoMenstrual = dataUltimoPeriodoMenstrual;

            Date data = new Date();
        }

        private Calendar converterDateParaCalendar(Date data) {
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(data);
            return calendar;
        }
        public Date calcularDataEstimadaConcepcao() {
            // implementar cálculo de data estimada da concepção
            // 2 semanas após a data do último período menstrual
        }
        public Date calcularDataEstimadaParto() {
            // implementar cálculo de data estimada para parto
            // 40 semanas após a data do último período menstrual
        }
    }
    }
}
