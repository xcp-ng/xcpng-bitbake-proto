
PN = "qpdf"
PE = "0"
PV = "11.8.0"
PR = "5.el10"
PACKAGES = "qpdf-libs qpdf qpdf-devel qpdf-doc"


URI_qpdf-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qpdf-libs-11.8.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qpdf-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libz.so.1()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) libgnutls.so.30()(64bit) ( ) libgnutls.so.30(GNUTLS_3_4)(64bit) ( ) libjpeg.so.62()(64bit) ( ) libjpeg.so.62(LIBJPEG_6.2)(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_3)(64bit) ( )"
RPROVIDES:qpdf-libs = "libqpdf.so.29()(64bit) ( ) libqpdf.so.29(LIBQPDF_29)(64bit) ( ) qpdf-libs ( =  11.8.0-5.el10) qpdf-libs(x86-64) ( =  11.8.0-5.el10)"

URI_qpdf = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qpdf-11.8.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qpdf = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libqpdf.so.29()(64bit) ( ) libqpdf.so.29(LIBQPDF_29)(64bit) ( ) qpdf-libs(x86-64) ( =  11.8.0-5.el10)"
RPROVIDES:qpdf = "qpdf ( =  11.8.0-5.el10) qpdf(x86-64) ( =  11.8.0-5.el10)"

URI_qpdf-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qpdf-devel-11.8.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qpdf-devel = "/usr/bin/pkg-config ( ) pkgconfig(zlib) ( ) pkgconfig(libjpeg) ( ) pkgconfig(gnutls) ( ) libqpdf.so.29()(64bit) ( ) qpdf-libs(x86-64) ( =  11.8.0-5.el10)"
RPROVIDES:qpdf-devel = "pkgconfig(libqpdf) ( =  11.8.0) qpdf-devel ( =  11.8.0-5.el10) qpdf-devel(x86-64) ( =  11.8.0-5.el10)"

URI_qpdf-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qpdf-doc-11.8.0-5.el10.noarch.rpm;unpack=0"
RDEPENDS:qpdf-doc = "qpdf-libs ( =  11.8.0-5.el10)"
RPROVIDES:qpdf-doc = "qpdf-doc ( =  11.8.0-5.el10)"
