package org.example;


import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        try {
            Document document = new Document();
            String destino = "inscription.pdf";
            PdfWriter.getInstance(document, new FileOutputStream(destino));
            document.open();

            // Define the font for the title
            Font titleFont = new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD);

            // Create and add the title with styling
            Paragraph title = new Paragraph("FICHA DE INSCRIPCIÓN 2018 N° 2", titleFont);
            title.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(title);

            // Define the font for the subtitle
            Font subTitleFont = new Font(Font.FontFamily.HELVETICA, 12);

            // Create and add the subtitle with styling
            Paragraph subTitle = new Paragraph("DEPORTE: BASQUET 3 VS 3 – CATEGORÍA: SUB 14 – GÉNERO – MASCULINO – POSADAS", subTitleFont);
            subTitle.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(subTitle);

            // Define the font for other text
            Font sectionFont = new Font(Font.FontFamily.HELVETICA, 12,Font.BOLD);

            // Create and add the institution text with styling
            Paragraph institution = new Paragraph("INSTITUTION", sectionFont);
            institution.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(institution);

            // Define the font for additional information
            Font infoFont = new Font(Font.FontFamily.HELVETICA, 11);

            // Create and add the additional information with styling
            Paragraph additionalInfo = new Paragraph();
            additionalInfo.setFont(infoFont);
            additionalInfo.add("Nombre:  CLUB ATLETICO GUARANÍ\n");
            additionalInfo.add("Localidad:  Posadas – Dirección: AV. INVENTADA 888\n");
            additionalInfo.add("Teléfono:  3765105006");
            document.add(additionalInfo);


            // Seccion deportistas
            Paragraph sportsman = new Paragraph("DEPORTISTAS",sectionFont);
            sportsman.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(sportsman);

            // Create a table with 5 columns
            PdfPTable tableSportmans = new PdfPTable(5);
            tableSportmans.setWidthPercentage(100); // Set the table width to 100% of the page width

            // Define the font for the table headers
            Font headerFont = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);

            // Add table headers with centered alignment
            PdfPCell cell = new PdfPCell(new Phrase("N°", headerFont));
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tableSportmans.addCell(cell);

            cell = new PdfPCell(new Phrase("Apellido y Nombre", headerFont));
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tableSportmans.addCell(cell);

            cell = new PdfPCell(new Phrase("N° Documento", headerFont));
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tableSportmans.addCell(cell);

            cell = new PdfPCell(new Phrase("Fecha de Nacimiento", headerFont));
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tableSportmans.addCell(cell);

            cell = new PdfPCell(new Phrase("Localidad", headerFont));
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tableSportmans.addCell(cell);

            // Add sample rows (you can replace this with dynamic data)
            for (int i = 1; i <= 3; i++) { // Example for adding 3 rows
                addCenteredCell(tableSportmans, String.valueOf(i)); // N°
                addCenteredCell(tableSportmans, "Apellido " + i + ", Nombre " + i); // Apellido y Nombre
                addCenteredCell(tableSportmans, "12345678"); // N° Documento
                addCenteredCell(tableSportmans, "01/01/2000"); // Fecha de Nacimiento
                addCenteredCell(tableSportmans, "Localidad " + i); // Localidad
            }

            // Add the table to the document
            document.add(tableSportmans);

            //Seccion Instructores
            Paragraph Instructors = new Paragraph("INSTRUCTORES",sectionFont);
            Instructors.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(Instructors);

            // Create a table with 5 columns
            PdfPTable tableInstructor = new PdfPTable(5);
            tableInstructor.setWidthPercentage(100); // Set the table width to 100% of the page width

            // Add table headers with centered alignment
            PdfPCell cellInsctructor = new PdfPCell(new Phrase("N°", headerFont));
            cellInsctructor.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tableInstructor.addCell(cellInsctructor);

            cellInsctructor = new PdfPCell(new Phrase("Apellido y Nombre", headerFont));
            cellInsctructor.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tableInstructor.addCell(cellInsctructor);

            cellInsctructor = new PdfPCell(new Phrase("N° Documento", headerFont));
            cellInsctructor.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tableInstructor.addCell(cellInsctructor);

            cellInsctructor = new PdfPCell(new Phrase("Teléfono", headerFont));
            cellInsctructor.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tableInstructor.addCell(cellInsctructor);

            cellInsctructor = new PdfPCell(new Phrase("Email", headerFont));
            cellInsctructor.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tableInstructor.addCell(cellInsctructor);

            // Add sample rows (you can replace this with dynamic data)
            for (int i = 1; i <= 2; i++) { // Example for adding 3 rows
                addCenteredCell(tableInstructor, String.valueOf(i)); // N°
                addCenteredCell(tableInstructor, "Apellido " + i + ", Nombre " + i); // Apellido y Nombre
                addCenteredCell(tableInstructor, "12345678"); // N° Documento
                addCenteredCell(tableInstructor, "3765105007"); // Fecha de Nacimiento
                addCenteredCell(tableInstructor, "example.example@hotmail.com " + i); // Localidad
            }

            // Add the table to the document
            document.add(tableInstructor);

            //Seccion Responasbles de Equipo
            Paragraph responsible = new Paragraph("RESPONSABLES DE EQUIPO",sectionFont);
            responsible.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(responsible);

            // Create a table with 5 columns
            PdfPTable tableResponsible = new PdfPTable(5);
            tableResponsible.setWidthPercentage(100); // Set the table width to 100% of the page width

            // Add table headers with centered alignment
            PdfPCell cellResponsible = new PdfPCell(new Phrase("N°", headerFont));
            cellResponsible.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tableResponsible.addCell(cellResponsible);

            cellResponsible = new PdfPCell(new Phrase("Apellido y Nombre", headerFont));
            cellResponsible.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tableResponsible.addCell(cellResponsible);

            cellResponsible = new PdfPCell(new Phrase("N° Documento", headerFont));
            cellResponsible.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tableResponsible.addCell(cellResponsible);

            cellResponsible = new PdfPCell(new Phrase("Teléfono", headerFont));
            cellResponsible.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tableResponsible.addCell(cellResponsible);

            cellResponsible = new PdfPCell(new Phrase("Email", headerFont));
            cellResponsible.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tableResponsible.addCell(cellResponsible);

            // Add sample rows (you can replace this with dynamic data)
            for (int i = 1; i <= 2; i++) { // Example for adding 3 rows
                addCenteredCell(tableResponsible, String.valueOf(i)); // N°
                addCenteredCell(tableResponsible, "Apellido " + i + ", Nombre " + i); // Apellido y Nombre
                addCenteredCell(tableResponsible, "12345678"); // N° Documento
                addCenteredCell(tableResponsible, "3765105007"); // Fecha de Nacimiento
                addCenteredCell(tableResponsible, "example.example@hotmail.com " + i); // Localidad
            }

            // Add the table to the document
            document.add(tableResponsible);

            //Seccion Firmas
            Font signatureFont = new Font(Font.FontFamily.HELVETICA, 12);
            Paragraph signatureSection = new Paragraph();
            signatureSection.setFont(signatureFont);
            signatureSection.setSpacingBefore(20); // Add space before signature section
            signatureSection.add("_________________           _________________           _________________\n");
            signatureSection.add("     Responsable 1                    Responsable 2               Firma Autoridad Institución");
            signatureSection.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(signatureSection);

            //Seccion Inscriptor
            Paragraph enroller = new Paragraph("Inscribe: LAUTARO MERELES - D.N.I.: 33.333.333",titleFont);
            document.add(enroller);

            Paragraph dataEnroller = new Paragraph("Teléfono: (3764) 44-4444 – Email: ejemplo@ejemplo.com",titleFont);
            document.add(dataEnroller);

            document.close();
            System.out.println("PDF creado");

        } catch (FileNotFoundException | DocumentException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, "error");
        }
    }

    // Helper method to create a centered cell
    private static void addCenteredCell(PdfPTable table, String content) {
        PdfPCell cell = new PdfPCell(new Phrase(content));
        cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
        table.addCell(cell);
    }
}