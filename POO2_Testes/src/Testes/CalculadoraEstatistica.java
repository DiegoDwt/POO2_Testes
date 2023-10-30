package Testes;

import java.util.*;

public class CalculadoraEstatistica {
	

	    public double Media(List<Double> numbers) {
	        double sum = 0;
	        for (double number : numbers) {
	            sum += number;
	        }
	        return sum / numbers.size();
	    }

	    public double Moda(List<Double> numbers) {
	        Map<Double, Integer> frequencia = new HashMap<>();
	        for (double number : numbers) {
	            frequencia.put(number, frequencia.getOrDefault(number, 0) + 1);
	        }
	        double moda = numbers.get(0);
	        int maxCount = 0;
	        for (Map.Entry<Double, Integer> entry : frequencia.entrySet()) {
	            if (entry.getValue() > maxCount) {
	                maxCount = entry.getValue();
	                moda = entry.getKey();
	            }
	        }
	        return moda;
	    }

	    public double Mediana(List<Double> numbers) {
	        Collections.sort(numbers);
	        int mediana = numbers.size() / 2;
	        return numbers.size() % 2 == 1 ? numbers.get(mediana) : (numbers.get(mediana - 1) + numbers.get(mediana)) / 2.0;
	    }

	    public double Variancia
	    (List<Double> numbers) {
	        double media = Media(numbers);
	        double temp = 0;
	        for (double number : numbers) {
	            temp += (media - number) * (media - number);
	        }
	        return temp / (numbers.size() - 1);
	    }

	    public double DesvioPadrao(List<Double> numbers) {
	        return Math.sqrt(Variancia(numbers));
	    }


}
