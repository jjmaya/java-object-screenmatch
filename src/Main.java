import com.ingjuanmaya.screenmatch.calculos.CalculadoraDeTiempo;
import com.ingjuanmaya.screenmatch.calculos.FiltroRecomendacion;
import com.ingjuanmaya.screenmatch.modelos.Episodio;
import com.ingjuanmaya.screenmatch.modelos.Pelicula;
import com.ingjuanmaya.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(12);
        miPelicula.evalua(10);
        System.out.println(miPelicula.calculaMedia());
        System.out.println(miPelicula.getTotalEvaluacione());
        System.out.println("***************");


        Serie miSerie = new Serie();
        miSerie.setNombre("La casa del dragón");
        miSerie.setFechaLanzamiento(2022);
        miSerie.setTemporadas(1);
        miSerie.setMinutosPorEpisodio(50);
        miSerie.setEpisodiosPorTemporada(10);
        System.out.println(miSerie.getDuracionEnMinutos());

        miSerie.muestraFichaTecnica();
        miSerie.evalua(12);
        miSerie.evalua(10);
        System.out.println(miSerie.calculaMedia());
        System.out.println(miSerie.getTotalEvaluacione());

        Pelicula miPelicula2 = new Pelicula();
        miPelicula2.setNombre("Matrix");
        miPelicula2.setFechaLanzamiento(1998);
        miPelicula2.setDuracionEnMinutos(180);

        System.out.println("***************");

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(miPelicula2);
        calculadora.incluye(miSerie);
        System.out.println("Tiempo necesario para ver tus TItulos favoritos: "
                + calculadora.getTiempoTotal() + " minutos.");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtrar(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(miSerie);
        episodio.setTotalVisualizaciones(50);
        filtroRecomendacion.filtrar(episodio);
    }
}
