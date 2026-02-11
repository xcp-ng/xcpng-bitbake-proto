
PN = "swig"
PE = "0"
PV = "4.3.0"
PR = "3.el10"
PACKAGES = "swig swig-doc swig-gdb"


URI_swig = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/swig-4.3.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:swig = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libpcre2-8.so.0()(64bit) ( )"
RPROVIDES:swig = "swig ( =  4.3.0-3.el10) swig(x86-64) ( =  4.3.0-3.el10)"

URI_swig-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/swig-doc-4.3.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:swig-doc = ""
RPROVIDES:swig-doc = "swig-doc ( =  4.3.0-3.el10)"

URI_swig-gdb = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/swig-gdb-4.3.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:swig-gdb = "swig ( )"
RPROVIDES:swig-gdb = "swig-gdb ( =  4.3.0-3.el10) swig-gdb(x86-64) ( =  4.3.0-3.el10)"
