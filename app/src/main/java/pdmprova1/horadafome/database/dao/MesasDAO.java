package pdmprova1.horadafome.database.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;

import pdmprova1.horadafome.database.DBHelper;
import pdmprova1.horadafome.database.model.MesasModel;

public class MesasDAO extends AbstractDAO{

    private final String[] colunas =
            {
                    MesasModel.COLUNA_ID,
                    MesasModel.COLUNA_ID_USUARIO,
                    MesasModel.COLUNA_CAPACIDADE,
                    MesasModel.COLUNA_AREA_EXTERNA
            };

    public MesasDAO(final Context context) {
        db_helper = new DBHelper(context);
    }

    public long Insert(final Long id, final Long id_usuario, final Integer capacidade, final Boolean area_externa) {

        open();

        ContentValues values = new ContentValues();
        values.put(MesasModel.COLUNA_ID_USUARIO, id_usuario);
        values.put(MesasModel.COLUNA_CAPACIDADE, capacidade);
        values.put(MesasModel.COLUNA_AREA_EXTERNA, area_externa);

        long result = db.insert(MesasModel.tabela_mesas, null, values);

        close();

        return result;
    }

    public long Update(final Long id, final Long id_usuario, final Integer capacidade, final Boolean area_externa) {

        open();

        ContentValues values = new ContentValues();
        values.put(MesasModel.COLUNA_ID_USUARIO, id_usuario);
        values.put(MesasModel.COLUNA_CAPACIDADE, capacidade);
        values.put(MesasModel.COLUNA_AREA_EXTERNA, area_externa);

        long result = db.update(MesasModel.tabela_mesas, values, MesasModel.COLUNA_CAPACIDADE + " = ?", new String[]{capacidade.toString()});

        close();

        return result;
    }

    public long Delete(final String usuario) {

        open();

        long result = db.delete(MesasModel.tabela_mesas, MesasModel.COLUNA_CAPACIDADE + " = ?", new String[]{usuario});

        close();

        return result;
    }

    public ArrayList<MesasModel> Select() {

        open();

        Cursor cursor = db.query
                (
                        MesasModel.tabela_mesas,
                        colunas,
                        null,
                        null,
                        null,
                        null,
                        null
                );
        cursor.moveToFirst();
        ArrayList<MesasModel> arl = new ArrayList<MesasModel>();

        while (!cursor.isAfterLast()) {
            arl.add(CursorToStructure(cursor));
            cursor.moveToNext();
        }

        close();

        return arl;
    }

    public final MesasModel CursorToStructure(Cursor cursor) {
        MesasModel model = new MesasModel();
        model.setId(cursor.getLong(0));
        model.setId_usuario(cursor.getInt(1));
        model.setCapacidade(cursor.getInt(2));
        model.setArea_externa(cursor.getExtras().getBoolean(String.valueOf(3)));
        return model;
    }


}
