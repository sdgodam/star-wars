
/**
 * Esta clase genera nombres segun la formula que se rumorea que utilizaba George
 * Lucas en sus peliculas...
 * 
 * @author Sergio Diez
 * @version v0.1
 */
public class NameGenerator
{
    //no instance variables

    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator()
    {
        //no constructor
    }

    /**
     * A partir de los parametros introducidos te genera tu nombre de Star Wars
     *  Tu nombre en la película sería:
     *  Tomando las tres primeras letras de tu primer apellido real
     *  Añadiendo las tres primeras letras de tu nombre real
     *  Tu apellido en la película sería:

     *  Tomando las 2 primeras letras del primer apellido real de tu madre
     *  Añadiendo las 3 primeras letras del nombre de la ciudad donde naciste
     *  @param yourSurname tu apellido
     *  @param yourName tu nombre
     *  @param yourMotherSurname el apellido de tu madre
     *  @param city tu ciudad de nacimiento
     */
    public String generateStarWarsName(String yourSurname, String yourName, String yourMotherSurname, String city)
    {
        String starWarsName = yourSurname.substring(0,3) + yourName.toLowerCase().substring(0,3) + " " +
                    yourMotherSurname.substring(0,2) + city.toLowerCase().substring(0,3);
        
        return starWarsName;
    }
}
