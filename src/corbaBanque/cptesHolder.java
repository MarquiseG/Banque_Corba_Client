package corbaBanque;


/**
* corbaBanque/cptesHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Banque.idl
* dimanche 10 septembre 2017 10 h 00 CEST
*/

public final class cptesHolder implements org.omg.CORBA.portable.Streamable
{
  public corbaBanque.Compte value[] = null;

  public cptesHolder ()
  {
  }

  public cptesHolder (corbaBanque.Compte[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = corbaBanque.cptesHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    corbaBanque.cptesHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return corbaBanque.cptesHelper.type ();
  }

}
