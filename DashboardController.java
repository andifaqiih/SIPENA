package com.akademik;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class DashboardController {

    @FXML
    private TextField txtNama;

    @FXML
    private TextField txtNim;

    @FXML
    private ComboBox<String> cmbKategori;

    @FXML
    private TextArea txtLaporan;

    @FXML
    private TableView<Pengaduan> table;

    @FXML
    private TableColumn<Pengaduan,String> colNama;

    @FXML
    private TableColumn<Pengaduan,String> colNim;

    @FXML
    private TableColumn<Pengaduan,String> colKategori;

    @FXML
    private TableColumn<Pengaduan,String> colStatus;

    @FXML
    public void initialize() {

        cmbKategori.setItems(
                FXCollections.observableArrayList(
                        "Nilai Akademik",
                        "SIAKAD",
                        "Dosen",
                        "Fasilitas",
                        "Lainnya"
                ));

        colNama.setCellValueFactory(
                new PropertyValueFactory<>("nama"));

        colNim.setCellValueFactory(
                new PropertyValueFactory<>("nim"));

        colKategori.setCellValueFactory(
                new PropertyValueFactory<>("kategori"));

        colStatus.setCellValueFactory(
                new PropertyValueFactory<>("status"));

        table.setItems(Database.data);
    }

    @FXML
    private void kirim() {

        Database.data.add(
                new Pengaduan(
                        txtNama.getText(),
                        txtNim.getText(),
                        cmbKategori.getValue(),
                        txtLaporan.getText(),
                        "Diproses"));

        txtNama.clear();
        txtNim.clear();
        txtLaporan.clear();
    }

    @FXML
    private void hapus() {

        Pengaduan p =
                table.getSelectionModel().getSelectedItem();

        if(p != null)
            Database.data.remove(p);
    }
}