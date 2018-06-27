package ma.lydec.exercises.train;

public final class AppConstants {

	public static final String HEAD_CODE = "H";
	public static final String PASSENGER_CODE ="P";
	public static final String RESTAURANT_CODE ="R";
	
	public static final String HEAD_DESIGN = "<HHHH";
	public static final String END_DESIGN = "HHHH>";
	
	public static final String PASSENGER_DESIGN = "|OOOO|";
	public static final String RESTAURANT_DESIGN = "|hThT|";
	public static final String SEPARTOR = "::";
	public static final String TRAIN_ALLOWED_DESIGN = "H(P|R)*H?";
	public static final String DESIGN_ERROR_MESSAGE = "Design not allowed to build train";
}
