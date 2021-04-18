import os
from docx2pdf import convert
from docx import Document

def replace_label(parag, label, new_text):
    if label in parag.text:
        inline = parag.runs
        for i in range(len(inline)):
            if label in inline[i].text:
                text = inline[i].text.replace(label, new_text)
                inline[i].text = text
    return parag


etiquetas = [["PAO","R$600,00","20-05-2021","13LBKR"],["PAO free","R$60,00","20-07-2021","13LBKR"]]
etiquetas.append([])

def gerar_etiqueta(etiquetas):
    for index, e in enumerate(etiquetas):
        etiqueta = "etiqueta.docx"
        doc = Document(etiqueta)
        labels = {
            "titulo": "<<TITULO>>",
            "valor": "<<VALOR>>",
            "validade": "<<DATA>>",
            "sku": "<<SKU>>"
        }

        for p in doc.paragraphs:
            p = replace_label(p,labels["titulo"],e[0])
            p = replace_label(p,labels["valor"],e[1])
            p = replace_label(p,labels["validade"],e[2])
            p = replace_label(p,labels["sku"],e[3])
        
        doc_new = f"Nova_Etiqueta_{index}.docx"
        doc.save(doc_new)
        convert(doc_new)