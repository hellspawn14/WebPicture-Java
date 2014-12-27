package en.ar.picture.webpicture.graphical.palette;

import java.util.ArrayList;

import en.ar.picture.webpicture.graphical.icons.Icon;

/**
 * Representa un grupo de herramientas del editor (subpaleta)
 * @author hellspawn
 */
public class Toolgroup {
	// ------------------------------------------------------------------
	// Constantes
	// ------------------------------------------------------------------

	/**
	 * Encabezado del grupo
	 */
	public final static String DEFAULT_ID = "GROUP_";

	/**
	 * Identificador del encabezado del grupo
	 */
	public final static String HEAD = "HEAD_";

	/**
	 * Identificador del paper
	 */
	public final static String PAPER = "PAPER_";

	/**
	 * Identificador del contenedor
	 */
	public final static String GRAPH = "GRAPH_";

	/**
	 * Espacio por defecto entre cada elemento del grupo
	 */
	public final static int ELEMENT_PADDING = 140;

	/**
	 * Factor de escala para la altura del grupo
	 */
	public final static int SCALE_FACTOR = 150;

	// ------------------------------------------------------------------
	// Atributos
	// ------------------------------------------------------------------

	/**
	 * Identificador del grupo
	 */
	private String groupId;

	/**
	 * Idenficador del encabezado del grupo
	 */
	private String groupHead;

	/**
	 * Identificador del contenedor del modelo
	 */
	private String paperId;

	/**
	 * Identificador del contenedor del diagrama
	 */
	private String graphId;

	/**
	 * Nombre del grupo
	 */
	private String name;

	/**
	 * Descripcion del grupo
	 */
	private String description;

	/**
	 * Alto del grupo
	 */
	private int height;

	/**
	 * Iconos del grupo
	 */
	private ArrayList<Icon> icons;

	// ------------------------------------------------------------------
	// Constructores
	// ------------------------------------------------------------------

	/**
	 * Crea un nuevo grupo de herramientas del editor
	 * 
	 * @param name
	 *            - Nombre del grupo
	 * @param description
	 *            - Descripción del grupo
	 */
	public Toolgroup(String name, String description) {
		this.name = name;
		this.description = description;
		this.icons = new ArrayList<Icon>();
		this.groupId = DEFAULT_ID
				+ this.toString().split("@")[this.toString().split("@").length - 1];
		this.groupHead = HEAD
				+ this.toString().split("@")[this.toString().split("@").length - 1];
		this.setPaperId(PAPER
				+ this.toString().split("@")[this.toString().split("@").length - 1]);
		this.setGraphId(GRAPH
				+ this.toString().split("@")[this.toString().split("@").length - 1]);
	}

	// ------------------------------------------------------------------
	// Metodos
	// ------------------------------------------------------------------


	/**
	 * Retorna el codigo JavaScript para crear grupo de elementos y el paper que lo contiene
	 * @return Codigo JavaScript para crear el contenedor
	 */
	public String generateScript() {
		int groupHeight = 0;
		if (icons.size() == 0) {
			groupHeight = 50;
		} else {
			groupHeight = icons.size() * SCALE_FACTOR;
		}
		String ans = "$('#tools').append('<h5 id="
				+ '"'
				+ this.getGroupHead()
				+ '"'
				+ " class="
				+ '"'
				+ "marketing-header-canvas"
				+ '"'
				+ " style="
				+ '"'
				+ "text-align:left;color:white; background-color:#181818;border-top:1px solid #808080"
				+ '"'
				+ "><i class="
				+ '"'
				+ "fa fa-bars"
				+ '"'
				+ " style="
				+ '"'
				+ "margin-left:5px"
				+ '"'
				+ "></i> "
				+ this.getName()
				+ "</h5><div id="
				+ '"'
				+ this.getGroupId()
				+ '"'
				+ " style="
				+ '"'
				+ "background-color:#F0F0F0; overflow-y: auto; height:"
				+ groupHeight
				+ "px"
				+ '"'
				+ "></div>');"
				+ "Tipped.create('#"
				+ this.getGroupHead()
				+ "'"
				+ ", '"
				+ this.getDescription()
				+ "', {position: 'right'});"
				+ "var "
				+ this.getGraphId()
				+ " = new joint.dia.Graph;"
				+ "var "
				+ this.getPaperId()
				+ " = new joint.dia.Paper({"
				+ "el: $("
				+ "'#"
				+ this.getGroupId()
				+ "'), gridSize: 10,height: $("
				+ "'#"
				+ this.getGroupId()
				+ "').height(), width: $('#tools').width(), gridSize: 1,model: "
				+ this.getGraphId() + ", interactive: false});";
		for (int i = 0; i < icons.size(); i++) {
			int posY = 0;
			if (i == 0) {
				posY = 10;
			} else {
				int ant = i - 1;
				posY = icons.get(ant).getY() + ELEMENT_PADDING;
				System.out.println(posY);
			}
			ans += icons.get(i).generateScript(posY) + this.getGraphId()
					+ ".addCell(" + icons.get(i).getId() + ");";
		}
		return ans;
	}

	// ------------------------------------------------------------------
	// Getters & Setters
	// ------------------------------------------------------------------

	/**
	 * @return the groupId
	 */
	public String getGroupId() {
		return groupId;
	}

	/**
	 * @param groupId the groupId to set
	 */
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @return the icons
	 */
	public ArrayList<Icon> getIcons() {
		return icons;
	}

	/**
	 * @param icons the icons to set
	 */
	public void setIcons(ArrayList<Icon> icons) {
		this.icons = icons;
	}

	/**
	 * @return the groupHead
	 */
	public String getGroupHead() {
		return groupHead;
	}

	/**
	 * @param groupHead the groupHead to set
	 */
	public void setGroupHead(String groupHead) {
		this.groupHead = groupHead;
	}

	/**
	 * @return the paperId
	 */
	public String getPaperId() {
		return paperId;
	}

	/**
	 * @param paperId the paperId to set
	 */
	public void setPaperId(String paperId) {
		this.paperId = paperId;
	}

	/**
	 * @return the graphId
	 */
	public String getGraphId() {
		return graphId;
	}

	/**
	 * @param graphId the graphId to set
	 */
	public void setGraphId(String graphId) {
		this.graphId = graphId;
	}
}
