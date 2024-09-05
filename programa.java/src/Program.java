import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Departamento de trabalho ");
		String departmentName = sc.nextLine();
		System.out.print("Nome: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salario ");
		double baseSalary = sc.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departamento(departmentName));
		
		System.out.print("Houve quantos contratos de trabalho? :");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Informe o contrato #1" + i + " data:");
			System.out.print("Data (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Valor da Hora: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Tempo de serviço em horas: ");
			int hours = sc.nextInt();
			HorasContratada contract = new HorasContratada(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Informe o mês e o ano : ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Nome " + worker.getName());
		System.out.println("Departamento: " + worker.getDepartment().getName());
		System.out.println("Mes e Ano do contrato : " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		sc.close();
	}
}
