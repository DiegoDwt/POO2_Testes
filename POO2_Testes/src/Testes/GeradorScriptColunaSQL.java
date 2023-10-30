package Testes;

public class GeradorScriptColunaSQL {
	
	    public String gerarScript(String columnName, String dataType, boolean notNull, boolean autoIncrement) {
	        String script = "`" + columnName + "` " + dataType;
	        if (notNull) {
	            script += " NOT NULL";
	        }
	        if (autoIncrement) {
	            script += " AUTO_INCREMENT";
	        }
	        return script + ",";
	    }
	

}

