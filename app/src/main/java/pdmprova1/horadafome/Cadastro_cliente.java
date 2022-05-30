package pdmprova1.horadafome;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class Cadastro_cliente extends AppCompatActivity {
    private EditText EditNome;
    private EditText EditHora;
    private EditText EditTelefone;
    private EditText EditNpessoas;
    private Button btnBuscarMesas;
    private Switch switchAlaCarte;
    private Switch switchRodizio;
    private Switch switchAraExterna;
    private Button BtnReservar1;
    private Button BtnReservar2;
    private Button BtnReservar3;
    private Button BtnReservar4;
    private Button BtnReservar5;
    private Button BtnReservar6;
    private Button BtnReservar7;
    private Button BtnReservar8;
    private Button BtnReservar9;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_cliente);

        btnBuscarMesas = findViewById(R.id.btn_mesas);
        EditNome = findViewById(R.id.nome);
        EditHora = findViewById(R.id.hora);
        EditTelefone = findViewById(R.id.phone);
        EditNpessoas = findViewById(R.id.n_pessoas);
        switchAlaCarte = findViewById(R.id.switchAlaCarte);
        switchAraExterna = findViewById(R.id.switchExterna);
        switchRodizio = findViewById(R.id.switchRodizio);
        BtnReservar1 = findViewById(R.id.btn_reservar_1);
        BtnReservar2 = findViewById(R.id.btn_reservar_2);
        BtnReservar3 = findViewById(R.id.btn_reservar_3);
        BtnReservar4 = findViewById(R.id.btn_reservar_4);
        BtnReservar5 = findViewById(R.id.btn_reservar_5);
        BtnReservar6 = findViewById(R.id.btn_reservar_6);
        BtnReservar7 = findViewById(R.id.btn_reservar_7);
        BtnReservar8 = findViewById(R.id.btn_reservar_8);
        BtnReservar9 = findViewById(R.id.btn_reservar_9);

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(Cadastro_cliente.this);
        BtnReservar1.setEnabled(preferences.getBoolean("mesa_1", false));
        BtnReservar1.setBackgroundTintList(ContextCompat.getColorStateList(Cadastro_cliente.this, preferences.getBoolean("mesa_1", false) == false ? R.color.vermelho_claro : R.color.azul_btn_reservar));
        BtnReservar2.setEnabled(preferences.getBoolean("mesa_2", false));
        BtnReservar2.setBackgroundTintList(ContextCompat.getColorStateList(Cadastro_cliente.this, preferences.getBoolean("mesa_2", false) == false ? R.color.vermelho_claro : R.color.azul_btn_reservar));
        BtnReservar3.setEnabled(preferences.getBoolean("mesa_3", false));
        BtnReservar3.setBackgroundTintList(ContextCompat.getColorStateList(Cadastro_cliente.this, preferences.getBoolean("mesa_3", false) == false ? R.color.vermelho_claro : R.color.azul_btn_reservar));
        BtnReservar4.setEnabled(preferences.getBoolean("mesa_4", false));
        BtnReservar4.setBackgroundTintList(ContextCompat.getColorStateList(Cadastro_cliente.this, preferences.getBoolean("mesa_4", false) == false ? R.color.vermelho_claro : R.color.azul_btn_reservar));
        BtnReservar5.setEnabled(preferences.getBoolean("mesa_5", false));
        BtnReservar5.setBackgroundTintList(ContextCompat.getColorStateList(Cadastro_cliente.this, preferences.getBoolean("mesa_5", false) == false ? R.color.vermelho_claro : R.color.azul_btn_reservar));
        BtnReservar6.setEnabled(preferences.getBoolean("mesa_6", false));
        BtnReservar6.setBackgroundTintList(ContextCompat.getColorStateList(Cadastro_cliente.this, preferences.getBoolean("mesa_6", false) == false ? R.color.vermelho_claro : R.color.azul_btn_reservar));
        BtnReservar7.setEnabled(preferences.getBoolean("mesa_7", false));
        BtnReservar7.setBackgroundTintList(ContextCompat.getColorStateList(Cadastro_cliente.this, preferences.getBoolean("mesa_7", false) == false ? R.color.vermelho_claro : R.color.azul_btn_reservar));
        BtnReservar8.setEnabled(preferences.getBoolean("mesa_8", false));
        BtnReservar8.setBackgroundTintList(ContextCompat.getColorStateList(Cadastro_cliente.this, preferences.getBoolean("mesa_8", false) == false ? R.color.vermelho_claro : R.color.azul_btn_reservar));
        BtnReservar9.setEnabled(preferences.getBoolean("mesa_9", false));
        BtnReservar9.setBackgroundTintList(ContextCompat.getColorStateList(Cadastro_cliente.this, preferences.getBoolean("mesa_9", false) == false ? R.color.vermelho_claro : R.color.azul_btn_reservar));



    }

}
