
PN = "libabigail"
PE = "0"
PV = "2.6"
PR = "1.el10"
PACKAGES = "libabigail libabigail-devel libabigail-doc"


URI_libabigail = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libabigail-2.6-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libabigail = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libm.so.6()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.5)(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libbpf.so.1()(64bit) ( ) libelf.so.1()(64bit) ( ) libelf.so.1(ELFUTILS_1.0)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libbpf.so.1(LIBBPF_0.0.1)(64bit) ( ) libbpf.so.1(LIBBPF_0.1.0)(64bit) ( ) libbpf.so.1(LIBBPF_0.3.0)(64bit) ( ) libbpf.so.1(LIBBPF_0.6.0)(64bit) ( ) libctf.so.0()(64bit) ( ) libctf.so.0(LIBCTF_1.0)(64bit) ( ) libctf.so.0(LIBCTF_1.1)(64bit) ( ) libctf.so.0(LIBCTF_1.2)(64bit) ( ) libdw.so.1()(64bit) ( ) libdw.so.1(ELFUTILS_0.122)(64bit) ( ) libdw.so.1(ELFUTILS_0.126)(64bit) ( ) libdw.so.1(ELFUTILS_0.143)(64bit) ( ) libdw.so.1(ELFUTILS_0.148)(64bit) ( ) libdw.so.1(ELFUTILS_0.157)(64bit) ( ) libdw.so.1(ELFUTILS_0.159)(64bit) ( ) libdw.so.1(ELFUTILS_0.160)(64bit) ( ) libelf.so.1(ELFUTILS_1.1.1)(64bit) ( ) libelf.so.1(ELFUTILS_1.2)(64bit) ( ) libelf.so.1(ELFUTILS_1.5)(64bit) ( ) libelf.so.1(ELFUTILS_1.6)(64bit) ( ) libxml2.so.2(LIBXML2_2.5.0)(64bit) ( ) libxml2.so.2(LIBXML2_2.5.7)(64bit) ( ) libxml2.so.2(LIBXML2_2.7.3)(64bit) ( )"
RPROVIDES:libabigail = "libabigail.so.5()(64bit) ( ) libabigail ( =  2.6-1.el10) libabigail(x86-64) ( =  2.6-1.el10)"

URI_libabigail-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libabigail-devel-2.6-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libabigail-devel = "/usr/bin/pkg-config ( ) libabigail.so.5()(64bit) ( ) libabigail(x86-64) ( =  2.6-1.el10) pkgconfig(libxml-2.0) ( >=  2.6.22)"
RPROVIDES:libabigail-devel = "libabigail-devel ( =  2.6-1.el10) libabigail-devel(x86-64) ( =  2.6-1.el10) pkgconfig(libabigail) ( =  2.6)"

URI_libabigail-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libabigail-doc-2.6-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libabigail-doc = ""
RPROVIDES:libabigail-doc = "libabigail-doc ( =  2.6-1.el10) libabigail-doc(x86-64) ( =  2.6-1.el10)"
