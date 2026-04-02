package ro.ase.cts.Cabana;

public class Facade {

    public static boolean verificaCamera(int nrCamera) {

        CameraLibera libera = new CameraLibera();
        if (libera.verificaCamereLibere(nrCamera)) {

            Menajera menajera = new Menajera();
            if (menajera.cameraLibera(nrCamera) && menajera.esteCurata(nrCamera)) {

                return true;

            } else {

                return false;

            }

        } else {

            return false;

        }
    }

    public static String verificaDisponibilitateCamera(int nrCamera) {

        CameraLibera libera = new CameraLibera();
        if (libera.verificaCamereLibere(nrCamera)) {

            Menajera menajera = new Menajera();
            if (menajera.cameraLibera(nrCamera) && menajera.esteCurata(nrCamera)) {

                return "Camera pregatita";

            } else {

                return "Camera in curs de pregatire";

            }

        } else {

            return "Camera aproape finalizata";

        }
    }
}
