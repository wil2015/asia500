package com.asia.frete.relatoriodefretev03;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class containers implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private int nr_fatura;
   private java.util.Date dt_eta;
   private java.lang.Boolean flag_fatura;
   private float nota_fiscal;

   public containers()
   {
   }

   public int getNr_fatura()
   {
      return this.nr_fatura;
   }

   public void setNr_fatura(int nr_fatura)
   {
      this.nr_fatura = nr_fatura;
   }

   public java.util.Date getDt_eta()
   {
      return this.dt_eta;
   }

   public void setDt_eta(java.util.Date dt_eta)
   {
      this.dt_eta = dt_eta;
   }

   public java.lang.Boolean getFlag_fatura()
   {
      return this.flag_fatura;
   }

   public void setFlag_fatura(java.lang.Boolean flag_fatura)
   {
      this.flag_fatura = flag_fatura;
   }

   public float getNota_fiscal()
   {
      return this.nota_fiscal;
   }

   public void setNota_fiscal(float nota_fiscal)
   {
      this.nota_fiscal = nota_fiscal;
   }

   public containers(int nr_fatura, java.util.Date dt_eta,
         java.lang.Boolean flag_fatura, float nota_fiscal)
   {
      this.nr_fatura = nr_fatura;
      this.dt_eta = dt_eta;
      this.flag_fatura = flag_fatura;
      this.nota_fiscal = nota_fiscal;
   }

}