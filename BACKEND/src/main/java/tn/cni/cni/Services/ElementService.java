package tn.cni.cni.Services;

import tn.cni.cni.Entities.Element;


import java.util.List;

public interface ElementService {
    public Element addElement(Element element);

    public Element updateElement(Element element);

    public void deleteElement(Long id);

    public List<Element> getAll();

    public Element findById( Long id);
}
