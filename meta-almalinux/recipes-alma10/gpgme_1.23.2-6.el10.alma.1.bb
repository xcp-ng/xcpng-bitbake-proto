
PN = "gpgme"
PE = "0"
PV = "1.23.2"
PR = "6.el10.alma.1"
PACKAGES = "gpgme python3-gpg gpgmepp gpgme-devel gpgmepp-devel qgpgme-common-devel qgpgme-qt6 qgpgme-qt6-devel"


URI_gpgme = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/gpgme-1.23.2-6.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:gpgme = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libgpg-error.so.0()(64bit) ( ) libgpg-error.so.0(GPG_ERROR_1.0)(64bit) ( ) libassuan.so.0()(64bit) ( ) libassuan.so.0(LIBASSUAN_1.0)(64bit) ( ) gnupg2 ( >=  2.2.24)"
RPROVIDES:gpgme = "libgpgme.so.11()(64bit) ( ) libgpgme.so.11(GPGME_1.0)(64bit) ( ) libgpgme.so.11(GPGME_1.1)(64bit) ( ) gpgme(x86-64) ( =  1.23.2-6.el10.alma.1) gpgme ( =  1.23.2-6.el10.alma.1)"

URI_python3-gpg = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-gpg-1.23.2-6.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-gpg = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libgpgme.so.11()(64bit) ( ) libgpgme.so.11(GPGME_1.0)(64bit) ( ) libgpgme.so.11(GPGME_1.1)(64bit) ( ) python(abi) ( =  3.12) gpgme(x86-64) ( =  1.23.2-6.el10.alma.1)"
RPROVIDES:python3-gpg = "python-gpg ( =  1.23.2-6.el10.alma.1) python3-gpg ( =  1.23.2-6.el10.alma.1) python3-gpg(x86-64) ( =  1.23.2-6.el10.alma.1) python3.12-gpg ( =  1.23.2-6.el10.alma.1) python3.12dist(gpg) ( =  1.23.2) python3dist(gpg) ( =  1.23.2)"

URI_gpgmepp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gpgmepp-1.23.2-6.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:gpgmepp = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libgpgme.so.11()(64bit) ( ) libgpgme.so.11(GPGME_1.0)(64bit) ( ) libgpgme.so.11(GPGME_1.1)(64bit) ( ) libassuan.so.0()(64bit) ( ) gpgme(x86-64) ( =  1.23.2-6.el10.alma.1)"
RPROVIDES:gpgmepp = "libgpgmepp.so.6()(64bit) ( ) gpgme-pp ( =  1.23.2-6.el10.alma.1) gpgme-pp(x86-64) ( =  1.23.2-6.el10.alma.1) gpgmepp ( =  1.23.2-6.el10.alma.1) gpgmepp(x86-64) ( =  1.23.2-6.el10.alma.1)"

URI_gpgme-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gpgme-devel-1.23.2-6.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:gpgme-devel = "/usr/bin/pkg-config ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) pkgconfig(glib-2.0) ( ) /usr/bin/sh ( ) libgpgme.so.11()(64bit) ( ) libgpgme.so.11(GPGME_1.0)(64bit) ( ) libgpgme.so.11(GPGME_1.1)(64bit) ( ) pkgconfig(gpg-error) ( ) libassuan.so.0()(64bit) ( ) libgpg-error.so.0()(64bit) ( ) libgpg-error.so.0(GPG_ERROR_1.0)(64bit) ( ) pkgconfig(libassuan) ( ) libassuan.so.0(LIBASSUAN_1.0)(64bit) ( ) gpgme(x86-64) ( =  1.23.2-6.el10.alma.1) libgpg-error-devel(x86-64) ( >=  1.36)"
RPROVIDES:gpgme-devel = "gpgme-devel ( =  1.23.2-6.el10.alma.1) gpgme-devel(x86-64) ( =  1.23.2-6.el10.alma.1) pkgconfig(gpgme) ( =  1.23.2) pkgconfig(gpgme-glib) ( =  1.23.2)"

URI_gpgmepp-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gpgmepp-devel-1.23.2-6.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:gpgmepp-devel = "cmake-filesystem(x86-64) ( ) gpgme-devel(x86-64) ( ) libgpgmepp.so.6()(64bit) ( ) gpgmepp(x86-64) ( =  1.23.2-6.el10.alma.1)"
RPROVIDES:gpgmepp-devel = "cmake(Gpgmepp) ( =  1.23.2) cmake(gpgmepp) ( =  1.23.2) gpgme-pp-devel ( =  1.23.2-6.el10.alma.1) gpgme-pp-devel(x86-64) ( =  1.23.2-6.el10.alma.1) gpgmepp-devel ( =  1.23.2-6.el10.alma.1) gpgmepp-devel(x86-64) ( =  1.23.2-6.el10.alma.1)"

URI_qgpgme-common-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qgpgme-common-devel-1.23.2-6.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:qgpgme-common-devel = "gpgmepp-devel(x86-64) ( )"
RPROVIDES:qgpgme-common-devel = "qgpgme-common-devel ( =  1.23.2-6.el10.alma.1) qgpgme-common-devel(x86-64) ( =  1.23.2-6.el10.alma.1)"

URI_qgpgme-qt6 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qgpgme-qt6-1.23.2-6.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:qgpgme-qt6 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libm.so.6()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libQt6Core.so.6()(64bit) ( ) libQt6Core.so.6(Qt_6)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libgpgme.so.11()(64bit) ( ) libassuan.so.0()(64bit) ( ) libQt6Core.so.6(Qt_6.7)(64bit) ( ) libgpg-error.so.0()(64bit) ( ) libgpg-error.so.0(GPG_ERROR_1.0)(64bit) ( ) libgpgmepp.so.6()(64bit) ( ) gpgmepp(x86-64) ( =  1.23.2-6.el10.alma.1)"
RPROVIDES:qgpgme-qt6 = "libqgpgmeqt6.so.15()(64bit) ( ) qgpgme-qt6(x86-64) ( =  1.23.2-6.el10.alma.1) qgpgme-qt6 ( =  1.23.2-6.el10.alma.1)"

URI_qgpgme-qt6-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qgpgme-qt6-devel-1.23.2-6.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:qgpgme-qt6-devel = "cmake-filesystem(x86-64) ( ) libqgpgmeqt6.so.15()(64bit) ( ) qgpgme-common-devel(x86-64) ( ) qgpgme-qt6(x86-64) ( =  1.23.2-6.el10.alma.1)"
RPROVIDES:qgpgme-qt6-devel = "cmake(QGpgmeQt6) ( =  1.23.2) cmake(qgpgmeqt6) ( =  1.23.2) qgpgme-qt6-devel ( =  1.23.2-6.el10.alma.1) qgpgme-qt6-devel(x86-64) ( =  1.23.2-6.el10.alma.1)"
