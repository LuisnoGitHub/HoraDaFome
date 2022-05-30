package pdmprova1.horadafome.database.model;

public class MesasModel {

    public static final String tabela_mesas = "tb_mesas";

    public static final String
            COLUNA_ID = "_id",
            COLUNA_ID_USUARIO = "id_usuario",
            COLUNA_AREA_EXTERNA = "area_externa",
            COLUNA_CAPACIDADE = "capacidade";

    public static final String
            CREATE_TABLE = "create table " + tabela_mesas
            + " ( "
            + COLUNA_ID + " integer primary key autoincrement, "
            + COLUNA_ID_USUARIO + " integer, "
            + COLUNA_CAPACIDADE + " integer not null, "
            + COLUNA_AREA_EXTERNA + " boolean not null, "

            + " );";

    public static final String
            DROP_TABLE = "drop table if exists " + tabela_mesas + ";";

    public static final String INSERT_INTO = "insert into " + tabela_mesas + "( " + COLUNA_AREA_EXTERNA + "," + COLUNA_CAPACIDADE + ") VALUES ('false', '8'),('false', '4'), ('true', '8'), ('true', '4'), ('false', '2'), ('true', '2'), ('false', '6'), ('true', '6'), ('false', '12')";

    /**
     * ENCAPSULAMENTO.
     */

    private long id;
    private Integer id_usuario;
    private Integer capacidade;
    private Boolean area_externa;

    public long getId() {
        return id;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public Boolean getArea_externa() {
        return area_externa;
    }

    public void setArea_externa(Boolean area_externa) {
        this.area_externa = area_externa;
    }
}
