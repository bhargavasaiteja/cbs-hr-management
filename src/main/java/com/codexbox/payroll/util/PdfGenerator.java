package com.codexbox.payroll.util;

import com.codexbox.payroll.entity.PaySlip;
import com.codexbox.payroll.model.PayslipDTO;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.stream.Stream;
@Component
@Slf4j
public class PdfGenerator {
   //  private static Logger logger = LoggerFactory.getLogger(PDFGenerator.class);

    public static ByteArrayInputStream payslipPDFReport(PayslipDTO payslipDTO) {
        Document document = new Document();
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        try {

            PdfWriter.getInstance(document, out);
            document.open();

            // Add Text to PDF file ->
            Font font = FontFactory.getFont(FontFactory.COURIER, 14, BaseColor.BLACK);
            Paragraph para = new Paragraph( "Payroll Table", font);
            para.setAlignment(Element.ALIGN_CENTER);
            document.add(para);
            document.add(Chunk.NEWLINE);

            PdfPTable table = new PdfPTable(5);
            // Add PDF Table Header ->
            Stream.of("id", "  months ", "noOfDaysPresent " , " months " , " months ")
                    .forEach(headerTitle -> {
                        PdfPCell header = new PdfPCell();
                        Font headFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
                        header.setBackgroundColor(BaseColor.LIGHT_GRAY);
                        header.setHorizontalAlignment(Element.ALIGN_CENTER);
                        header.setBorderWidth(2);
                        header.setPhrase(new Phrase(headerTitle, headFont));
                        table.addCell(header);
                    });

            // for (PaySlip customer : payslipDTO) {
            PdfPCell id = new PdfPCell(new Phrase(payslipDTO.getId()));
            id.setPaddingLeft(4);
            id.setVerticalAlignment(Element.ALIGN_MIDDLE);
            id.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(id);


            PdfPCell noOfWorkingDays = new PdfPCell(new Phrase(payslipDTO.getNoOfWorkingDays()));
            noOfWorkingDays.setPaddingLeft(4);
            noOfWorkingDays.setVerticalAlignment(Element.ALIGN_MIDDLE);
            noOfWorkingDays.setHorizontalAlignment(Element.ALIGN_LEFT);
            table.addCell(noOfWorkingDays);


            PdfPCell noOfDaysPresent = new PdfPCell(new Phrase(String.valueOf(payslipDTO.getNoOfDaysPresent())));
            noOfDaysPresent.setVerticalAlignment(Element.ALIGN_MIDDLE);
            noOfDaysPresent.setHorizontalAlignment(Element.ALIGN_RIGHT);
            noOfDaysPresent.setPaddingRight(4);
            table.addCell(noOfDaysPresent);

            PdfPCell ctc = new PdfPCell(new Phrase(payslipDTO.getCtc()));
            ctc.setPaddingLeft(4);
            ctc.setVerticalAlignment(Element.ALIGN_MIDDLE);
            ctc.setHorizontalAlignment(Element.ALIGN_LEFT);
            table.addCell(ctc);

            PdfPCell months = new PdfPCell(new Phrase(payslipDTO.getMonths()));
            months.setPaddingLeft(4);
            months.setVerticalAlignment(Element.ALIGN_MIDDLE);
            months.setHorizontalAlignment(Element.ALIGN_LEFT);
            table.addCell(months);
            document.add(table);
        } catch (DocumentException ex) {
            log.error("got exception while generating payroll pdf");
        }


        document.close();
        return new ByteArrayInputStream(out.toByteArray());
    }


}

