package com.codexbox.cbs.hrmanagement.util;
import com.codexbox.cbs.hrmanagement.entities.PaySlip;
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

    public static ByteArrayInputStream payslipPDFReport(PaySlip paySlip) {
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
            Stream.of("id",  "noOfDaysPresent " , " noOfWorkingDays " ,"month", " ctc ")
                    .forEach(headerTitle -> {
                        PdfPCell header = new PdfPCell();
                        Font headFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
                        header.setBackgroundColor(BaseColor.LIGHT_GRAY);
                        header.setHorizontalAlignment(Element.ALIGN_CENTER);
                        header.setBorderWidth(2);
                        header.setPhrase(new Phrase(headerTitle, headFont));
                        table.addCell(header);
                    });

            // for (PaySlip customer : paySlip) {
            PdfPCell id = new PdfPCell(new Phrase(paySlip.getId()));
            id.setPaddingLeft(4);
            id.setVerticalAlignment(Element.ALIGN_MIDDLE);
            id.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(id);


            PdfPCell noOfWorkingDays = new PdfPCell(new Phrase(paySlip.getNoOfWorkingDays()));
            noOfWorkingDays.setPaddingLeft(4);
            noOfWorkingDays.setVerticalAlignment(Element.ALIGN_MIDDLE);
            noOfWorkingDays.setHorizontalAlignment(Element.ALIGN_LEFT);
            table.addCell(noOfWorkingDays);


            PdfPCell noOfDaysPresent = new PdfPCell(new Phrase(paySlip.getNoOfDaysPresent()));
            noOfDaysPresent.setVerticalAlignment(Element.ALIGN_MIDDLE);
            noOfDaysPresent.setHorizontalAlignment(Element.ALIGN_RIGHT);
            noOfDaysPresent.setPaddingRight(4);
            table.addCell(noOfDaysPresent);

            PdfPCell ctc = new PdfPCell(new Phrase(paySlip.getCtc()));
            ctc.setPaddingLeft(4);
            ctc.setVerticalAlignment(Element.ALIGN_MIDDLE);
            ctc.setHorizontalAlignment(Element.ALIGN_LEFT);
            table.addCell(ctc);

            PdfPCell month = new PdfPCell(new Phrase(paySlip.getMonth()));
            month.setPaddingLeft(4);
            month.setVerticalAlignment(Element.ALIGN_MIDDLE);
            month.setHorizontalAlignment(Element.ALIGN_LEFT);
            table.addCell(month);
            document.add(table);
            document.close();
        }

        catch (DocumentException ex) {
            log.error("got exception while generating payroll pdf");
        }

        return new ByteArrayInputStream(out.toByteArray());
    }


}

