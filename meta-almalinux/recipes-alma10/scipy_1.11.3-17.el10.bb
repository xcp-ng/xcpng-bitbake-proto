
PN = "scipy"
PE = "0"
PV = "1.11.3"
PR = "17.el10"
PACKAGES = "python3-scipy python3-scipy-tests"


URI_python3-scipy = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-scipy-1.11.3-17.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-scipy = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.5)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) ( ) libm.so.6(GLIBC_2.35)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.7)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.13)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.17)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.2)(64bit) ( ) libgcc_s.so.1(GCC_4.0.0)(64bit) ( ) libgfortran.so.5()(64bit) ( ) libm.so.6(GLIBC_2.23)(64bit) ( ) libgfortran.so.5(GFORTRAN_8)(64bit) ( ) libmvec.so.1()(64bit) ( ) python3-numpy ( ) libflexiblas.so.3()(64bit) ( ) python3-f2py ( ) libmvec.so.1(GLIBC_2.22)(64bit) ( ) python(abi) ( =  3.12) python3.12dist(numpy) ( with  (REL))"
RPROVIDES:python3-scipy = "bundled(Faddeeva) ( ) bundled(LAPJVsp) ( ) bundled(biasedurn) ( ) bundled(boost-math) ( ) bundled(id) ( ) bundled(python3-pep440) ( ) bundled(SuperLU) ( =  5.2.0) bundled(arpack) ( =  3.3.0) bundled(coin-or-HiGHS) ( =  1.2) bundled(l-bfgs-b) ( =  3.0) bundled(python3-decorator) ( =  4.0.5) bundled(python3-pypocketfft) ( =  bf2c431c21213b7c5e23c2f542009b0bd3ec1445) bundled(qhull) ( =  2019.1) bundled(unuran) ( =  1.8.1) python-scipy ( =  1.11.3-17.el10) python3-scipy ( =  1.11.3-17.el10) python3-scipy(x86-64) ( =  1.11.3-17.el10) python3.12-scipy ( =  1.11.3-17.el10) python3.12dist(scipy) ( =  1.11.3) python3dist(scipy) ( =  1.11.3)"

URI_python3-scipy-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-scipy-tests-1.11.3-17.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-scipy-tests = "/usr/bin/python3 ( ) python3-pytest ( ) python(abi) ( =  3.12) python3-scipy ( =  1.11.3-17.el10)"
RPROVIDES:python3-scipy-tests = "python-scipy-tests ( =  1.11.3-17.el10) python3-scipy-tests ( =  1.11.3-17.el10) python3-scipy-tests(x86-64) ( =  1.11.3-17.el10) python3.12-scipy-tests ( =  1.11.3-17.el10)"
