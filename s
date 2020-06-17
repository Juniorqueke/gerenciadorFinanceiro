[1mdiff --git a/gerenciadorfinanceiro/gerenciadorfinanceiro/src/main/java/com/senai/gerenciadorfinanceiro/controller/BoletoController.java b/gerenciadorfinanceiro/gerenciadorfinanceiro/src/main/java/com/senai/gerenciadorfinanceiro/controller/BoletoController.java[m
[1mindex 97b17f2..fef7804 100644[m
[1m--- a/gerenciadorfinanceiro/gerenciadorfinanceiro/src/main/java/com/senai/gerenciadorfinanceiro/controller/BoletoController.java[m
[1m+++ b/gerenciadorfinanceiro/gerenciadorfinanceiro/src/main/java/com/senai/gerenciadorfinanceiro/controller/BoletoController.java[m
[36m@@ -6,9 +6,9 @@[m [mimport org.springframework.web.bind.annotation.RequestMapping;[m
 @Controller[m
 public class BoletoController {[m
 [m
[31m-    @RequestMapping ("/boletos/novo")[m
[32m+[m[32m    @RequestMapping("/boletos/novo")[m
     public String novo() {[m
         return "CadastrodeBoleto";[m
     }[m
[31m-    [m
[32m+[m
 }[m
\ No newline at end of file[m
[1mdiff --git a/gerenciadorfinanceiro/gerenciadorfinanceiro/src/main/resources/templates/CadastrodeBoleto.html b/gerenciadorfinanceiro/gerenciadorfinanceiro/src/main/resources/templates/CadastrodeBoleto.html[m
[1mindex 9cd5a3a..df1b93e 100644[m
[1m--- a/gerenciadorfinanceiro/gerenciadorfinanceiro/src/main/resources/templates/CadastrodeBoleto.html[m
[1m+++ b/gerenciadorfinanceiro/gerenciadorfinanceiro/src/main/resources/templates/CadastrodeBoleto.html[m
[36m@@ -8,7 +8,68 @@[m
 </head>[m
 [m
 <body>[m
[31m-    <h1>Cadastro de Boletos</h1>[m
[32m+[m[32m    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">[m
[32m+[m[32m    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">[m
[32m+[m
[32m+[m[32m    <form>[m
[32m+[m[32m        <div class="form-group row">[m
[32m+[m[32m            <label for="descricao" class="col-4 col-form-label">Descrição</label>[m
[32m+[m[32m            <div class="col-8">[m
[32m+[m[32m                <div class="input-group">[m
[32m+[m[32m                    <div class="input-group-prepend">[m
[32m+[m[32m                        <div class="input-group-text">[m
[32m+[m[32m                            <i class="fa fa-book"></i>[m
[32m+[m[32m                        </div>[m
[32m+[m[32m                    </div>[m
[32m+[m[32m                    <input id="descricao" name="descricao" type="text" required="required" class="form-control">[m
[32m+[m[32m                </div>[m
[32m+[m[32m            </div>[m
[32m+[m[32m        </div>[m
[32m+[m[32m        <div class="form-group row">[m
[32m+[m[32m            <label for="dataVencimento" class="col-4 col-form-label">Data Vencimento</label>[m
[32m+[m[32m            <div class="col-8">[m
[32m+[m[32m                <div class="input-group">[m
[32m+[m[32m                    <div class="input-group-prepend">[m
[32m+[m[32m                        <div class="input-group-text">[m
[32m+[m[32m                            <i class="fa fa-calendar"></i>[m
[32m+[m[32m                        </div>[m
[32m+[m[32m                    </div>[m
[32m+[m[32m                    <input id="dataVencimento" name="dataVencimento" type="text" required="required" class="form-control">[m
[32m+[m[32m                </div>[m
[32m+[m[32m            </div>[m
[32m+[m[32m        </div>[m
[32m+[m[32m        <div class="form-group row">[m
[32m+[m[32m            <label for="valor" class="col-4 col-form-label">Valor</label>[m
[32m+[m[32m            <div class="col-8">[m
[32m+[m[32m                <div class="input-group">[m
[32m+[m[32m                    <div class="input-group-prepend">[m
[32m+[m[32m                        <div class="input-group-text">[m
[32m+[m[32m                            <i class="fa fa-money"></i>[m
[32m+[m[32m                        </div>[m
[32m+[m[32m                    </div>[m
[32m+[m[32m                    <input id="valor" name="valor" type="text" required="required" class="form-control">[m
[32m+[m[32m                </div>[m
[32m+[m[32m            </div>[m
[32m+[m[32m        </div>[m
[32m+[m[32m        <div class="form-group row">[m
[32m+[m[32m            <label for="status" class="col-4 col-form-label">Status</label>[m
[32m+[m[32m            <div class="col-8">[m
[32m+[m[32m                <div class="input-group">[m
[32m+[m[32m                    <input id="status" name="status" type="text" required="required" class="form-control">[m
[32m+[m[32m                    <div class="input-group-append">[m
[32m+[m[32m                        <div class="input-group-text">[m
[32m+[m[32m                            <i class="fa fa-hourglass-start"></i>[m
[32m+[m[32m                        </div>[m
[32m+[m[32m                    </div>[m
[32m+[m[32m                </div>[m
[32m+[m[32m            </div>[m
[32m+[m[32m        </div>[m
[32m+[m[32m        <div class="form-group row">[m
[32m+[m[32m            <div class="offset-4 col-8">[m
[32m+[m[32m                <button name="submit" type="submit" class="btn btn-primary">Submit</button>[m
[32m+[m[32m            </div>[m
[32m+[m[32m        </div>[m
[32m+[m[32m    </form>[m
     <script src="/js/bootstrap.min.js"></script>[m
 </body>[m
 [m
