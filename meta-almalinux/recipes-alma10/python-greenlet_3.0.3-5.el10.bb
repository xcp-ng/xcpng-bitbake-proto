
PN = "python-greenlet"
PE = "0"
PV = "3.0.3"
PR = "5.el10"
PACKAGES = "python3-greenlet python3-greenlet-devel"


URI_python3-greenlet = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-greenlet-3.0.3-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-greenlet = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.7)(64bit) ( ) python(abi) ( =  3.12)"
RPROVIDES:python3-greenlet = "python-greenlet ( =  3.0.3-5.el10) python3-greenlet ( =  3.0.3-5.el10) python3-greenlet(x86-64) ( =  3.0.3-5.el10) python3.12-greenlet ( =  3.0.3-5.el10) python3.12dist(greenlet) ( =  3.0.3) python3dist(greenlet) ( =  3.0.3)"

URI_python3-greenlet-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-greenlet-devel-3.0.3-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-greenlet-devel = "python3-greenlet(x86-64) ( =  3.0.3-5.el10)"
RPROVIDES:python3-greenlet-devel = "python-greenlet-devel ( =  3.0.3-5.el10) python3-greenlet-devel ( =  3.0.3-5.el10) python3-greenlet-devel(x86-64) ( =  3.0.3-5.el10) python3.12-greenlet-devel ( =  3.0.3-5.el10)"
