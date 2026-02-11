
PN = "librepo"
PE = "0"
PV = "1.18.0"
PR = "6.el10_0"
PACKAGES = "librepo python3-librepo librepo-devel"


URI_librepo = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/librepo-1.18.0-6.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:librepo = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libc.so.6(GLIBC_2.33)(64bit) ( ) libcurl.so.4()(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) librpmio.so.10()(64bit) ( ) libcurl(x86-64) ( >=  7.52.0)"
RPROVIDES:librepo = "librepo.so.0()(64bit) ( ) librepo(x86-64) ( =  1.18.0-6.el10_0) librepo ( =  1.18.0-6.el10_0)"

URI_python3-librepo = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-librepo-1.18.0-6.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-librepo = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libpython3.12.so.1.0()(64bit) ( ) librepo.so.0()(64bit) ( ) python(abi) ( =  3.12) librepo(x86-64) ( =  1.18.0-6.el10_0)"
RPROVIDES:python3-librepo = "python-librepo ( =  1.18.0-6.el10_0) python3-librepo ( =  1.18.0-6.el10_0) python3-librepo(x86-64) ( =  1.18.0-6.el10_0) python3.12-librepo ( =  1.18.0-6.el10_0)"

URI_librepo-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/librepo-devel-1.18.0-6.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:librepo-devel = "/usr/bin/pkg-config ( ) pkgconfig(glib-2.0) ( ) pkgconfig(libxml-2.0) ( ) pkgconfig(openssl) ( ) pkgconfig(libcurl) ( ) librepo.so.0()(64bit) ( ) librepo(x86-64) ( =  1.18.0-6.el10_0)"
RPROVIDES:librepo-devel = "pkgconfig(librepo) ( =  1.18.0) librepo-devel ( =  1.18.0-6.el10_0) librepo-devel(x86-64) ( =  1.18.0-6.el10_0)"
