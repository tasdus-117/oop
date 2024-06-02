package hus.oop.finalexam.rootsolver;

public class RootFindingTestDrive {
    public static void main(String[] args) {
        /*
        TODO

        Chạy các hàm test để test chương trình.
        Lưu kết quả chạy chương trình vào file text có tên <TenSinhVien_MaSinhVien_RootFinding>.txt
        (ví dụ, NguyenVanA_123456_RootFinding.txt).
        Nén tất cả các file source code và file kết quả chạy chương trình vào file zip có tên
        <TenSinhVien_MaSinhVien_RootFinding>.zip (ví dụ, NguyenVanA_123456_RootFinding.txt), và nộp bài
        lên classroom.
        */
        testRootSolver();
    }

    public static void testRootSolver() {
        /*
         TODO

         - Viết chương trình tìm nghiệm của hàm (sin(x).x - 3) theo các phương pháp đã cho (Bisection, Newton-Raphson, Secant) sử dụng
           UnivariateRealRootFinding. Các phương pháp tìm nghiệm của thể thay đổi ở thời gian chạy chương trình.
         - In ra phương pháp sử dụng, hàm và nghiệm của hàm tìm được.
         */
        AbstractFunction function = new UnivariateRealFunction();
        double tolerance = 1e-6;
        int maxIterations = 100;
        RootSolver bisectionSolver = new BisectionSolver(tolerance, maxIterations);
        RootSolver newtonRaphsonSolver = new NewtonRaphsonSolver(tolerance, maxIterations);
        RootSolver secantSolver = new SecantSolver(tolerance, maxIterations);
        double lower = 2;
        double upper = 3;
        double resBisec = bisectionSolver.solve(function, lower, upper);
        double resNewton = newtonRaphsonSolver.solve(function, lower, upper);
        double resSecant = secantSolver.solve(function, lower, upper);
        System.out.println("Kết quả tìm nghiệm bằng phương pháp chia đôi (Bisection): " + resBisec);
        System.out.println("Kết quả tìm nghiệm bằng phương pháp Newton-Raphson: " + resNewton);
        System.out.println("Kết quả tìm nghiệm bằng phương pháp Secant: " + resSecant);
    }
}
