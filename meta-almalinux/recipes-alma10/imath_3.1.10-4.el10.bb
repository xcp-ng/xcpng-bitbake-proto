
PN = "imath"
PE = "0"
PV = "3.1.10"
PR = "4.el10"
PACKAGES = "imath python3-imath imath-devel"


URI_imath = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/imath-3.1.10-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:imath = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( )"
RPROVIDES:imath = "libImath-3_1.so.29()(64bit) ( ) imath(x86-64) ( =  3.1.10-4.el10) imath ( =  3.1.10-4.el10)"

URI_python3-imath = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-imath-3.1.10-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-imath = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libpython3.12.so.1.0()(64bit) ( ) libc.so.6(GLIBC_2.32)(64bit) ( ) libImath-3_1.so.29()(64bit) ( ) libboost_python312.so.1.83.0()(64bit) ( ) python(abi) ( =  3.12) imath(x86-64) ( =  3.1.10-4.el10)"
RPROVIDES:python3-imath = "libPyImath_Python3_12-3_1.so.29()(64bit) ( ) python-imath ( =  3.1.10-4.el10) python3-imath ( =  3.1.10-4.el10) python3-imath(x86-64) ( =  3.1.10-4.el10) python3.12-imath ( =  3.1.10-4.el10)"

URI_imath-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/imath-devel-3.1.10-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:imath-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) boost-devel ( ) python3-devel ( ) libImath-3_1.so.29()(64bit) ( ) libPyImath_Python3_12-3_1.so.29()(64bit) ( ) imath(x86-64) ( =  3.1.10-4.el10) python3-imath(x86-64) ( =  3.1.10-4.el10)"
RPROVIDES:imath-devel = "cmake(Imath) ( =  3.1.10) cmake(imath) ( =  3.1.10) imath-devel ( =  3.1.10-4.el10) imath-devel(x86-64) ( =  3.1.10-4.el10) pkgconfig(Imath) ( =  3.1.10) pkgconfig(PyImath) ( =  3.1.10)"
