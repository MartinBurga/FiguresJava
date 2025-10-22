package com.figuras;

import groovy.lang.GroovyClassLoader;
import java.lang.reflect.Constructor;

public class ExternalFigure {

    public static Figura crearFigura(String nombre, Object... parametros) {
        try {
            Class<?> clazz = Class.forName("com.figuras." + nombre);
            Constructor<?> cons = clazz.getConstructors()[0];
            return (Figura) cons.newInstance(parametros);

        } catch (ClassNotFoundException e) {
            System.out.println("No existe la figura '" + nombre + "' en Java. Utilizando Groovy");

            try (GroovyClassLoader loader = new GroovyClassLoader()) {
                // Aquí podrías en el futuro cargar el código desde un servicio externo (ver paso 3)
                String codigoGroovy = """
                    class Pentagono extends com.figuras.Figura {
                        double lado
                        Pentagono(double lado) {
                            super("Pentágono")
                            this.lado = lado
                        }
                        double calcularArea() {
                            (5 * lado * lado) / (4 * Math.tan(Math.PI/5))
                        }
                        double determinarPerimetro() {
                            5 * lado
                        }
                    }
                """;

                Class<?> groovyClass = loader.parseClass(codigoGroovy);
                Constructor<?> cons = groovyClass.getConstructors()[0];
                return (Figura) cons.newInstance(parametros);

            } catch (Exception ex) {
                throw new RuntimeException("Error cargando clase Groovy: " + ex.getMessage());
            }

        } catch (Exception e) {
            throw new RuntimeException("Error al crear figura: " + e.getMessage());
        }
    }
}
