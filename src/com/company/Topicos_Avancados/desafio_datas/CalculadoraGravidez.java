package com.company.Topicos_Avancados.desafio_datas;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalculadoraGravidez {
            private Date dataUltimoPeriodoMenstrual;

	    public CalculadoraGravidez(Date Date dataUltimoPeriodoMenstrual) {
            this.dataUltimoPeriodoMenstrual = this.dataUltimoPeriodoMenstrual;
        }

        private Calendar converterDateParaCalendar (Date data) {
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(data);
            return calendar;
        }
        public Date calcularDataEstimadaConcepcao() {
            Calendar dataEstimadaDaConcepcao = this.converterDateParaCalendar(this.dataUltimoPeriodoMenstrual);   // implementar cálculo de data estimada da concepção
            dataEstimadaDaConcepcao.add(Calendar.WEEK_OF_YEAR,2);                                          // 2 semanas após a data do último período menstrual
            return dataEstimadaDaConcepcao.getTime();
        }

        public Date calcularDataEstimadaParto() {
            Calendar dataEstimadaParto = this.converterDateParaCalendar(this.dataUltimoPeriodoMenstrual);          // implementar cálculo de data estimada para parto
            dataEstimadaParto.add(Calendar.WEEK_OF_YEAR,40);                                                // 40 semanas após a data do último período menstrual

            return dataEstimadaParto.getTime();
        }

}
