package com.mateolambis.dominio;
    public class EmpleadoFreelancerML extends EmpleadoML {
        private double valorPorHoraML;
        private int horasTrabajadasML;

        public EmpleadoFreelancerML(String nombreML, double valorPorHoraML) {
            super(nombreML);
            this.valorPorHoraML = valorPorHoraML;
        }

        @Override
        public double calcularNominaML() {
            return valorPorHoraML * horasTrabajadasML;
        }


        public double getValorPorHoraML() {
            return valorPorHoraML;
        }

        public int getHorasTrabajadasML() {
            return horasTrabajadasML;
        }

        public void setHorasTrabajadasML(int horasTrabajadasML) {
            this.horasTrabajadasML = horasTrabajadasML;
        }


    }

